import java.util.*;

public class q18_reverse{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int temp=n;
    int rem=0;
    int rev=0;
    while(temp>0){
        rem=temp%10;
        rev=rev*10+rem;
        temp/=10;
    }
    System.out.println(rev);

}
}
