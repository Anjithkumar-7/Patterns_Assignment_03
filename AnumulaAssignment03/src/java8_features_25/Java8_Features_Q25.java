package java8_features_25;

import java.util.*;

public class Java8_Features_Q25 implements Java8Features_Q25{

	public static void main(String[] args) {

		// Lambdas:
		List<Integer> numbers = Arrays.asList(3, 1, 8, 4, 5);
		numbers.forEach((n) -> System.out.println(n));

		// Stream API
		List<String> words = Arrays.asList("hi", "hello", "bye");
		long count = words.stream().filter(w -> w.length() > 3).count();
		System.out.println(count);

		// Method References
		List<Integer> num = Arrays.asList(3, 1, 8, 4, 5);
		num.forEach(System.out::println);

		// Optional

		Optional<String> optnl = Optional.of("hello");
		System.out.println(optnl.isPresent());
		System.out.println(optnl.get());
		

	}

}
