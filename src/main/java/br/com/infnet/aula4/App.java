package br.com.infnet.aula4;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	
	private static final Logger logger = Logger.getLogger(App.class);
	
	
	public String getString() {
		logger.info("Hello World");
		return "Hello World";
	}
}
