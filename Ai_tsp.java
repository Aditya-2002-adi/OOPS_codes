

import java.util.Scanner;

class MEA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MEA M = new MEA();

        System.out.println("19MIS7056_Mehnaaz tabasum");
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println("1 is blocked state");
        System.out.println("Initail state is at 2 ");
        System.out.println("Goal state is at 9 ");
        int[][] a = new int[n][m];
        int goal = 15;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        int Ii = 3;
        int Ij = 0;
        System.out.println("INITIAL STATE value is :" + a[Ii][Ij] + "at " + "  (" + Ii + "," + Ij + ")");
        int gi = 0;
        int gj = 4;
        System.out.println("GOAL STATE: " + a[gi][gj] + "at " + "  (" + gi + "," + gj + ")");
        int ci = Ii;
        int cj = Ij;
        double o = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Intail state to Goal state Distance" + o);
        System.out.println();

        cj = moveright(ci, cj);
        System.out.println("New Current states" + ci + ", " + cj);
        System.out.println();
        double R = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + R);
        System.out.println();


        ci = moveUp(Ii, Ij);
        System.out.println("New Current states" + ci + ", " + cj);
        double U = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + U);
        System.out.println();

        if (U < R) {
            System.out.println("Correct Minimum state is" + U);
        } else {
            System.out.println("Correct Minimum state is" + R);
        }
        System.out.println();
        System.out.println("Continue up and right operations");

        cj = moveright(ci, cj);
        System.out.println("New Current states" + ci + ", " + cj);
        System.out.println();
        double R1 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + R);
        System.out.println();


        ci = moveUp(Ii, Ij);
        System.out.println("New Current states" + ci + ", " + cj);
        double U1 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + U);
        System.out.println();

        if (U1 < R1) {
            System.out.println("Correct Minimum state is" + U);
        } else {
            System.out.println("Correct Minimum state is" + R);
        }

        cj = moveright(ci, cj);
        System.out.println("New Current states" + ci + ", " + cj);
        System.out.println();
        double R2 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + R);
        System.out.println();


        ci = moveUp(Ii, Ij);
        System.out.println("New Current states" + ci + ", " + cj);
        double U2 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + U);
        System.out.println();

        if (U1 < R1) {
            System.out.println("Correct Minimum state is" + U);
        } else {
            System.out.println("Correct Minimum state is" + R);
        }
        cj = moveright(ci, cj);
        System.out.println("New Current states" + ci + ", " + cj);
        System.out.println();
        double R3 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + R);
        System.out.println();


        ci = moveUp(Ii, Ij);
        System.out.println("New Current states" + ci + ", " + cj);
        double U3 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + U);
        System.out.println();

        if (U1 < R1) {
            System.out.println("Correct Minimum state is" + U3);
        } else {
            System.out.println("Correct Minimum state is" + R3);
        }

        System.out.println();


        cj = moveright(ci, cj);
        System.out.println("New Current states" + ci + ", " + cj);
        System.out.println();
        double R4 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + R4);
        System.out.println();


        ci = moveUp(Ii, Ij);
        System.out.println("New Current states" + ci + ", " + cj);
        double U4 = M.EucledianDistance(ci, cj, gi, gj);
        System.out.println("Eucledina distance of " + U4);
        System.out.println();

        if (U1 < R1) {
            System.out.println("Correct Minimum state is" + U4);
        } else {
            System.out.println("Correct Minimum state is" + R4);
        }

        System.out.println();
        double Goal = M.EucledianDistance(0,4,0,4);
        System.out.println("Eucledian Distance is"+Goal);
        System.out.println("Hence we have reached our goal state"+"("+gi+","+gj+")");



    }




    public static int moveright(int Ii, int Ij) {
    int ci=Ii;
       int cj=Ij+1;
        System.out.println("Current state after Move_right operation"+"("+ci+","+cj+")");
        return cj;
    }


    public static int moveUp(int ci, int cj) {
        int Ui=ci-1;
        int Uj=0;
        System.out.println("Current state after Move_Up operation"+"("+Ui+","+Uj+")");
        return ci;
    }
    public double EucledianDistance(int x1, int y1, int x2, int y2) {
        double d = 0;

        d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return d;
    }
    public double EucledianDistance2(int x1, int y1, int x2, int y2) {
        double d = 0;

        d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return d;
    }
}
