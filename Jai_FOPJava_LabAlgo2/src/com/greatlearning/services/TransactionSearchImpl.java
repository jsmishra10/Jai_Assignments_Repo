package com.greatlearning.services;

/*
 * PayMoney. processes thousands of transactions daily amounting to crores of Rupees. 
 * They also have a daily target that they must achieve. Given a list of transactions done by PayMoney and a daily target, 
 * your task is to determine at which transaction PayMoney achieves the same.
 * If the target is not achievable, then display the target is not achieved.
 * Date : 2nd July 2023
 * Author: Jai Mishra
 *  
 */

public class TransactionSearchImpl {

	public void searchTarget(int txn[], long target) {

		long sum = 0;
		boolean targetAchieved = false;
		
		try {
			for (int i = 0; i < txn.length; i++) {

				sum = sum + txn[i];
				if (sum >= target) {
					System.out.println("Target is achieved after " + (i + 1) + " transactions");
					targetAchieved = true;
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred " + e.getMessage());
		}

		
		
		if (!targetAchieved) {
			System.out.println("Given target is not achieved");
		}

	}

}
