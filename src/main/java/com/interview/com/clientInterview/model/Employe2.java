package com.interview.com.clientInterview.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employe2 {

       
        List < Employe > employees = new ArrayList < Employe > ();
        
		
        public List<Employe> sortEmpName()
        {
        	employees.add(new Employe("Ramesh", 39));
            employees.add(new Employe("John", 80));
            employees.add(new Employe("Tom", 30));
            employees.add(new Employe("Pramod", 29));
        List<Employe> emplist=employees.stream().sorted(Comparator.comparing(Employe::getName)).collect(Collectors.toList());
        return emplist;
      
        }
        
        public List<Employe> sortEmpAge() {
        	employees.add(new Employe("Ramesh", 39));
            employees.add(new Employe("John", 80));
            employees.add(new Employe("Tom", 30));
            employees.add(new Employe("Pramod", 29));
        List<Employe> emplist2=employees.stream().sorted(Comparator.comparing(Employe::getAge)).collect(Collectors.toList());
       return emplist2;
        

        }
    }
	


