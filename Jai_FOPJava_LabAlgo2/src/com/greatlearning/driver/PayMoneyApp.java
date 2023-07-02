package com.greatlearning.driver;


import java.util.Scanner;

import com.greatlearning.services.TransactionSearchImpl;

public class PayMoneyApp {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of Transaction Array");
		int arraySize = scan.nextInt();

		int txn[] = new int[arraySize];

		System.out.println("Enter the array values");
		

		for (int i = 0; i < arraySize; i++) {
			txn[i] = scan.nextInt();

		}

		System.out.println("Enter the total number of targets that needs to be achieved");
		int targetNum = scan.nextInt();
		TransactionSearchImpl txnSearch = new TransactionSearchImpl();
		for (int j = 0; j < targetNum; j++) {

			System.out.println("Enter the target value");
			long targetValue = scan.nextLong();
			txnSearch.searchTarget(txn, targetValue);

		}
		
		scan.close();

	}

}
