package gb_lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lesson_3 {

    public static void main(String[] args) {
         ArrayList<String> arr = new ArrayList<>(Arrays.asList("Меркурий",
         "Венера",
         "Земля",
         "Марс",
         "Юпитер",
         "Сатурн",
         "Уран",
         "Нептун",
         "Плутон",
         "Венера",
         "Плутон"));
        showCount(arr);
        delRep(arr);
        System.out.println("After deleting process");
        showCount(arr);
    }
    public static void showCount(ArrayList<String> arr) {
        
        Set<String> mySet = new HashSet<>(arr);
        System.out.println(mySet);

        for (String planet:mySet){
           int count = Collections.frequency(arr,planet);
           System.out.printf("Count %s -> %d\n",planet,count);
        }
    }
    public static void delRep(ArrayList<String> data) {
        Iterator<String> iterator = data.iterator();
        while(iterator.hasNext()){
            if (Collections.frequency(data, iterator.next())>1){
             iterator.remove();
            }
        }
        System.out.println(iterator);
        iterator.remove();

    }

    
}
