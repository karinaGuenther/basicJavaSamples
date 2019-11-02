package main;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		List<Integer> number = Arrays.asList(2, 3, 4, 5, 3);
		Set<Integer> square = number.stream()
				.map(x -> x * x)
				.collect(Collectors.toSet());
	}
}
