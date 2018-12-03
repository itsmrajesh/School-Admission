package com.ncet.speneous;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WorkingOfSchool ws = new WorkingOfSchool();

		while (true) {
			System.out.println("Welcome To School Admission Application ");
			System.out.println("1. Add/View School ");
			System.out.println("2. Admit Student ");
			System.out.println("3. Reporting on School Information ");
			int c = 0;
			boolean d = true;
			while (d) {
				try {
					System.out.println("Enter your Choice : ");
					c = sc.nextInt();
					if (c>= 4 && c != 0) {
						
						System.out.println("Make Choice between 1 - 3 ");
						
					}
					d = false;
					break;

				} catch (InputMismatchException e) {
					sc.next();
					System.out.println("****Enter valid Choice");

				}
			}

			switch (c) {
			case 1:
				WorkingOfSchool.school(null);
				break;
			case 2:
				break;
			}
		}
	}
}
//another  2nd commit from machine