package com.balanceBracket.main;

import com.balanceBracket.service.BalanceBracketService;

public class BalanceBracketDriver {

	public static void main(String[] args) {
		//Input variable
		String inputString = "((((())))){}[]{[]}";
		
		//Create an Object
		BalanceBracketService balanceBracketService = new BalanceBracketService();
		
		//Validate if the given input is a balanced brackets or not!
		boolean output = balanceBracketService.isStringHasBalanceBracket(inputString);
		
		//Print result based on the validated output
		if (output)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
	}

}
