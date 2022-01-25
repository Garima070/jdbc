

import java.util.Scanner;

public class Practice2 {
    public static void main(String args[])
    {
        int n;
        int[] a=new int[2];
        Scanner sc=new Scanner((System.in));
        n=sc.nextInt();
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        try {
            int k=sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (a[k] == a[i]) {
                    System.out.println(a[i]);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
