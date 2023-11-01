package org.testing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTask {
	int empId;
	String empName;
	long empPhoneNo;
	String empAddress;
	String empDob;
	String empDoj;
	String empEmail;
	char empGender;
	double empSalary;
	Scanner scan = new Scanner(System.in);
	
	public SetTask() {
		System.out.println("Enter Employee Id : ");
		empId = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Employee Name : ");
		empName = scan.nextLine();
		System.out.println("Enter Employee PhoneNumber : ");
		empPhoneNo = scan.nextLong();
		scan.nextLine();
		System.out.println("Enter Employee Address : ");
		empAddress = scan.nextLine();
		System.out.println("Enter Employee DOB : ");
		empDob = scan.nextLine();
		System.out.println("Enter Employee DOJ : ");
		empDoj = scan.nextLine();
		System.out.println("Enter Employee Email : ");
		empEmail = scan.nextLine();
		System.out.println("Enter Employee Gender : ");
		empGender = scan.next().charAt(0);
		System.out.println("Enter Employee Salary : ");
		empSalary = scan.nextDouble();
	}

	public static void main(String[] args) {
		Set<SetTask> s = new LinkedHashSet();
		s.add(new SetTask());
		for(SetTask p:s) {
			System.out.println(p);
		}
		
		
	}

}

