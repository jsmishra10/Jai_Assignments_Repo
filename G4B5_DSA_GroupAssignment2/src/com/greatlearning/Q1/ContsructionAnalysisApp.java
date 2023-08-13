package com.greatlearning.Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
 * Your friend is a chief architect, who is working on building a skyscraper, in Mumbai. 
 * The construction is in such a way that the floors will be constructed in other factories and they will be assembled. 
 * All the sizes will be distinct.The skyscraper needs to be constructed in N days with the following conditions :
 * a)	Every day a floor is constructed in a separate factory of distinct size.
 * b)	The floor with the larger size must be placed at the bottom of the building.
 * c)	The floor with the smaller size must be placed at the top of the building.
 * Note: A floor cannot be assembled in the building until all floors larger in size are placed.
 * As a friend he wants you to build a small program that will help him analyze the construction process, to avoid manual work and errors.
 * Input
 * First Line: contains the total floors N in the building
 * Second Line onwards: Contains N inputs in which the ith integer denotes the size of the floor that will be given to architect by factories on the ith day.
 */

public class ContsructionAnalysisApp {	
	

	public static void main(String[] args) {	
				
		
		BuildingDesign buildAttr = new BuildingDesign();	
		
		buildAttr.getBuildingAttributes();
		buildAttr.generateConstructionReport();  
		

	}

	
}
