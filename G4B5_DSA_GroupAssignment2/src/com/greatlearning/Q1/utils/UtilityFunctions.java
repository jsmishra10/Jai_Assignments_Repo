package com.greatlearning.Q1.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UtilityFunctions {
	
	
	public static int getFloorSize(int i, HashMap<Integer, Integer> building) {

		int floorSize = 0;

		Iterator<Map.Entry<Integer, Integer>> iterator = building.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			int key = entry.getKey();
			if (key == i) {
				floorSize = entry.getValue();
				break;
			}

		}

		return floorSize;

	}
	
	public static int getFloorSizeDiff(ArrayList<Integer> floorStack, int floorSize) {

		if (floorStack.size() > 0) {
			return (floorStack.get(floorStack.size() - 1) - floorSize);
		} else {
			return 0;
		}

	}

}
