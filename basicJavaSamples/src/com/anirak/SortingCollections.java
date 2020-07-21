/**
 * 
 */
package com.anirak;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Owner
 *
 */
public class SortingCollections
{

	public static void main(String[] args)
	{

		sortByValueJava8Stream();
	}

	/**
	 * // https://howtodoinjava.com/sort/java-sort-map-by-values/
	 */
	private static void sortByValueJava8Stream()
	{
		System.out.println("\nSorting using Java8 streams\n");
		Map<String, Integer> unSortedMap = getUnSortedMap();

		System.out.println("Unsorted Map : " + unSortedMap);

		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Sorted Map   : " + sortedMap);

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
	}

	private static Map<String, Integer> getUnSortedMap()
	{
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("alex", 1);
		unsortMap.put("david", 2);
		unsortMap.put("elle", 3);
		unsortMap.put("charles", 4);
		unsortMap.put("brian", 5);
		return unsortMap;
	}
}
