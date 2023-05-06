import java.util.*;

public class area_of_circle{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle:- ");
    int r=sc.nextInt();
    double area=3.14*r*r;
    double circum=3.14*r*2;
    System.out.println("Area = "+area);
    System.out.println("Circumference = "+circum);
}
}