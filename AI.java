import java.util.Scanner;
public class AI {


    public static void main(String[] args) {
        System.out.println("19MIS7056_Mehnaaz tabasum..");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();


        int a[][] = new int[n][n];

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "        ");
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                int m = j + i;

                if (m % 2 == 0) {

                    a[i - 1][j - 1] = m;
                    System.out.print(a[i - 1][j - 1] + " ");
                } else {
                    a[i - 1][j - 1] = -m;
                    System.out.print(a[i - 1][j - 1] + " ");

                }

            }
            System.out.print("   ");

        }

        System.out.println();
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
*/
        System.out.println();
        System.out.println("Now Maiximizer performs:(E)");

        maxelement(n, a);


    }


    public static void maxelement(int num, int[][] a) {
        int i = 0;
        int max = 0;
        int[] result = new int[num];
        while (i < num) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            result[i] = max;
            max = 0;
            i++;

        }
        printArray(result);

    }


    public static void printArray(int[] result) {

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }

            int smallest_element = result[0];


            for (int i = 0; i < result.length; i++) {
                {
                    if (result[i] < smallest_element) {
                        smallest_element = result[i];
                    }
                }
            }
        System.out.println();
            System.out.println("After Minimizer performance(O): " + smallest_element);


        }


    }


