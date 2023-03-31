class stringMethod {
    String student = "BibekGhimire";
    int id = 10;
    char c = 'k';
    public static void main(String faculty_name[]){

        stringMethod c1 = new stringMethod();
        System.out.println(c1.student);
        System.out.println(c1.student.length()); // .length() returns the length of the string
        System.out.println(c1.student.charAt(2)); // charAt(n) gives the character at nth place
        System.out.println(c1.student.substring(3,6)); // substring(starting index, end index) -> prints the certain part of the string
        //lowercase and uppercase
        System.out.println(c1.student.toUpperCase());
        System.out.println(c1.student.toLowerCase());


        //print character
        System.out.print(c1.c);

    }
}