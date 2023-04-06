// reverse string (inbuild / without)
// swap numbers (with three variable, without)
// number is prime or not
public class reverseString {
    String str2 = "";
    char str1;
    public void reverseStr(String str){
        for(int i = str.length()-1 ; i >= 0; i--){
            str1 = str.charAt(i);
            str2 = str2 + str1;
        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str = "reggin";
        //inbuild method
        StringBuilder string = new StringBuilder();
        string.append(str);
        System.out.println(string.reverse());
        // without inbuild methods
        reverseString r1 = new reverseString();
        r1.reverseStr(str);
    }
}
