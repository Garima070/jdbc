import java.util.Scanner;
public class Str1 {
    static int logic(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public  static void main(String[] args)
    {
        int a=5,b=3;
        Str1 obj=new Str1();
        int k=obj.logic(a,b);
        System.out.println(k);
    }

}