package generics_01;

public class Generics_01<E> {

	private E e;

	public void set(E e) {
		this.e = e;
	}

	public E get() {
		return e;
	}

}

class Test {

	public static void main(String[] args) {
		Generics_01<Integer> intGenerics = new Generics_01<Integer>();
		intGenerics.set(10);
		Integer i = intGenerics.get();
		System.out.println(i);
		Generics_01<String> stringGenerics = new Generics_01<String>();
		stringGenerics.set("GenericsTest");
		String s = stringGenerics.get();
		System.out.println(s);
	}
}
