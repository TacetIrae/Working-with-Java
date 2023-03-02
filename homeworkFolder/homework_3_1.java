package homeworkFolder;
import java.util.Arrays;
import gb_lessons.lesson_2;

/*Алгоритм сортировки слияинием */
public class homework_3_1 {

    public static int[] mergeSort (int[] sortArr){
        int[] buffer = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int [sortArr.length];
        int[] results = mergeSortIn(buffer,buffer2,0, sortArr.length);
        return results;
    }
    public static int[] mergeSortIn(int[] buffer,int[] buffer2,int startInd,int endInd){
        if (startInd >= endInd-1){
            return buffer;
        }
        int middle = startInd +(endInd-startInd)/2;
        int[] sorted = mergeSortIn(buffer, buffer2, startInd, middle);
        int[] sorted2 = mergeSortIn(buffer, buffer2, middle, endInd);

        int index1 = startInd;
        int index2 = middle;
        int dIndex = startInd;
        int[] result = sorted ==buffer ? buffer2:buffer;
        while (index1<middle && index2 < endInd){
            result[dIndex++] = sorted[index1] < sorted2[index2]? sorted[index1++] : sorted2[index2++];
        }
        while(index1 < middle){
            result[dIndex++] = sorted[index1++];
        }
        while (index2 < endInd){
            result[dIndex++] = sorted[index2++];
        }
        return result;
        
    }
    public static void main(String[] args) {
        int[] sortArr = {7,2,3,1,8,9,88};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
        
    }
    
}

