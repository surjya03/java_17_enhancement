package com.studyopedia;
import java.util.*;
public class surjya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day: ");
		String day= sc.next();
		String result= switch (day) {	//ENHANCED SWITCH EXPRESSIONS
			case "Saturday","Sunday" -> "Rest";
			case "Monday" -> "Busy";
			default -> "Boring";
			};
		System.out.println("The result is: "+result);

	}

}
