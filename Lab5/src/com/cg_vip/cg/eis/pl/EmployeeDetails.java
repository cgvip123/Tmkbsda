package com.cg_vip.cg.eis.pl;
import com.cg_vip.cg.eis.service.Service;

import java.util.Scanner;

public class EmployeeDetails
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		String name = sc.nextLine();
		name+=sc.nextLine();
		double salary = sc.nextDouble();
		String designation = sc.next();
		
		Service s1 = new Service();
		s1.setDetails(id, name, salary, designation);
		s1.insurance(salary, designation);
		s1.printDetails();
	}
}
