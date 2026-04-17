/*
File Name: Random module
Author: Jim Li
Date Created: Apr. 16, 2026
Date Last Modified: Apr. 16, 2026
 */

import java.util.Random;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int randomNumber(int num1, int num2){
		Random random = new Random();
		int start = Math.min(num1, num2);
		int stop = Math.max(num1, num2);
		return random.nextInt(stop - start + 1) + start;
	}

	public static char randomChar(String str){
		Random random = new Random();
		int ranNum = random.nextInt(str.length());
		return str.charAt(ranNum);
	}

	public static int randomEvenNumber(int num1, int num2){
		Random random = new Random();
		int start = Math.min(num1, num2);
		int stop = Math.max(num1, num2);
		int num = 1;
		while (num % 2 != 0){
			num = random.nextInt(stop - start + 2) + start;
		}
		return num;
	}

}
