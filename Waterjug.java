import java.util.*;
public class Waterjug {


    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the jug1 value");
        int jar1=input.nextInt();
        System.out.println("Enter the jug2 value");
        int jar2=input.nextInt();
        System.out.println("Enter the result value expected");
        int result=input.nextInt();
        Result(jar1,jar2,result);
    }
    public static void Result(int jar1, int jar2, int result){



        int x=0,y=0;

        System.out.println(x+"  "+y);
        while(y!=result){



            int temp=0;
            if(y!=jar2){
                y=jar2;
                if(y==result) {
                    break;
                }

                System.out.println(x+"  "+y);
            }
            if(x+y<jar1){
                x=x+y;
                y=x-y;
                if(y==result){
                    break;
                }

                System.out.println(x+"  "+y);
            }
            else{
                y=y-(jar1-x);
                x=x+(jar1-x);

                System.out.println(x+"  "+y);
                if(y==result) {
                    break;
                }
            }



            if(x==jar1){
                x=0;

                System.out.println(x+"  "+y);
                temp=y;
                y=x;
                x=temp;
                System.out.println(x+"  "+y);
                if(y==result){
                    break;
                }
            }



        }
    }




}
