package vivek_handsome_hunk;

public class Practice1 {
    public static void main(String args[])
    {
        int a=4,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);

    }
        finally {
            System.out.println("running!!!!!!!!!!");
        }
    }
}
