package gb_lessons;

import javax.xml.transform.Source;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lesson {
    public static void main(String[] args) {
        String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h"+"e"+"l"+"l"+"o";
    String s5 = new String("hello");
    String s6 = new String (new char[]{'h','e','l','l','o'});
    ArrayList<String> arr = new ArrayList<>(List.of(s1,s2,s3,s4,s5,s6));

    for(int i = 0; 1 < arr.size() ;i++){
        for (int j = 1+1;j<arr.size();j++){
          System.out.printf("[i:%d, j:%d] (%s==%s)\n",i,j, arr.get(i),arr.get(j) ==arr.get(1));
          System.out.printf("[i:%d,j:%d] (%s.equals(%s)) -> %s\n",i,j, arr.get(i),arr.get(j),Objects.equals(arr.get(i),arr.get(j)));
        }
    }
   
}
}
