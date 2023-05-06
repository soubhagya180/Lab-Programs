import java.util.*;

public class equal_or_not{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a:- ");
    int a=sc.nextInt();
    System.out.println("Enter b:- ");
    int b=sc.nextInt();
    
    if (a==b){
        System.out.println("A and B are equal.");
    }
    else{
        System.out.println("Not Equal.");
    }
}
}