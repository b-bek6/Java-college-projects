/*  class college
        variable -> 3
        3 function:
            -> 1st function (return 10)
            -> 2nd function (1st function's return value)
            -> 3re function (print all the value)
        field/ instance variable
 */
class college1 {
    String student = "BibekGhimire";
    int id = 10;
    public static void main(String faculty_name[]){

        college1 c1 = new college1();
        System.out.println(c1.id);
        System.out.println(c1.student.length()); // .length() returns the length of the string
        System.out.println(c1.student.charAt(2)); // charAt(n) gives the character at nth place
        System.out.println(c1.student.substring(3,6)); // substring ->

    }
}