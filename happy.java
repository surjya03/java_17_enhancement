package com.studyopedia;
import java.util.*;

	
   record happy(String name, int age, String College_name) {	//RECORD CLASS
	public static void main(String[] args) {
		happy h= new happy("Surjya Sutradhar", 21, "AOT");
		System.out.println(h);
		System.out.println(h.name);
			

	}
}





