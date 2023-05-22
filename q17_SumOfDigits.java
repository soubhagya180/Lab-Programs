import java.util.*;

public class q17_SumOfDigits{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int temp=n;
    int a=0;
    int c=0;
    while(temp>0){
        a=temp%10;
        c+=a;
        temp/=10;
    }
    System.out.println("Sum of the digits of "+n+" = "+c);
}
}