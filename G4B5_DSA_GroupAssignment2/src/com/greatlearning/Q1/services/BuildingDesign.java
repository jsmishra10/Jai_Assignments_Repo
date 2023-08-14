package com.greatlearning.Q1.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import com.greatlearning.Q1.utils.UtilityFunctions;

public class BuildingDesign {

	int totalFloors;
	int floorSize;

	HashMap<Integer, Integer> building = new HashMap<>();
	Scanner scan = new Scanner(System.in);

	public void getBuildingAttributes() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the total no of floors in the building:");
		totalFloors = scan.nextInt();

		for (int i = 1; i <= totalFloors; i++) {
			System.out.print("Enter the floor size given on day " + i + ":");
			floorSize = scan.nextInt();
			building.put(i, floorSize);
		}

		scan.close();
	}

	public void generateConstructionReport() {

		System.out.println("\nThe order of construction is as follows");

		ArrayList<Integer> floorStack = new ArrayList<Integer>();
		ArrayList<Integer> pendingFloors = new ArrayList<Integer>();

		for (int i = 1; i <= totalFloors; i++) {

			System.out.println("Day:" + i);

			int floorSize = UtilityFunctions.getFloorSize(i, building);
			if (floorSize == totalFloors) {

				floorStack.add(floorSize);
				Collections.sort(floorStack);
				if (!pendingFloors.isEmpty()) {
					floorStack.addAll(pendingFloors);
					System.out.println(floorStack.toString().replace("[", "").replace("]", "").replace(",", ""));
					pendingFloors.removeAll(pendingFloors);
				} else {
					System.out.println(floorStack.toString().replace("[", "").replace("]", "").replace(",", ""));
				}

			} else if (floorSize < totalFloors) {

				int floorSizeDiff = UtilityFunctions.getFloorSizeDiff(floorStack, floorSize);

				if (floorSizeDiff == 1) {

					floorStack.removeAll(floorStack);

					floorStack.add(floorSize);
					Collections.sort(floorStack);

					if (!pendingFloors.isEmpty()) {
						floorStack.addAll(pendingFloors);
						System.out.println(floorStack.toString().replace("[", "").replace("]", "").replace(",", ""));
					} else {
						System.out.println(floorStack.toString().replace("[", "").replace("]", "").replace(",", ""));
					}

				} else {
					pendingFloors.add(floorSize);
					Collections.sort(pendingFloors, Collections.reverseOrder());
					System.out.println();
				}
			}

		}

	}

}
