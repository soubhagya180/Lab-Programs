import java.util.*;
import java.lang.Math;

public class q20_deci_bin{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose the conversion:- \n1:- Press 1 for Binary to Decimal\n2:- Press 2 for Decimal to Binary ==> ");
    int g=sc.nextInt();
    
    if (g==1){
    System.out.println("Enter the number in binary:- ");
    int n=sc.nextInt();
    int temp=n;
    int i=0;
    int a=0;
    int c=0;    
    while(temp>0){
        a=temp%10;
        c=c+(a*((int)Math.pow(2,i)));
        temp/=10;
        i++;
    }
    System.out.println(n+" in decimal is = "+c);
    }
    else if(g==2){
    System.out.println("Enter the number in Decimal:- ");
    int n=sc.nextInt();
    int temp=n;
    int i=0;
    int a=0;
    int c=0;
    if (n%2!=0){
        while(temp>0){
        a=temp%2;
        c=c*10+a;
        temp/=2;
        // System.out.print(c);
    }
    int tempe=c;
    int rem=0;
    int rev=0;
    while(tempe>0){
        rem=tempe%10;
        rev=rev*10+rem;
        tempe=tempe/10;
    }
    System.out.print(rev);
    }
    else {
        while(temp>0){
        a=temp%2;
        c=c*10+a;
        temp/=2;
        // System.out.print(c);
    }
    System.out.print(c+"0");
    }
    
    }
    }
}
