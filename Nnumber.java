import java.util.Scanner;

public class Nnumber{
    public static void main(String[] args) {
        System.out.println("Enter N value you want to have");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int n = Integer.parseInt(number);
        int sum = 0;
        for (int i = 0;i<=n;i++){
            sum = sum + i;

        }
        System.out.println("The result of n = "+ n+" = "+ sum);
    }

    
}