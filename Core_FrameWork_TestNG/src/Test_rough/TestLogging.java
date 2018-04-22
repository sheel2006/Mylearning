package Test_rough;

import org.apache.log4j.Logger;

public class TestLogging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Test Logging");

}
}
