import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
       /* float f=12.456f;
        System.out.println(Float.toHexString(f));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);*/
        int n;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[] = new int[n];
        for (int i:arr) {
            arr[i] = sc.nextInt();
            s = s + arr[i];
        }
        System.out.println(s/n);
    }
}
