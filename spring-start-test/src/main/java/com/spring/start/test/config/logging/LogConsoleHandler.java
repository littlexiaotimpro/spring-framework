package com.spring.start.test.config.logging;


import java.util.logging.ConsoleHandler;

public class LogConsoleHandler extends ConsoleHandler {

	public LogConsoleHandler() {
		super();
		setOutputStream(System.out);
	}

}
