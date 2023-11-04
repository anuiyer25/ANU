
import java.util.Scanner;

class Array2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a[][] = new int[2][2];
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				    System.out.print("Enter a["+ i +"]"+"["+ j +"]: ");
					a[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
					System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}





