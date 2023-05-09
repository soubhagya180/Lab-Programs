import java.util.*;

public class q4_even_odd_sum{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:- ");
    int a=sc.nextInt();
    int i=1;
    int es=0,os=0;
    for(i=i;i<=a;i++){
        if (i%2==0){
            es=es+i;
            // System.out.println(es);
            // System.out.println("i = "+i);

        }
        else {
            os=os+i;
        }
    }
    System.out.println("Sum of even digits till "+a+" = "+es);
    System.out.println("Sum of odd digits till "+a+" = "+os);

}
}