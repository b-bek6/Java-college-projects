import java.util.Scanner;

public class calculator_control_statement {
    public static void calculator(int num1, int num2, int opt){
        /* using if else statements
        if(opt == 1){
            System.out.println("Addition: " + (num1 + num2));
        }
        else if(opt == 2){
            System.out.println("Subtraction: " + (num1-num2));
        }
        else if(opt == 3){
            System.out.println("Multiplication: " + (num1 * num2));
        }
        else if(opt == 4){
            System.out.println("Division: " + (num1 / num2));
        }
        else{
            System.out.println("Your input is invalid");
        }
         */

        // using switch case
        switch (opt){
            case 1:
                System.out.println("Addition: " + (num1 + num2) );
                break;
            case 2:
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2) );
                break;
            case 4:
                System.out.println("Division: " + (num1 / num2));
                break;
            default:
                System.out.println("Your input is invalid");
                break;
        }
    };
    public static void main(String[] arg){
        calculator_control_statement cal1 = new calculator_control_statement();
        Scanner num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 =num.nextInt();
        System.out.println("Enter second number: ");
        int num2 =num.nextInt();
        System.out.println("Enter \n 1 add for addition \n 2 sub for subtraction \n 3 mul for multiplication \n 4 div for division \n: ");
        int opt =num.nextInt();
        cal1.calculator(num1,num2,opt);
    }
}
