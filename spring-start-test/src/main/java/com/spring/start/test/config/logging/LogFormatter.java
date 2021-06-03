package com.spring.start.test.config.logging;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * 日志格式
 */
public class LogFormatter extends Formatter {

	private static final Date dat = new Date();

	@Override
	public String format(LogRecord record) {
		dat.setTime(record.getMillis());
		String className = record.getSourceClassName();
		String[] strings = className.split("\\.");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strings.length; i++) {

			if (i == strings.length - 1) {
				sb.append(strings[i]);
			} else {
				sb.append(strings[i].charAt(0)).append(".");
			}
			;
		}
		sb.append(record.getSourceMethodName());
		return String.format("%1$tF %1$tT [%2$s] %3$s: %4$s%n",
				dat,
				record.getLevel().getName(),
				sb.toString(),
				record.getMessage()
		);
	}
}
