import java.util.*;

public class q1_switch{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:- ");
    int a = sc.nextInt();
    System.out.println("Enter b:- ");
    int b= sc.nextInt();
    System.out.println("Enter operator:- ");
    String o = sc.next();
    switch (o){
        case "+":
            System.out.println(a+b);
            break;
        
        case "-":
            System.out.println(a-b);
            break;

        case "*":
            System.out.println(a*b);
            break ; 

        case "/":
            System.out.println(a/b);
            break;

        default:
            System.out.println("Enter the correct operand.");
            break;
    }

}
}
