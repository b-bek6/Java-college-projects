// to find if a number is prime or not
public class primeNumber {
    int flag;
    public void isPrime(int num){
        for(int index = 2; index < num/2; index++){
            if(num/index==0){
                flag = 1;
            }else{
                flag = 0;
            }
        }
        if(flag==0){
            System.out.println("Not a Prime number");
        }else{
            System.out.println("Prime number");
        }
    }
    public static void main(String[] args) {
        primeNumber p1 = new primeNumber();
        p1.isPrime(45);
    }
}
