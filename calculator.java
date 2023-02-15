import javax.sound.midi.Soundbank;
import java.util.Scanner;

import first_pj.main;

public class calculator {



    
    public static void main(String[] args) {

        System.out.println("Which option you want to choose:");
        System.out.println("1)Add");
        System.out.println("2)Subtract");
        System.out.println("3)Multiply");
        System.out.println("4)Divide");

        Scanner in = new Scanner(System.in);
        String choiceS = in.nextLine();
        int choice = Integer.parseInt(choiceS);
        System.out.println("Enter first integer");
        String first = in.nextLine();
        System.out.println("Enter second integer");
        String second = in.nextLine();
        double x = Double.parseDouble(first);
        double y =Double.parseDouble(second);
        

        if (choice == 1){
            add(x,y);
        }
        if (choice == 2){
            subtract(x, y);
        }
        if (choice == 3){
            Multiply(x, y);
        }
        if (choice == 4){
            divide(x, y);
        }
        else{
            System.out.println("No following option is availiable");
        }



        
    }
static void add (double x, double y){
    double answer = x+y;
    System.out.println(x+" + " + y + " = "+ answer);
}

static void subtract(double x, double y){
    double answer = x-y;
    System.out.println(x+" - " + y + " = "+ answer);
}
static void Multiply(double x, double y){
    double answer = x*y;
    System.out.println(x+" * " + y + " = "+ answer);
}
static void divide(double x, double y){
    double answer = x/y;
    System.out.println(x+" / " + y + " = "+ answer);
}
    
}
