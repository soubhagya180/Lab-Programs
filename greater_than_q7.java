import java.util.*;

public class greater_than{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the a:- ");
    int a=sc.nextInt();
    System.out.println("Enter the b:- ");
    int b=sc.nextInt();
    System.out.println("Enter the c:- ");
    int c=sc.nextInt();

    if (a>=b && a>=c){
        System.out.println(a+" is Greatest.");
    }
    else if (b>=a && b>=c){
        System.out.println(b+" is Greatest.");
    }
    else if (c>=a && c>=b){
        System.out.println(c+" is Greatest.");
    }

}
}