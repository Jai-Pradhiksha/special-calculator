/*A friend of yours wants to create a special calculator.
He only wants two operations to be handled by that calculator i.e. : addition and subtraction.
The calculator can only accept either 2 numbers or 3 numbers. There are two functionalities for this calculator -
        Normal -> in this role - the calculator works normally -
         where upon adding the numbers are added, while upon subtracting the numbers are subtracted.
        Opposite -> in this role - the calculator works opposite to the normal role -
        where upon adding the numbers are subtracted, while upon subtracting the numbers are added.
        That friend have approached you for the help, in creating such a calculator.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

class SpecialCalculator{
    public boolean special;
    public int addition(int number1, int number2){
        if(special){
            return number1+number2;
        }
        else{
            return number1-number2;
        }
    }

    public int addition(int number1, int number2, int number3){
        if(special){
            return number1+number2+number3;
        }
        else{
            return number1-number2-number3;
        }
    }

    public int subtraction(int number1, int number2){
        if(special){
            return number1-number2;
        }
        else{
            return number1+number2;
        }
    }

    public int subtraction(int number1, int number2, int number3){
        if(special){
            return number1-number2-number3;
        }
        else{
            return number1+number2+number3;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialCalculator specialCalculator = new SpecialCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice of calculator:");
        System.out.println("1. Normal");
        System.out.println("2. Opposite");

        int choice = scanner.nextInt();
        try{
            if (choice==1){
                specialCalculator.special= Boolean.parseBoolean("True");
            } else if (choice==2) {
                specialCalculator.special= Boolean.parseBoolean("False");
            }
            else{
                throw new IllegalArgumentException("Enter valid choice");
            }
        }
        catch(IllegalArgumentException illegalArgumentException){
            System.out.println("Error occured:"+illegalArgumentException);


        }
        System.out.println("Enter input count (2 or 3): ");
        int parameterCount = scanner.nextInt();
        try {


            if (parameterCount == 2) {
                System.out.println("\nEnter the numbers:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("Addition : "+specialCalculator.addition(num1, num2));
                System.out.println("Subtraction : "+specialCalculator.subtraction(num1, num2));
            } else if (parameterCount == 3) {
                System.out.println("\nEnter the numbers:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                System.out.println("Addition : "+specialCalculator.addition(num1, num2, num3));
                System.out.println("Subtraction : "+specialCalculator.subtraction(num1, num2, num3));
            }
            throw new InputMismatchException("\nEnter valid number count");
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("Error occured:"+inputMismatchException);
        }
    }
}

