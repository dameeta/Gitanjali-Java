package basic1;
import  java.util.*;
public class userInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 nos..");
        int x=sc.nextInt();
        int y=sc.nextInt();
        char op= sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

