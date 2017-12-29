/**
 * 
 */
package com.ww.visualexp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ww.visualexp.domain.VisualExpResponse;

/**
 * @author chandrashekarv
 *
 */
@RestController
@RequestMapping("/")
public class LandingPageController {

	/**
	 * Populate landing page details.
	 * 
	 * @return
	 */
	public VisualExpResponse landingPage() {

		return null;
	}
}
