package gb_lessons;

import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.transform.Source;

import first_pj.main;

public class lesson_4 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("adc");
        arr.add("Hello");
        arr.add ("1");
        arr.add("2");
        Iterator<String> iterator = arr.iterator();
        System.out.println(arr);
        while (iterator.hasNext()){
            String current = iterator.next();
            try{
                Integer.parseInt(current);
                iterator.remove();
            } catch (Exception e){
                System.out.printf("%s - its not an integer\n",current);
            }
        }
        System.out.println(arr);
    }
    public static Boolean isParsable(String number){
        try {
            Integer.parseInt(number);
            return true;

        }catch(Exception e){
            return false;
        }
    }
    
}
