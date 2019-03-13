package com.tricon.customer.customer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2DemoApplication {

	Logger logger = LogManager.getLogger(Log4j2DemoApplication.class);
	
	public void loggerCheck()
	{
		    logger.debug("Debugging log");
	        logger.info("Info log");
	        logger.warn("Hey, This is a warning!");
	        logger.error("Oops! We have an Error. OK");
	        logger.fatal("Damn! Fatal error. Please fix me.");
	}
}
