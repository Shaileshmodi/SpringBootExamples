package com.springboot.examples.logback.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.examples.logback.model.Sample;

@RestController
public class SampleController {
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleController.class);
	@GetMapping("/sample")
	public Sample sample() {
		LOGGER.info("Log generated in info mode-------------------------------");
		LOGGER.debug("Log generated in debug mode-------------------------------");
		LOGGER.warn("Log generated in warn mode-------------------------------");
		LOGGER.error("Log generated in Error mode-------------------------------");
		return new Sample("Hello from Logback Module");
	}
}