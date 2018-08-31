package com.vrsa9208.experiments;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompareIntegers {
	
	private static final Logger LOGGER = LogManager.getLogger(CompareIntegers.class.getName());

	public static void main(String[] args) {
		Integer a = 42;
		Integer b = 42;
		LOGGER.debug(a == b);
		Integer c = 666;
		Integer d = 666;
		LOGGER.debug(c == d);
	}

}
