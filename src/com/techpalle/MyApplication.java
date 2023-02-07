package com.techpalle;

import java.util.ArrayList;

public class MyApplication 
{

	public static void main(String[] args) 
	{
		Student s=new Student(0, null, null, null);
		//s.creating();
		
		/*s.inserting("Prachi","Java", "prachipatil18@gmail.com");
		s.inserting("Pradnya",".net", "pradnyapatil12@gmail.com");
		s.inserting("Pranav","DB","pranavpatil28@gmail.com");
		s.inserting("Akshay","Python","akshaypatil16@gmail.com");
		s.inserting("Raksha","C","rakshapatil28@gmail.com");
		s.inserting("Rutu","Maths","rutupatil06@gmail.com");*/
		
		//s.update(5, "C++", "rakshahemanth12@gmail.com");
		
		//s.delet(6);
		
		
		//s.read();
		
		
		ArrayList<Student>d=Student.reading();
		for(Student item:d)
		{
			System.out.println(item.sid);
			System.out.println(item.sname);
			System.out.println(item.sub);
			System.out.println(item.email);
			
			System.out.println("******************");
		}
		
		
		
		
		
		
		
		

	}

}
