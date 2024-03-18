package arraysdemo;
import  java.util.*;
public class singleDim {

    public static void main(String[] args) {

        System.out.println("Enter the limit  you want to give to an array");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int x[]=new int[limit];
        System.out.println("Enter the numbers you want to enter");
        for(int i=0;i<limit;i++)
        {
            x[i]=sc.nextInt();

        }
        for(int i=0;i<x.length;i++)
        {
            System.out.println(x[i]);

        }


    }
}
