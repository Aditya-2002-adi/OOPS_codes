import java.util.*;

public class AI4 {
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("----------19MIS7056_Shaik.Mehnaaz Tabasum-----------");
                System.out.println( );
                System.out.println("*********---------I have taken  cities path cost  in form of Matrix to " +
                        "caluculate Minimum cost..---------*********");
                System.out.println();

                System.out.println("Enter number of vertices:");
                int n=sc.nextInt();
                int[][] tsp =new int[20][20];
                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.print(tsp[i][j]);
                        }
                        System.out.println();
                }


                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.println("Enter path cost from city"+(i+1)+" to "+(j+1)+":");
                                tsp[i][j]=sc.nextInt();
                        }

                }

                for(int i=0;i<n;i++)
                {
                        for(int j=0;j<n;j++)
                        {
                                System.out.print(tsp[i][j]);
                        }
                        System.out.println();
                }



                System.out.println("Starting vertex is: "+"VIT-Amaravati");
                System.out.println("Ending vertex is: "+"VIT-Amaravati");

                // Function Call
                findMin(tsp);
        }

        static void findMin(int[][] tsp)
        {
                int sum = 0;
                int counter = 0;
                int j = 0, i = 0;
                int min = Integer.MAX_VALUE;
                List<Integer> visitedRouteList = new ArrayList<>();
                visitedRouteList.add(0);
                int[] route = new int[tsp.length];

                while (i < tsp.length
                        && j < tsp[i].length) {
                        if (counter >= tsp[i].length - 1) {
                                break;
                        }

                        if (j != i
                                && !(visitedRouteList.contains(j))) {
                                if (tsp[i][j] < min) {
                                        min = tsp[i][j];
                                        route[counter] = j + 1;
                                }
                        }
                        j++;

                        if (j == tsp[i].length) {
                                sum += min;
                                min = Integer.MAX_VALUE;
                                visitedRouteList.add(route[counter] - 1);
                                j = 0;
                                i = route[counter] - 1;
                                counter++;
                        }
                }

                i = route[counter - 1] - 1;

                for (j = 0; j < tsp.length; j++) {

                        if ((i != j) && tsp[i][j] < min) {
                                min = tsp[i][j];
                                route[counter] = j + 1;
                        }
                }
                sum += min;
                System.out.println( );
                System.out.print(".....Minimum Cost is : ");
                System.out.println(sum);
        }

}