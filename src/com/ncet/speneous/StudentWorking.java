package com.ncet.speneous;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentWorking {
	boolean z = true;
	ArrayList<Student> students = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);

	public boolean AdmitStudent() {

		System.out.println("Enter the student Name :");
		String name = sc.next();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Enter the  Valid school Name :");
			name = sc.next();
		}

		int id = 0;
		boolean a = true;
		while (a) {
			try {
				System.out.println("Enter Student ID :");
				id = sc1.nextInt();
				a = false;
				break;
			} catch (InputMismatchException e) {
				sc1.next();
				System.out.println("****Enter valid Student ID");

			}
		}
		System.out.println("Enter Student's father name");
		String fname = sc.next();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Enter the  Valid school Name :");
			name = sc.next();
		}
		System.out.println("Enter Student's mother name");
		String mname = sc.next();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Enter the  Valid school Name :");
			name = sc.next();
		}
		int cn = 0;
		boolean a1 = true;
		while (a1) {
			try {
				System.out.println("Enter the student Contactnumber :");
				cn = sc1.nextInt();
				a1 = false;
				break;
			} catch (InputMismatchException e) {
				sc1.next();
				System.out.println("****Enter valid Number ");

			}
		}
		System.out.println("Enter the school name the student wish to join");
		String sname=sc.next();
		while (!name.matches("[a-zA-Z]+")) {
			System.out.println("Enter the  Valid school Name :");
			name = sc.next();
		}


		Student s1 = new Student(name, id, fname, mname, cn, sname);
		students.add(s1);

		return true;
	}

	public void ListOfStudents() {
		System.out.println("List of school");
		for (int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if (students.size() != 0) {
				s.print();
			} else {
				System.out.println("List is Empty");
			}

		}

	}

	public void DeleteStudent(int id) {
		System.out.println("Deleting School with ID :  " + id);
		boolean flag = false;
		Student s1;
		for (int i = 0; i < students.size(); i++) {
			s1 = students.get(i);
			int myid = s1.getStudentId();
			if (myid == id) {
				students.remove(i);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("School not found with ID :  " + id);
		}
	}

	public void GetStudent(int id) {
		boolean flag = false;
		System.out.println("Searching Student with ID  : " + id);
		Student s1;
		for (int i = 0; i < students.size(); i++) {
			s1 = students.get(i);
			int myid = s1.getStudentId();
			if (myid == id) {

				s1.print();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Student not found with ID  : " + id);
		}
	}

	public void UpdateStudent(int id) {
		System.out.println("Take a look at School Details ");
		GetStudent(id);
		Student s;
		boolean flag = false;
		for (int i = 0; i < students.size(); i++) {
			s = students.get(i);
			int myid = s.getStudentId();
			if (myid == id) {

				System.out.println("1.Change student Name");
				System.out.println("2.Change student Id");
				System.out.println("3.Change School name");
				System.out.println("4.change Student ContactNumber");
				System.out.println("Enter your choice");
				int ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter the name of the Student");
					String stName = sc.next();
					s.setStudentName(stName);
					break;
				case 2:
					System.out.println("Enter the studentId");
					int sid = sc.nextInt();
					s.setStudentId(sid);
					break;
				case 3:
					System.out.println("Enter school name");
					String scname = sc.next();
					s.setSchoolAdmittedTo(scname);
					break;
				case 4:
					System.out.println("Enter student contactNumber");
					int scontact = sc.nextInt();
					s.setContact(scontact);
					break;
				}
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("Student not Found with id  : " + id);
		}
	}

	public static void student(String[] args) {
		StudentWorking sw1 = new StudentWorking();

		while (true) {
			System.out.println("1.Admit Student");
			System.out.println("2.List of students ");
			System.out.println("3.UpdateStudent Information");
			System.out.println("4.Search student by id");
			System.out.println("5.Delete student");
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
				boolean s = sw1.AdmitStudent();
				if (s) {
					System.out.println("School is add sucessfully");
				}
				break;
			case 5:
				System.out.println("Enter School ID to Delete : ");
				int idd = sc.nextInt();
				sw1.DeleteStudent(idd);
				break;
			case 3:
				System.out.println("Enter School ID to Update : ");
				int idu = sc.nextInt();
				sw1.UpdateStudent(idu);
				break;
			case 4:
				System.out.println("Enter School ID to Search : ");
				int id = sc.nextInt();
				sw1.GetStudent(id);
				break;
			case 2:
				sw1.ListOfStudents();
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
