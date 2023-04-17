package singleTon_26;

public class SingletonClass_Q26 {

	private static final SingletonClass_Q26 instance = new SingletonClass_Q26();
	
	//Only this class can access this private constuctor
	private SingletonClass_Q26() {
		// private constructor
	}

	public static SingletonClass_Q26 getInstance() {
		return instance;
	}

	
}
