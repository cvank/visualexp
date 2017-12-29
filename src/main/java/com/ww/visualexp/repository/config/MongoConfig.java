/**
 * 
 */
package com.ww.visualexp.repository.config;

import static java.util.Collections.singletonList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * @author chandrashekarv
 *
 */
@Configuration
public class MongoConfig {

	// @Value("${spring.data.mongodb.uri}")
	private String uri;

	private String host = "localhost";

	private String username = "chandrashekarv";

	private String password = "Admin@123";

	private int port = 27017;

	private String dbName = "visualexp";

	public @Bean MongoDbFactory mongoDbFactory() {
		return new SimpleMongoDbFactory(new MongoClient(), dbName);
	}

	public @Bean MongoClient mongoClient() {
		return new MongoClient(singletonList(new ServerAddress(host, port)),
				singletonList(MongoCredential.createCredential(username, dbName, password.toCharArray())));
	}

	public @Bean MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}

}
