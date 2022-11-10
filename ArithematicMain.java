import java.util.ArrayList;
import java.util.Collections;

 class GetUniqueRandomNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}