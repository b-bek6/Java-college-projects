/*
    WAP to make a calculator 
        -calculator
            -Addition
            -subtraction
            -multiplication
            -division
*/
public class calculator {
        int num1 = 10;
        int num2 = 5;
        String str1= "bib";
        String str2 = "ek";
        String str3 = str1 + str2; //concatination

        public int Addition(){
            calculator c1 = new calculator();
            return (c1.num1 + c1.num2);
        }
        public int Subtraction(){
            calculator c1 = new calculator();
            return (c1.num1 - c1.num2);
        }
        public int Multiplication(){
            calculator c1 = new calculator();
            return (c1.num1 * c1.num2);
        }
        public int Division(){
            calculator c1 = new calculator();
            return (c1.num1 / c1.num2);
        }
        public static void main(String[] arg){
            calculator cal = new calculator();

            System.out.println("Addition " +cal.Addition()); // concatenation => joining two or more strings together to create a new string
            System.out.println( "Subtraction "+ cal.Subtraction());
            System.out.println("Division "+cal.Division());
            System.out.println("Multiplication "+cal.Multiplication());
            System.out.println(cal.str3);

        }
}
