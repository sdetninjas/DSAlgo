package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerLoad {

    private static Logger logger = LogManager.getLogger();

    

   	 public static void info(String message) {

		 logger.info("Info Log " + message); 			

		 }

	 public static void warn(String message) {

		 logger.warn("warn Log" + message);

		}

	 public static void error(String message) {

		 logger.error("error Log" + message);

		}

	 public static void fatal(String message) {

		 logger.fatal("fatal Log" + message);

		}

	 public static void debug(String message) {

		 logger.debug("debug Log" + message);

		}

}