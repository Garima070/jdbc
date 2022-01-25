package array;

import java.util.Scanner;
public class Arr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s[]=new Student[3];
        for (int i=0;i<3;i++){
            s[i]=new Student();
            s[i].roll=sc.nextInt();
            s[i].age=sc.nextInt();
            s[i].hgt= sc.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.println("rollno="+s[i].roll);
            System.out.println("age="+s[i].age);
            System.out.println("height="+s[i].hgt);
        }
        }
    }
class Student
{
    int roll,age,hgt;
}