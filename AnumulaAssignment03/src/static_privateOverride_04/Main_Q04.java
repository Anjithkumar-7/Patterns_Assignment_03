package static_privateOverride_04;

class Superclass {
	static void staticMethod() {
		System.out.println("Static method in superclass");
	}

	private void privateMethod() {
		System.out.println("Private method in superclass");
	}
}

class Subclass extends Superclass {
	static void staticMethod() {
		System.out.println("Static method in subclass");
	}

	private void privateMethod() {
		System.out.println("Private method in subclass");
	}

}

public class Main_Q04 {

	public static void main(String[] args) {
		Superclass superObj = new Superclass();
		Subclass subObj = new Subclass();

		// Static methods are called using the class name
		Superclass.staticMethod(); // output: "Static method in superclass"
		Subclass.staticMethod(); // output: "Static method in subclass"

		// Private methods cannot be called outside the class
		// superObj.privateMethod(); // won't compile
		// subObj.privateMethod(); // won't compile

	}

}
