import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Object - Objects have states and behaviors.
Example: A dog has states – color, name, breed as well as behaviors – wagging the tail, barking, eating.
An object is an instance of a class.
Class - A class can be defined as a template / blueprint that describes the behavior / state that the object of its type support.
It's a prototype that defines the variables and methods common to all objects of a certain kind
the class specifies how instances are created and how they behave.
Method: Is an action which an object is able to perform.
 */
 class Classandobject {
	String Name;
	String ward;

	int Age;
	char Sex;

	boolean attendance;

	String Present;

	public static void main(String [] args)
	{
		int a = 10, b = 20;
		if (a>b)
		{
			System.out.println();
		}

		Classandobject stu1 = new Classandobject();   //Student 1
		Classandobject stu2 = new Classandobject();   //Student 2
		Classandobject stu3 = new Classandobject();   //Student 3
		Classandobject stu4 = new Classandobject();   //Student 3

		stu1.Name = "Student 1";
		stu1.Age = 12;
		stu1.Sex = 'F';
		stu1.ward = "Ward 1";
		stu1.attendance = true;
		stu1.Present = "Present";

		stu2.Name = "Student 2";
		stu2.Age = 14;
		stu2.Sex = 'M';
		stu2.ward = "Ward 2";
		stu2.attendance = false;
		stu2.Present = "Absent";

		stu3.Name = "Student 3";
		stu3.Age = 11;
		stu3.Sex = 'F';
		stu3.ward = "Ward 3";
		stu3.attendance = true;
		stu3.Present = "Present";

		//System.out.println(obj1.Name +" "+ obj1.Age+" "+obj1.Sex);
//		stu1.display();
//		stu2.display();
//		stu3.display();

		System.out.println("Student Name"+"\t"+"Age"+"\t"+"Sex"+"\t"+"ward");
		stu1.picture();
		stu2.picture();
		stu3.picture();

	}

	void picture(){

		System.out.println(Name + "\t\t" + Age + "\t" + Sex + "\t" + ward);

	}
	
//	void display()
//	{
//		System.out.println(Name + "\t" + Age + "\t" + Sex + "t" + ward);
//
//	}
}

