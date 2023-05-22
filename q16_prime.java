import java.util.*;

public class q16_prime{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:- ");
    int n=sc.nextInt();
    int i=2;
    for(i=2;i<n;i++){
        if (n%i==0){
            System.out.println(n+" is not prime number.");
            System.out.println(n+" is divisible by "+i+"\n"+n+"/"+i+" = "+ (n/i));
            break;
        }
        else{
            System.out.println(n+" is prime number.");
            break;
        }
    }

}
}