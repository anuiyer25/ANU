import java.util.Scanner;

public class Arrayaddition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row for matrix: ");
        int matrow = sc.nextInt();
        System.out.println("Enter number of column for matrix");
        int matcol = sc.nextInt();

        int a[][] = new int[matrow][matcol];
        int b[][] = new int[matrow][matcol];
        int c[][] = new int[matrow][matcol];

//        int a[][] = new int[2][2];
//        int b[][] = new int[2][2];
//        int c[][] = new int[2][2];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("Enter a[" + i + "]" + "[" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                System.out.print("Enter b[" + i + "]" + "[" + j + "]");
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

    }
}


