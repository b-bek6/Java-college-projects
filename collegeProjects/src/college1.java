/*  class college
        variable -> 3
        3 function:
            -> 1st function (return 10)
            -> 2nd function (1st function's return value)
            -> 3re function (print all the value)
        field/ instance variable
 */
class college{
    String name;
    int id;
    int faculty;
    public int myMethod(){

        System.out.println("This is inside myMethod-1");
        return 10;
    }
    public void myMethod_2(){
        college c1 = new college();
        System.out.println("This is inside myMethod-2");
        System.out.println(c1.myMethod());
    }
    public void myMethod_3(){
        System.out.println("This is inside the myMethod-3");
    }
    public static void main(String[] arg){
        college col = new college();
        col.myMethod();
        col.myMethod_2();
        col.myMethod_3();

    }
}