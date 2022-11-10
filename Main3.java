import java.util.Random;
import java.util.Scanner;

public class Main3{
    static int[] c_max={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    public static void main(String [] args )
    {
        String c;
        for(int i=0;i<10;i++)
        {
            System.out.println("Student Number "+(i+1));
            c=course();
            System.out.println(c+"\n");
            System.out.println("=====================================================================================");
        }
    }
    static String[] courses ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};


    public static String course()
    {
        Random ran=new Random();
        String s="The Respective Courses for allocated slots are: ";
        int a1[]={0,0,0};
        for(int i=0;i<3;i++)
        {
            int a = ran.nextInt(15);
            if(a1[0]==a || a1[1]==a)
            {
                a=ran.nextInt(15);
            }
            s = s + "\n Course: " + courses[a];
          
            slot(a);
            a1[i]=a;
        }
        return s;
    }
    static String[] slots={"A- timings: 9 to 10 ","B - timings: 10:05 to 11","C- timings: 11:05 to 12:05","D- timings: 1 to 2",
            "E- timings: 2:05 to 3"};
    public static void slot(int a1)
    {
        String s=" ";
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("----------choose any slot you want from(0 to 5) Dont take  duplicated values-------------");
        int b=sc.nextInt();

        String c1[]={" "," "};
        if(a1==0)
        {
            a1=a1+1;
        }
        if(c_max[a1]<5)
        {
            if(c1[0].equals(slots[b]) || c1[1].equals((slots[b])) )
            {
                b=sc.nextInt();
            }


            c_max[a1]=c_max[a1]+1;
            s=s+" Slot is "+slots[b];
            c1[i]=slots[b];
            i=i+1;

        }
        System.out.println(s);
    }
}