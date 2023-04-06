// import java.util.Scanner;
public class setname{
    String name;
    public static void main(String[] arg){
        setname s1 = new setname();
        s1.setName("Bibek");
        System.out.println(s1.getName());
    }
    public void setName(String str){
        this.name = str;
    }
    public String getName(){
        return (this.name);
    }
}