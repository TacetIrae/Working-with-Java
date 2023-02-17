import java.util.Arrays;
import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter N value");
        String n_val = in.nextLine();
        int nValue = Integer.parseInt(n_val);
        System.out.println("Enter x value");
        String x = in.nextLine();
        System.out.println("Enter y value");
        String y = in.nextLine();
        int i = 0;
        String[] arr = new String[nValue];
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j<nValue;++j){
            if (i == 0){
                arr[j] = x;
                i++;
             

            }
            else if (i == 1){
                arr[j] = y;
                i--;
             
            }
            else{
                System.out.println("Out of range");
             
            }
           
        }
        System.out.println(Arrays.toString(arr));


    }
}
