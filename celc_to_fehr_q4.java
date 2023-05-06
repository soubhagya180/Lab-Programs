import java.util.*;

public class celc_to_fehr{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the temp in celcius:- ");
    double c=sc.nextInt();
    double f=(c*1.8)+32;
    System.out.println("Temp in Fehrenheit ==> "+String.format("%.3f",f));
}
}