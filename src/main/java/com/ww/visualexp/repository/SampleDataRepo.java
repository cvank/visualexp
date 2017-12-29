/**
 * 
 */
package com.ww.visualexp.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ww.visualexp.entity.Transaction;
import com.ww.visualexp.entity.TransactionSource;
import com.ww.visualexp.entity.User;
import com.ww.visualexp.entity.UserGroup;

import rx.Observable;

/**
 * @author chandrashekarv
 *
 */
@Component
public class SampleDataRepo {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserGroupRepository userGroupRepository;

	@Autowired
	TransactionRepository transactionRepository;

	@Autowired
	TransactionSourceRepository transactionSourceRepository;

	public Object persist() {

		try {
			List<User> users = userRepository.save(users());
			List<UserGroup> groups = userGroupRepository.save(groups());
			List<TransactionSource> transactionSources = transactionSourceRepository.save(transactionSources());
			List<Transaction> transactions = transactionRepository.save(transactions());
			return new DynamicTuple(users, groups, transactions, transactionSources, null);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to persist sample data", e);
		}

	}

	public List<User> users() throws IOException {
		List<User> users = new ArrayList<>();

		Observable<List<String>> fileObservable = fileObservable("users.txt");
		fileObservable.flatMapIterable(lines -> lines).filter(line -> line != null).map(this::createUser)
				.subscribe(e -> users.add(e));

		return users;
	}

	private User createUser(final String line) {
		UserBuilder builder = new UserBuilder();
		String[] words = line.split(",");
		return builder.withFirstName(words[0]).withLastName(words[1]).withAddress(words[2]).build();

	}

	private Observable<List<String>> fileObservable(final String fileName) throws IOException {
		return Observable
				.just(Files.readAllLines(Paths.get(getClass().getClassLoader().getResource(fileName).getPath())))
				.asObservable();
	}

	public List<UserGroup> groups() throws IOException {
		List<UserGroup> groups = new ArrayList<>();
		Set<User> users = new HashSet<>(userRepository.findAll());
		Observable<List<String>> fileObservable = fileObservable("groups.txt");
		fileObservable.flatMapIterable(lines -> lines).filter(line -> line != null)
				.map(line -> createGroup(line, users)).subscribe(e -> groups.add(e));
		return groups;
	}

	private UserGroup createGroup(String line, Set<User> users) {
		UsergroupBuilder builder = new UsergroupBuilder();
		String[] words = line.split(",");
		return builder.withName(words[0]).withUsers(users).build();
	}

	public List<TransactionSource> transactionSources() {
		try {
			List<TransactionSource> transactionSources = new ArrayList<>();

			Observable<List<String>> fileObservable = fileObservable("tsources.txt");
			fileObservable.flatMapIterable(lines -> lines).filter(line -> line != null)
					.map(this::createTransactionSource).subscribe(e -> transactionSources.add(e));
			transactionSourceRepository.save(transactionSources);
			return transactionSources;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to persist sample data", e);
		}
	}

	private TransactionSource createTransactionSource(final String line) {
		TransactionSourceBuilder builder = new TransactionSourceBuilder();
		String[] words = line.split(",");
		return builder.withName(words[0]).withReference(words[1]).build();

	}

	public List<Transaction> transactions() {
		List<Transaction> transactions = new ArrayList<>();
		TransactionBuilder builder = new TransactionBuilder();
		List<User> users = userRepository.findAll();
		List<TransactionSource> transactionSources = transactionSourceRepository.findAll();

		for (byte b = 1; b < 100; b++)
			transactions.add(builder.withAmount(getRandomAmount()).withRandomDate()
					.withUserId(users.get(getRandomInt(users.size())).getId()).withType(getRandomType())
					.withSource(transactionSources.get(getRandomInt(transactionSources.size())).getId()).build());

		transactionRepository.save(transactions);
		return transactions;
	}

	private String getRandomType() {

		if (random.nextInt(10) % 2 == 0)
			return "E";

		return "I";
	}

	private double getRandomAmount() {
		return getRandomInt(100000);
	}

	Random random = new Random();

	private int getRandomInt(int size) {
		return random.nextInt(size);
	}

	public static class UserBuilder {
		private String firstName;

		private String lastName;

		private String address;

		public UserBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder withAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User();
			user.setAddress(address);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			return user;
		}

	}

	public static class UsergroupBuilder {
		private String name;

		private Set<User> users;

		public UsergroupBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public UsergroupBuilder withUsers(Set<User> users) {
			this.users = users;
			return this;
		}

		public UserGroup build() {
			UserGroup group = new UserGroup();
			group.setName(name);
			group.setUsers(users);
			return group;
		}

	}

	public static class TransactionSourceBuilder {
		private String name;

		private String reference;

		private Map<String, Object> attributes;

		public TransactionSourceBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public TransactionSourceBuilder withReference(final String reference) {
			this.reference = reference;
			return this;
		}

		public TransactionSource build() {
			TransactionSource transactionSource = new TransactionSource();
			transactionSource.setName(name);
			transactionSource.setReference(reference);
			return transactionSource;
		}

	}

	public static class TransactionBuilder {
		private Date date;

		private String userId;

		private double amount;

		private String type;

		private String source;

		public TransactionBuilder withDate(Date date) {
			this.date = date;
			return this;
		}

		public TransactionBuilder withRandomDate() {
			this.date = getRandomeDate();
			return this;
		}

		public TransactionBuilder withUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public TransactionBuilder withAmount(double amount) {
			this.amount = amount;
			return this;
		}

		public TransactionBuilder withType(String type) {
			this.type = type;
			return this;
		}

		public TransactionBuilder withSource(String source) {
			this.source = source;
			return this;
		}

		public Transaction build() {
			Transaction transaction = new Transaction();
			transaction.setAmount(amount);
			transaction.setUserId(userId);
			transaction.setType(type);
			transaction.setDate(date);
			transaction.setSourceId(source);
			return transaction;

		}

		public Date getRandomeDate() {
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.MONTH, getRandomIntLessThan(10));
			calendar.set(Calendar.DATE, getRandomIntLessThan(30));
			return calendar.getTime();
		}

		private int getRandomIntLessThan(int bound) {
			Random random = new Random();
			return random.nextInt(bound);
		}

	}

	public static class DynamicTuple<T1, T2, T3, T4, T5> {

		private T1 t1;
		private T2 t2;
		private T3 t3;
		private T4 t4;
		private T5 t5;

		public DynamicTuple(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
			super();
			this.t1 = t1;
			this.t2 = t2;
			this.t3 = t3;
			this.t4 = t4;
			this.t5 = t5;
		}

		public T1 getT1() {
			return t1;
		}

		public void setT1(T1 t1) {
			this.t1 = t1;
		}

		public T2 getT2() {
			return t2;
		}

		public void setT2(T2 t2) {
			this.t2 = t2;
		}

		public T3 getT3() {
			return t3;
		}

		public void setT3(T3 t3) {
			this.t3 = t3;
		}

		public T4 getT4() {
			return t4;
		}

		public void setT4(T4 t4) {
			this.t4 = t4;
		}

		public T5 getT5() {
			return t5;
		}

		public void setT5(T5 t5) {
			this.t5 = t5;
		}

	}

}
