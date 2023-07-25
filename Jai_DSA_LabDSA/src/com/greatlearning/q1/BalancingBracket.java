package com.greatlearning.q1;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracket {	
	
	
	public static boolean isBalanced(String inputString) {

		Stack<String> stk = new Stack();

		for (int i = 0; i < inputString.length(); i++) {

			char inputChar = inputString.charAt(i);

			if (inputChar == '(' || inputChar == '{' || inputChar == '[') {
				stk.push(String.valueOf(inputChar));
			}

			if (inputChar == ')' || inputChar == '}' || inputChar == ']') {

				if (stk.isEmpty()) {
					return false;
				} else {
					stk.pop();
				}

			}

		}

		if (stk.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the input string:");

		String inputString = scan.next();

		boolean result = isBalanced(inputString);

		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
