package logger4jDemo;

import org.apache.logging.log4j.*;

public class LoggerDemo {

	public static void main(String[] args) {
		
		Logger log = LogManager.getFormatterLogger();
		
		log.fatal("THis is Fatal");
		log.error("This is Error");
		log.warn("This is Warn");
		log.info("This is info");
		log.debug("This is debug");
		log.trace("This is trace");
	}

}
