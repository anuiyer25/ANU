import java.util.Scanner;

public class Loop1 {


	public static void main(String[] args) {

		//below code is examples related to different loops

//		Print 1 to 10;

//		int i = 1;
//		while ((i<=10)){
//			System.out.println(i);
//			i++;
//		}

//		while (i<=10){
//			System.out.println(i);
//			i+=2;
//		}

//		do {
//			System.out.println(i);
//			i++;
//		} while (i<=10);
//


//		int i=1;    // To print 1 to 10   1  2  3  ..... 10
//		while(i <=10)
//		{
//			System.out.print(i+ ",  ");
//			     i++;  //i=i+1;
//		}

//		int i=1;   // To print 10 to 1   10  9  8  .....1
//		while(i >=1)
//		{
//			System.out.print(i+ ",  ");
//			i--;  //i=i-1
//		}

//		1 2 3 .... 10;

//		int n=12;   // To print 1 to 10   1   2  3  ..... 10
//		do
//		{
//			System.out.println(n);
//			n++;
//		}while(n<=10);

//		String str="Hello World";  // To print the string in ascending order

//		int n=str.length()-1;
//		int j=0;
//		while(j<=n)
//		{
//			System.out.print(str.charAt(j));
//			j++;
//		}


//	String str="Hello World";
//		int n=str.length()-1;
//		while(n>=0)
//		{
//			System.out.print(str.charAt(n));
//			n--;
//		}

//		String str1="Hello World";    // To print in ascendng order
//		String strtemp = "";
//		int n2=str1.length()-1;
//		int k=0;
//		while(k<=n2)
//		{
//			strtemp = strtemp+str1.charAt(k);
//			System.out.println(strtemp);
//			k++;
//		}

//		String str1="Hello World";  // To print in decending order
//		String strtemp = "";
//		int n2=str1.length()-1;
//		int k=n2;
//		while(k>=0)
//		{
//			strtemp = strtemp+str1.charAt(k);
//			System.out.println(strtemp);
//			k--;
//		}

//		for(int j=0; j<=20; j+=5)
//		{
//			System.out.println(j);
//
//		}

//		for(int i = 19; i>=1; i-=2){
//			System.out.println(i);
//		}

//
//		System.out.println();
//
//		System.out.println("Printing odd numbers");
//		for(int i=1; i<=10; i+=2)      // i = 1 ,  i = i + 2
//		{
//			System.out.print(i + "   ");
//		}

//		System.out.println("Printing even numbers");     //  i = i + 2,
//		for(int i=2; i<=10; i+=2)
//		{
//			System.out.print(i + "   ");
//		}

		int mat = 1;
		for (int i=1; i<=3; i++)  //Considered for row -  matrix formulation  // i = 3
		{
			for (int j = 1; j <= 3; j++)  // Considered for column   // j = 1
			{
//				System.out.print(i + " " + j + "    ");
				System.out.print(mat + "   ");
				mat++;
			}
			System.out.println();
		}




////		Get marks for each student, total for each student

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please give number of students for marks calculation");
//		int numstu = sc.nextInt();
//
//		System.out.println("Please enter how many subject to get marks");
//		int numsubs = sc.nextInt();
//
//		int [] mark = new int[numsubs];
//		int sum;
//		for (int i=0; i<=(numstu-1); i++){
//			sum = 0;
//			for (int j=0; j<=(numsubs-1); j++){
//				System.out.println("Please enter marks of Student "+(i+1) +" Subject "+(j+1));
//				mark[j] = sc.nextInt();
//				sum = sum + mark[j];
//			}
//			System.out.println("The total mark of student "+ (i+1) + " is: "+sum);
//		}


		// Enhanced for or for each
//		It traverses each element of the given collection one by one.
//		Drawback of the enhanced for loop is that it cannot traverse the elements in reverse order.
//		int marks[] = {70, 85, 96, 69, 78};
//		for(int i:marks)
//			System.out.println("Student Mark "+ i);

		/*
		Tasks using While also using do while
		1. Write a program for allow positive data to print from 11 to 25
		2. Write a program where the while loop should not allow
		   the variable to proceed based on the condition not satisfy
		   same also through do while, just first entry and at the end condition not satisfy
		3. Write a program to print odd numbers from 49 to 29
		4. Write a program to print 	even numbers from 50 to 70
		5. Get a number input from user and print if the number is odd or even
		6. Please refer the above nested for loop program for number of student and marks inputs from the scanner
			Write a program to check if the Subject marks >=60 then print student having good academic
			if any of the subject less than 60 then print need student need additional coaching
		 */

		}
}