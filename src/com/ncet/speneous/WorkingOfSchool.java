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
				System.out.println("****Enter valid School ID");

			}
		}
		System.out.println("Enter the  SchoolBoard :");
		String board = sc.next();
//		while(board.!matches("cbse,icse,state")) {
//			System.out.println("Enter the  Valid Board Name :");
//			board = sc.next();
//		}
		//trying git hub

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
				System.out.println("****Enter valid Contactnumber ");

			}
		}

		System.out.println("Enter the school no of class :");
		int nc = sc.nextInt();

		System.out.println("Enter the total strength for each class");
		int st = sc1.nextInt();

		System.out.println("Enter current strength :");
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
		System.out.println("Deleting School with ID :  " + id);
		boolean flag = false;
		School s1;
		for (int i = 0; i < school.size(); i++) {
			s1 = school.get(i);
			int myid = s1.getSchoolId();
			if (myid == id) {
				school.remove(i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("School not found with ID :  " + id);
		}
	}

	public void GetSchool(int id) {
		boolean flag = false;
		System.out.println("Searching School with ID  : " + id);
		School s1;
		for (int i = 0; i < school.size(); i++) {
			s1 = school.get(i);
			int myid = s1.getSchoolId();
			if (myid == id) {

				s1.displaySchool();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("School not found with ID  : " + id);
		}
	}

	public void UpdateSchool(int id) {
		System.out.println("Take a look at School Details to Update");
		GetSchool(id);
		School s;
		boolean flag = false;
		for (int i = 0; i < school.size(); i++) {
			s = school.get(i);
			int myid = s.getSchoolId();
			if (myid == id) {

				System.out.println("1.Change school Name");
				System.out.println("2.Change school Id");
				System.out.println("3.Change SchoolBoard");
				System.out.println("4.change School ContactNumber");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the name of the School to update :");
					String cgName = sc.next();
					s.setSchoolname(cgName);
					System.out.println("Update Sucessfull..!");
					break;
				case 2:
					System.out.println("Enter the schoolId to update :");
					int cgid = sc.nextInt();
					s.setSchoolId(cgid);
					System.out.println("Update Sucessfull..!");
					break;
				case 3:
					System.out.println("Enter school board to update :");
					String cgboard = sc.next();
					s.setSchoolboard(cgboard);
					System.out.println("Update Sucessfull..!");
					break;
				case 4:
					System.out.println("Enter school contactNumber to update :");
					int cgcontact = sc.nextInt();
					s.setContactNumber(cgcontact);
					System.out.println("Update Sucessfull..!");
					break;
				}
				flag = true;
			}
		}
//		if (flag == false) {
//			System.out.println("School not Found with id  : " + id);
//		}
	}

	public static void school(String[] args) {
		WorkingOfSchool w1 = new WorkingOfSchool();

		while (true) {
			System.out.println("1.AddSchool");
			System.out.println("2.List of schools ");
			System.out.println("3.UpdateSchoolinformation");
			System.out.println("4.SearchSchool by id");
			System.out.println("5.DeleteSchool");
			System.out.println("6.Exit");

			int c = 0;
			boolean d = true;
			while (d) {
				try {
					System.out.println("Enter your Choice : ");
					c = sc1.nextInt();
					if (c > 6 && c != 0) {
						System.out.println("Make Choice between 1 - 6 ");

					}
					d = false;
					break;
				} catch (InputMismatchException e) {
					sc1.next();
					System.out.println("****Enter valid input");

				}
			}

			switch (c) {
			case 1:

				boolean s = w1.AddSchool();
				School sch = new School(null, null, c, c, c, c, c);
				if (s) {
					System.out.println("School added sucessfully ");
				}
				break;
			case 5:
				int idd = 0;
				boolean d1 = true;
				while (d1) {
					try {
						System.out.println("Enter School ID to Delete : ");
						idd = sc.nextInt();
						d1 = false;
						w1.DeleteSchool(idd);
						break;
					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("*****Enter valid ID to Delete ");
					}

				}

				break;
			case 3:

				int idu = 0;
				boolean u = true;
				while (u) {
					try {
						System.out.println("Enter School ID to Update : ");
						idu = sc.nextInt();
						u = false;
						w1.UpdateSchool(idu);
						break;

					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("*****Enter valid ID to Update ");

					}

				}
				break;
			case 4:
				int id = 0;
				boolean ss = true;
				while (ss) {
					try {
						System.out.println("Enter School ID to Search : ");
						id = sc.nextInt();
						ss = false;
						w1.GetSchool(id);
						break;
					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("*****Enter valid ID to Search ");
					}

				}
				break;
			case 2:
				w1.ListOfSchool();
				break;
			case 6:
				Main.main(null);
				break;
			default:
				System.out.println(" ");
				break;
			}
		}
	}
}
