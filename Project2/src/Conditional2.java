
public class Conditional2 {
	public static void main(String[] args) {
		
		String result; 
		int a = 15, b = 10, c = 20, d = 25, e = 55;

        if ((a>b) && (a>c) && (a>d) && (a>e))
            System.out.println("a is bigger");
        else if ((b>c) && (b>d) && (b>e))
            System.out.println("b is bigger");
        else if ((c>d) && (c>e))
            System.out.println("c is bigger");
        else if (d>e)
            System.out.println("d is bigger");
        else
            System.out.println("e is bigger");
		/*
if
if else
if else if
nested if
*/
		
//		if (!(a == b)) 			//condition
//		{
//			System.out.println("Both are Not Equal");
//		    System.out.println("Either a is greatest or b is greatest");
//		}
		
//		if (a!=b)
//		{
//			System.out.println("Correct");
//		}

//
//		int a = 10, b = 17, c= 30;
//
//	if ((a > b) && (a>c))	//IF_Else
//			System.out.println("a is greatest");
//    else if (b>c) {
//        System.out.println("b is greatest");
//    } else
//    {
//        System.out.println("c is greatest");
//    }
		
		
		
		/*if ((a > b) && (a > c ))		
		{
			System.out.println("A is greatest");
		}
		else 
		{
			if (b > c)
			{
				System.out.println("B is greatest");
			}
			else
			{
				System.out.println("C is greatest");
			}
		}*/
		

	// nested if
	 int age=19;
    int weight=60;
    String Location = "Loc1";


        if(age>=20)
                 if (weight>=50)
                     if (Location=="Loc1")

                         System.out.println("You are eligible to donate blood, you are more than 20 years having expected weight");

                    else
                        System.out.println("You are not eligible to donate blood based on less body weight");
                else
                     System.out.println("You don't have expected weight to donate blood");
        else
            System.out.println("Age must be greater than 20");


//    if(age>=20)
//    {
//        if(weight>=50)
//        {
//            System.out.println("You are eligible to donate blood, you are more than 20 years having expected weight");
//        } else
//            {
//                System.out.println("You are not eligible to donate blood based on less body weight");
//            }
//    } else
//        {
//            System.out.println("Age must be greater than 20");
//         }
    }
		
		

	}
