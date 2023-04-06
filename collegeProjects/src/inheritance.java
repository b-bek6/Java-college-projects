// inheritance
// final - helps to prevent inheritance
 public class inheritance // this is main class (use final key word to prevent inheritance)
{
    String str="mainClass";
    // private String str2 = "privateKeyword";
    public void func1(){
        System.out.println("This is first class");
    }
}
class inherit extends inheritance // derived class
{
    public static void main(String[] args) {
        inherit f1 = new inherit();
        f1.func1();
        System.out.println(f1.str);
//        System.out.println(f1.str2); -> private variable can't be accessed from derived class.
    }
}
