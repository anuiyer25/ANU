public class Arraymultidimension {
    public static void main(String[] args) {

        int num[][] = {
                {4, 6, 8 },
                {11, 15, 24},
                {121, 248, 576}
        };


        for (int i=0; i<=2; i++) {
            for (int j=0; j<=2; j++) {
                System.out.print(num[i][j]);
                System.out.print("   ");
                }
            System.out.println();


        }

    }

}
