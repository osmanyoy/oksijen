package com.yapikredi.dp.effectivr;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTest {
	public static void main(String[] args) {
		Logger logger = null;
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("test : " + args[0]);
		}
		// logger.fine("{} test {}","test","yayay");
		
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("[LogTest][main] " + args[0]);
		}
	}
}
