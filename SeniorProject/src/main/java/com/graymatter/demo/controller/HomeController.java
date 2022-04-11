/*
 * Toan Nguyen
 * Senior Project
 * Professor Jevon Jackson
 * 04/10/2022
 */

package com.graymatter.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// Link to respective pages
	
	@RequestMapping("/")
	public String index() {
		return "home";
	}
	

	
	
}
