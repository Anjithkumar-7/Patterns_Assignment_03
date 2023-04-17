package singletonSynchronised_27;

public class singletonSynchronised_Q27 {

	private static singletonSynchronised_Q27 obj = null;

	private singletonSynchronised_Q27() {
		// private constructor
	}

	public static synchronized singletonSynchronised_Q27 getInstance() {
		if (obj == null) {
			obj = new singletonSynchronised_Q27();
		}
		return obj;
	}

}
