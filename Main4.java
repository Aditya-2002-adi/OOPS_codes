import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N VALUE:");
        int n = sc.nextInt();
        String[] week = {"sunday", "monday", "Tuesdaty", "Wednesday", "Thurday", "Friday", "saturadt"};
        System.out.println("enter d value:");
        int D=sc.nextInt();
        int m=D-n;
       String o= week[m];
        System.out.println("You output is.."+o);

    }
}
