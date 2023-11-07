package com.balanceBracket.service;

import java.util.Stack;

public class BalanceBracketService {
	public boolean isStringHasBalanceBracket(String inputString) {
		Stack<Character> stack = new Stack<Character>();
		char character;
		
		//Logic to verify if the given input is a balanced bracket or not.
		//Iterates over the given string & checks for each character
		for (int position = 0; position < inputString.length(); position++) {
			character = inputString.charAt(position);
			switch (character) {
			case '(':
				stack.push('(');
				continue;
			case '[':
				stack.push('[');
				continue;
			case '{':
				stack.push('{');
				continue;
			case ')':
			case ']':
			case '}':
				if (stack.isEmpty() || !verifyBrackets(stack.pop(), character))
					return false;
				break;
			default:
				return false;
			}
		}
		//If the given input is blank, below if else statement handles it
		if (inputString.length() == 0)
			return false;
		else
			//At the end, if the stack is empty, a balanced bracket is identified so return 'True'
			return (stack.isEmpty());
	}

	private boolean verifyBrackets(Character poppedElement, Character closedElement) {
		//This function verifies if the poppedElement and the closedElement are a valid pair
		if ((poppedElement == '(') && (closedElement == ')')) {
			return true;
		} else if ((poppedElement == '[') && (closedElement == ']')) {
			return true;
		} else if ((poppedElement == '{') && (closedElement == '}')) {
			return true;
		} else
			return false;
	}
}