package Rough;

import org.apache.log4j.Logger;

public class Logger_Example {

	public static void main(String[] args) {
		
		Logger Application_log = Logger.getLogger("devpinoyLogger");
		Application_log.debug("Hello Java ==");
		Application_log.debug("Hello Java ##");
		Application_log.debug("Hello Java $$$");
		
	}
}

