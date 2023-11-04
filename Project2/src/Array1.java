
import java.util.Scanner;

class Array1 {
	public static void main(String[] args) {

		//To store multiple data of same datatype under single variable name
		
		//String name = "student 1";        //Only one value

//		String student1 = "student 1";
//		String student2 = "student 2";
//		String student3 = "student 3";
//		String student4 = "student 4";
//		String student5 = "student 5";

//		int mark1, mark2, mark3, mark4, mark5;
//
//		String [] studentname = {"Student 1", "Student 2", "Student 3", "Student 4", "Student 5"};	   //More than one value
//		int mark [] = {98, 85, 69, 74, 88};

//		System.out.println(studentname[0] + "\n" + studentname[1] + "\n" + studentname[2]);

//      \t 			- for tab   \n for new line

//		for(int i=0; i<studentname.length; i++)
//		{
//			System.out.println("Student Name of "+ (i+1) + " is: " + studentname[i]);
//			System.out.println("Student marks :" + mark[i]);
//		}

//		// DataType VariableName[] = new Datatype[size];
//		String stuname[] = new String[2];
		Scanner sc = new Scanner(System.in);
////
//		for (int i=0; i<2; i++)  // Place to get the input and store the value in array
//		{
//			System.out.println("Enter Student "+ (i+1) + " name: ");
//			stuname[i] = sc.next();
//		}
//
//		for (int j=0; j<2; j++)    // Retrive the value from the array
//		{
//			System.out.println("Student "+ (j+1) + " name is: "+stuname[j]);
//		}

//		System.out.println("Please enter the number of student name to get: ");
//		int stunamecount = sc.nextInt();
//		String[] newstuname = new String[stunamecount]; // Keeping the array length through input variable
//		for (int i=0; i<stunamecount; i++ ) // To get the student name input and store in the arry
//		{
//			System.out.println("Enter Student "+ (i+1) + " name: ");
//			newstuname[i] = sc.next();
//		}
//
//		for (int j=0; j<stunamecount; j++)  //Get the student name from the array and print
//		{
//			System.out.println("Student "+(j+1)+" name is: "+newstuname[j]);
//		}


		System.out.println("Please enter the number of student name to get: ");
		int stunamecount = sc.nextInt();
		System.out.println("Please enter number of marks to get for each student: ");
		int stumarkcount = sc.nextInt();

		String[] newstuname = new String[stunamecount]; // Keeping the array length through input variable
		int stumark[][] = new int[stunamecount][stumarkcount];

		for (int i=0; i<stunamecount; i++ ) // To get the student name input and store in the arry
		{
			System.out.println("Enter Student "+ (i+1) + " name: ");
			newstuname[i] = sc.next();
			System.out.println("Please enter student makrs for " + newstuname[i]);

			for (int j=0; j<stumarkcount; j++)
			{
				System.out.println("Enter Mark: "+ (j+1) );
				stumark[i][j] = sc.nextInt();
			}
		}

		for (int i=0; i<stunamecount; i++ ) // To get the student name input and store in the arry
		{
			System.out.println("Please find the marks for the student: "+ newstuname[i]);

			for (int j=0; j<stumarkcount; j++)
			{
				System.out.println("Mark "+ (j+1)+" "+ stumark[i][j] );
				System.out.println();
			}
		}


//		for (int j=0; j<stunamecount; j++)  //Get the student name from the array and print
//		{
//			System.out.println("Student "+(j+1)+" name is: "+newstuname[j]);
//		}

	}
}

