package homeworkFolder;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;

import org.apache.logging.log4j.core.util.ArrayUtils;

public class homework_3_3 {
    public static void main(String[] args) {
        int[] array = {1,2,56,9,3,8,9,24,11};
        int length = array.length;
        int sum = 0;
        int min = 0;
        int max = 0;

        for(int i = 0; i<array.length;i++){
            sum+= array[i];
        }
        double mean = sum/length;
        IntSummaryStatistics stats = Arrays.stream(array).summaryStatistics();
        min = stats.getMin();
        max = stats.getMax();
        System.out.println("Min = "+ min + " Max = "+ max + " Mean = "+ mean);
     
    }

    

}
