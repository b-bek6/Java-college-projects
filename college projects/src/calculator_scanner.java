import org.w3c.dom.ls.LSInput;
import java.util.Scanner;
public class calculator_scanner {
    public static int Addition(int num1, int num2){
        return (num1 + num2);
    }
    public static int Subtraction(int num1, int num2){
        return (num1 - num2);
    }
    public static int Multiplication(int num1, int num2){
        return (num1 * num2);
    }
    public static int Division(int num1, int num2){
        return (num1 / num2);
    }
    public static void main(String[] arg){
        Scanner num = new Scanner(System.in); //
        System.out.println("Enter first number: ");
        int num1 =num.nextInt();
        System.out.println("Enter second number: ");
        int num2 =num.nextInt();
        System.out.println("Enter third number");
        System.out.println("Addition " +Addition(num1, num2));
        System.out.println( "Subtraction "+ Subtraction(num1, num2));
        System.out.println("Division "+Division(num1, num2));
        System.out.println("Multiplication "+Multiplication(num1, num2));
    }
}