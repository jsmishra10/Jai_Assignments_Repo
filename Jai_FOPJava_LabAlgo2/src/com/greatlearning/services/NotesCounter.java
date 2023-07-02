package com.greatlearning.services;

public class NotesCounter {

	public void notesCountingMethod(int note[], int amount) {

		int remainingValue = 0;
		int noteCount = 0;
		
		System.out.println("Your payment approach in order to give min no of notes will be");

		for (int i = 0; i < note.length; i++) {

			if (note[i] <= amount) {
				try {

					remainingValue = (amount % note[i]);
					noteCount = (amount / note[i]);
					amount = remainingValue;
					System.out.println(note[i] + ":" + noteCount);
					if (remainingValue == 0) {
						break;
					}
				} catch (ArithmeticException e) {
					e.printStackTrace();
					System.out.println("Exception thrown" + e.getMessage());
				}
			}
		}

		if (amount > 0) {
			System.out.println("Exact cannot be payable with higher notes value. Pending amount is " + amount);
		}

	}

}
