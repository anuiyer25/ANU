import java.util.Scanner;

public class Scannerinput {

    public static void main (String [] args)
    {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter byte number value: ");
//        byte b = sc.nextByte();
//        System.out.println("Enter value for short number: ");
//        short num1 = sc.nextShort();
//        System.out.println("Enter for integer number: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter value for long number: ");
//        long num3 = sc.nextLong();
//        System.out.println("Enter value for float: ");
//        float num4 = sc.nextFloat();
//        System.out.println("Enter value for double: ");
//        double num5 = sc.nextDouble();
//        System.out.println("Enter True or False for the decision: ");
//        boolean bol = sc.nextBoolean();
//        System.out.println("Enter the value for the character :");
//        char ch1 = sc.next().charAt(0);
//        System.out.println("Enter string value: ");
//        String str1 = sc.next();
//
//        System.out.println("value of byte is : "+ b);
//        System.out.println("value short number: "+ num1);
//        System.out.println("Value for integer number: "+num2);
//        System.out.println("Value for long number: " +num3);
//        System.out.println("Value for float: " +num4);
//        System.out.println("Value for double: "+num5);
//        System.out.println("Value entered for the decision is: "+bol);
//        System.out.println("Value of character input took is: "+ch1);
//        System.out.println("Value of the string input: "+str1);

        //System.out.print("Please enter the number : ");
        // int num = sc.nextInt();
        // System.out.println("User entered number :" + num);


//        System.out.println("Please enter value for variable a");
//        int a = sc.nextInt();
//        System.out.println("Please enter value for variable b");
//        int b = sc.nextInt();
//        int c = (a+b);
//        System.out.println("Please enter value for the Name");
//        String text = sc.next();
//        System.out.println(text);
//        System.out.println(c);
//
//        System.out.println("Enter value for short num: ");
//        short num1 = sc.nextShort();
//        System.out.println("Short number user entered is :"+ num1);


//        byte b1 = sc.nextByte();
//        System.out.println(b1);
//        short s1 = sc.nextShort();
//        float f1 = sc.nextFloat();
//        System.out.println(f1);
//        char c1 = sc.next().charAt(0);
//        boolean bo1 = sc.nextBoolean();

        Scanner Anu = new Scanner(System.in);


        System.out.println("Enter byte Value");
        byte a= Anu.nextByte();
        System.out.println("Enter Integer Value");
        int b= Anu.nextInt();
        System.out.println("enter boolean");
        boolean c = Anu.nextBoolean();
        System.out.println("Enter long value");
        long d = Anu.nextLong();

        System.out.println("value of byte :" +a);
        
         System.out.println("value of boolean :" + c);
        System.out.println("value of long :" +d);
    }
}
