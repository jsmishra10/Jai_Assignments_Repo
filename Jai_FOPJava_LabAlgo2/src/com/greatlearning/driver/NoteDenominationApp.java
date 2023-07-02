package com.greatlearning.driver;

/*
 * You are a traveler and traveling to a country where the currency denominations are unknown 
 * and as you travel you get to know about the denomination in random order.
 * You want to make a payment of amount x, in such a way that the higher denomination is used to make exact payment.
 * Date: 2nd July 2023
 * Author: Jai Mishra
 * 
 */
import java.util.Scanner;

import com.greatlearning.services.BubbleSortImpl;
import com.greatlearning.services.NotesCounter;

public class NoteDenominationApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		int size = scan.nextInt();

		int note[] = new int[size];

		System.out.println("Enter the currency denominations");
		for (int i = 0; i < size; i++) {
			note[i] = scan.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();

		BubbleSortImpl sort = new BubbleSortImpl();
		sort.bubbleSort(note);

		
		NotesCounter nc = new NotesCounter();
		nc.notesCountingMethod(note, amount);
		
		scan.close();

	}

}
