import java.util.*;
import java.lang.Math;

public class q19_Armstrong{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int rem=0;
    int c=0;
    int temp=n;
    while(temp>0){
        rem=temp%10;
        c=c+((int)Math.pow(rem,2));
        temp/=10;
    }
    System.out.println(c);
}
}