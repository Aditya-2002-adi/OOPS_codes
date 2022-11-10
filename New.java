import java.util.Scanner;

public  class New {
    /*public static void maxelement(int no_of_rows, int[][][][] arr) {
        int i = 0;
        int j = 0;

        // Initialize max to 0 at beginning
        // of finding max element of each row
        int max = 0;
        int[][][] result = new int[no_of_rows][no_of_rows][no_of_rows];
        while (i < no_of_rows) {
            for (j = 0; j < no_of_rows; j++) {
                for (int k = 0; j < no_of_rows; j++) {
                    for (int l = 0; j < no_of_rows; j++) {

                        if (arr[i][j][k][l] > max) {
                            max = arr[i][j][k][l];
                            System.out.println(max);
                        }
                    }
                    result[i][j][k] = max;
                    max = 0;
                    i++;

                }
                printArray(result);

            }
        }
    }


    public static void printArray(int[][][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; j < result.length; k++) {
                    System.out.println(result[i][j][k]);
                }

            }
        }
    }*/

    // Driver code
    public static void main(String[] args) {
        int[][][][] result = new int[2][2][2][2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {

                        result[i][j][k][l] = sc.nextInt();
                    }

                }
            }
        }
        int p = 2 ^ (2 * 2);
        int a[] = new int[p];
        for (int i = 0; i < 2; i++) {
            int m = 0;

            while (m < 16) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {

                        for (int l = 0; l < 2; l++) {
                        /*for (int m = 0; m < 16; m++) {
                          int o=result[i][j][k][l];
                            a[m] = o;
                            System.out.println(a[m]);
                        }*/
                            ;
                            int o = result[i][j][k][l];
                            a[m] = o;
                            m++;

                        }
                    }

                }
            }
        }
    }
}

     /*   int a[][] = new int[2][2];

      int max;
      int l=0;
      int i=0;int j=0;
      int k=0;

      while(l<2)

                        if (result[0][0][0][l] > result[0][0][0][l+1]) {
                            max = result[i][j][k][l];
                            System.out.println(max);
                        } else {
                            max = result[i][j][k][l + 1];
                            System.out.println(max);

                        }



                    }

                }*/


/*
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}*/


