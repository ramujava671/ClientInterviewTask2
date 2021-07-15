package com.interview.com.clientInterview;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.interview.com.clientInterview.model.Employe;
import com.interview.com.clientInterview.model.Employe2;

public class EmployesTest2 {
    

   @Test
	public void empTest()
	{
	   List < Employe > employees = new ArrayList < Employe > ();
       employees.add(new Employe("John", 80));
       employees.add(new Employe("Pramod", 29));
       employees.add(new Employe("Ramesh", 39));
       employees.add(new Employe("Tom", 30));
       
		Employe2 emp=new Employe2();
		 List<Employe> list=emp.sortEmpName();
		 //System.out.println(list+"list");
		// System.out.println(employees+"Epected");
		 assertEquals(employees, list);
		 
	}
   @Test
	public void sortEmpAge()
	{
	   List < Employe > employees = new ArrayList < Employe > ();
     
      employees.add(new Employe("Pramod", 29));
      employees.add(new Employe("Tom", 30));
      employees.add(new Employe("Ramesh", 39));
      employees.add(new Employe("John", 80));
      
		Employe2 emp=new Employe2();
		 List<Employe> list=emp.sortEmpAge();
		 assertEquals(employees, list);
		 
	}
   
}
