package com.ncet.speneous;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkingOfSchool {
	boolean z = true;
	ArrayList<School> school = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);

	public boolean AddSchool() {

		System.out.println("Enter the school Name :");
		String name = sc.next();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Enter the  Valid school Name :");
			name = sc.next();
		}

		int id = 0;
		boolean a = true;
		while (a) {
			try {
				System.out.println("Enter School ID :");
				id = sc1.nextInt();
				a = false;
				break;
			} catch (InputMismatchException e) {
				sc1.next();
				System.out.println("****Enter valid ID");

			}
		}
		System.out.println("Enter the  SchoolBoard");
		String board = sc.next();
//		while(!board.matches("cbse,icse,state")) {
//			System.out.println("Enter the  Valid Board Name :");
//			board = sc.next();
//		}

		int cn = 0;
		boolean a1 = true;
		while (a1) {
			try {
				System.out.println("Enter the school Contactnumber :");
				cn = sc1.nextInt();
				a1 = false;
				break;
			} catch (InputMismatchException e) {
				sc1.next();
				System.out.println("****Enter valid Number ");

			}
		}

		System.out.println("Enter the school no of class");
		int nc = sc.nextInt();

		System.out.println("Enter the total strength for each class");
		int st = sc1.nextInt();

		System.out.println("Enter current strength");
		int cs = sc.nextInt();

		School s1 = new School(name, board, cn, id, nc, st, cs);
		school.add(s1);

		return true;
	}

	public void ListOfSchool() {
		System.out.println("List of school");
		for (int i = 0; i < school.size(); i++) {
			School s = school.get(i);
			if (school.size() != 0) {
				s.displaySchool();
			} else {
				System.out.println("List is Empty");
			}

		}

	}

	public void DeleteSchool(int id) {
		System.out.println("Enter School ID to delete :");
		int c = sc1.nextInt();
		id = c;
		school.remove(id);
		System.out.println("Deleting school");
	}

	public String GetSchool(int id) {
		System.out.println("searching school");
		return "ok";
	}

	public void UpdateSchool() {
		System.out.println("updating school");
	}

	public static void school(String[] args) {
		WorkingOfSchool w1 = new WorkingOfSchool();
		Main m = new Main();

		while (true) {
			System.out.println("1.AddSchool");
			System.out.println("2.List of schools ");
			System.out.println("3.UpdateSchoolinformation");
			System.out.println("4.SearchSchool by id");
			System.out.println("5.DeleteSchool");
			System.out.println("6.Exit");
			System.out.println("Enter your Choice : ");
			int c = sc1.nextInt();
			switch (c) {
			case 1:
				boolean s = w1.AddSchool();
				if (s) {
					System.out.println("School is add sucessfully");
				}
				break;
			case 5:
				w1.DeleteSchool(1);
				break;
			case 3:
				w1.UpdateSchool();
				break;
			case 4:
				w1.GetSchool(1);
				break;
			case 2:
				w1.ListOfSchool();
				break;
			case 6:
				m.main(null);
				break;
			default:
				System.out.println("Hello! Boos give proper input ");
				break;
			}
		}
	}
}
