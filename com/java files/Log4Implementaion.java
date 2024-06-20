package com.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4Implementaion{

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(App.class);
		logger.debug("Debug level");
		logger.info("info level");
		logger.warn("warn level");
		logger.error("error level");
	}

}
