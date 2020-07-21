/**
 * 
 */
package com.anirak;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Owner
 *
 */
public class MapsSamples
{

	public void findKeyForMaxValue()
	{
		// old way
		Map.Entry<String, String> maxEntry = null;

		Map<String, String> map = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : map.entrySet())
		{
			if (maxEntry == null || entry.getValue()
					.compareTo(maxEntry.getValue()) > 0)
			{
				maxEntry = entry;
			}
		}
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		// java 8 methods
		Integer maxInteger1 = countMap.entrySet()
				.stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
				.get()
				.getKey();
		Integer maxInt2 = Collections
				.max(countMap.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue())
				.getKey();
		Integer maxInt3 = Collections
				.max(countMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue))
				.getKey();

	}
}
