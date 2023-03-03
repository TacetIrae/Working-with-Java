package homeworkFolder;

import java.util.Arrays;
import java.util.Scanner;

public class homework_3_2 {
    public static int[] remove_Element (int[] myArray,int index){
        if (myArray == null|| index<0||index>= myArray.length){
            return myArray;
        }
        int[] rArray = new int[myArray.length-1];
        for (int i = 0, k =0; i< myArray.length;i++){
            if (i == index){
                continue;
            }
        rArray[k++] = myArray[i];
        }
        return rArray;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,56,5,8,0,12,4,7,11,56};
        System.out.println(Arrays.toString(array));
        System.out.println("Please choose which index to remove");
        int choice = sc.nextInt();
        if (choice < 0 && choice > array.length){
            System.out.println("Index is out of range");
        }
        array = remove_Element(array, choice);
        System.out.println("Array result:"+ Arrays.toString(array));


    }
}
