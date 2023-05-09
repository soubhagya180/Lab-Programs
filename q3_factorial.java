import java.util.*;

public class q3_factorial{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int d=fact(n);
    System.out.println("The Factorial of "+n+" = "+d);

}
public static int fact(int x){
    if (x==1 || x==0){
        return 1;
    }
    else {
        return x*fact(x-1);
    }
}
}