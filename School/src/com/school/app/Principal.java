package com.school.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Date currentDate = new Date();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");

        LocalDate startDate = LocalDate.parse("2020-02-01", dtf);
        LocalDate endDate = LocalDate.parse("2022-11-31", dtf);
        
        
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(01, "Sergio", 28, currentDate, "Maths"));
		students.add(new Student(02, "Ramesh", 28,currentDate, "Economy"));
		students.add(new Student(03, "Santos", 28,currentDate, "Philosophie"));
		students.add(new Student(04, "San", 28,currentDate, "Computer Science"));
	
		
	      if (startDate.isEqual(endDate)) {
	          System.out.println("Date1 is equal Date2");
	      }

	      if (startDate.isBefore(endDate)) {
	          System.out.println("Date1 is before Date2");
	      }
		
		students
		.stream()
		.forEach(System.out::println);
		
	
	}
	

}
