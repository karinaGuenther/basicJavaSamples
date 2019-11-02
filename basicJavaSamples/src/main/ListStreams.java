/**
 * 
 */
package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Owner
 *
 */
public class ListStreams
{
	/**
	 * https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/stream/Stream.html#collect(java.util.stream.Collector)
	 * API Note: The following will accumulate strings into an ArrayList:
	 * 
	 * List<String> asList = stringStream.collect(Collectors.toList());
	 * 
	 * The following will classify Person objects by city:
	 * 
	 * 
	 * Map<String, List<Person>> peopleByCity =
	 * personStream.collect(Collectors.groupingBy(Person::getCity));
	 * 
	 * The following will classify Person objects by state and city, cascading two
	 * Collectors together:
	 * 
	 * 
	 * Map<String, Map<String, List<Person>>> peopleByStateAndCity =
	 * personStream.collect(Collectors.groupingBy(Person::getState,
	 * Collectors.groupingBy(Person::getCity)));
	 */
	public void filterListExample()
	{
		List<String> myListToParse = new ArrayList<>();
		List<Object> myFinalList = myListToParse.stream()
				.filter(elt -> elt != null)
				.map(elt -> doSomething(elt))
				.collect(Collectors.toList());

		// can also be written as:
		myFinalList = myListToParse.stream()
				.filter(Objects::nonNull)
				.map(this::doSomething)
				.collect(Collectors.toList());
	}

	/**
	 * @param  elt
	 * @return
	 */
	private Object doSomething(String elt)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
