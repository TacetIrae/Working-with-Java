package gb_lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class lesson_2 {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(rn.nextInt(10, 100));
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
    
