
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class EXMP {

    static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();


        String arr[]=str.split(" ");


        for(int i=arr.length-1;i>=0;i--)
        {

            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry:mp.entrySet())
        {

            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();


        count_freq(str);
    }
}