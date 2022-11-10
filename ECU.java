import java.util.Scanner;
import java.util.Random;
 class CrossingRiver
{
    public static void main(String[] args)
    {
        int roundN = 0;
        int leftM = 3;
        int leftC = 3;
        int rightM = 0;
        int rightC = 0;
        String input1;
        String input2;
        String M1 = "M";
        String M2 = "M";
        String M3 = "M";
        String C1 = "C";
        String C2 = "C";
        String C3 = "C";


        while ((rightM == 3 && rightC == 3) == false || leftM < leftC == false || rightM < rightC == false )
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Crossing the River");
            System.out.println("---------------------------------");
            System.out.println("Round " + roundN + " :");
            roundN++;
            System.out.println("Left"+"\t"+"\t"+"Right");
            System.out.println(M1+M2+M3+C1+C2+C3);


            //M & C for each side
            for(leftM=3; leftM>=0; leftM--)
            {
                System.out.println(leftM);


            }
            System.out.println(M1+M2+M3+C1+C2+C3);

            for(leftC=3; leftC<=3; leftC--)
            {


            }
            System.out.println(M1+M2+M3+C1+C2+C3);

            for(rightM=0; rightM<=3; rightM++)
            {


            }
            System.out.println(M1+M2+M3+C1+C2+C3);

            for(rightC=0; rightC<=3; rightC++)
            {


            }
            System.out.println(M1+M2+M3+C1+C2+C3);



            //boat
            if ( roundN % 2 != 0 )
            {
                System.out.println("-------");

            }
            else
            {  System.out.println("\t"+"\t"+"\t"+"-------");

            }


            do {
                System.out.println("First passenger (c for cannibal, m for missionary): ");
                input1 = sc.nextLine();

                if(input1.equals("c") == false && input1.equals("m") == false)
                {
                    System.out.println("Illegal input! ");
                }
            } while(input1.equals("c") == false && input1.equals("m") == false);

            //ask for inputs
            do {
                System.out.println("Second passenger (c for cannibal, m for missionary, n for none): ");
                input2 = sc.nextLine();

                if(input2.equals("c") == false && input2.equals("m") == false && input2.equals("n") == false)
                {
                    System.out.println("Illegal input! ");
                }
            } while(input2.equals("c") == false && input2.equals("m") == false && input2.equals("n") == false);



            //win or lose
            if(leftM < leftC || rightM < rightC)
                System.out.println("Missionaries eaten by cannibals! You lose! ");

            if(rightM == 3 && rightC == 3)
                System.out.println("Congratulations! You win the game in 17 rounds! ");


            System.out.println("---------------------------------");
        }

    }
}