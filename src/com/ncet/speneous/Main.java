package com.ncet.speneous;

import java.util.Scanner;

public class Main {
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	WorkingOfSchool ws = new WorkingOfSchool();

	while(true) {
		System.out.println("Welcome To School Admission Application ");
		System.out.println("1. Add/View School ");
		System.out.println("2. Admit Student ");
		System.out.println("3. Reporting on School Information ");
		System.out.println("Enter your Choice : ");
		int c = sc.nextInt();
		switch(c){
		case 1: ws.school(args);
		break;
		case 2 :
			break;
		}
	}
}
}
