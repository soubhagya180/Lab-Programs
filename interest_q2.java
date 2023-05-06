import java.util.*;
import java.lang.Math;

public class interest_q2{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter time:- ");
    double t=sc.nextDouble();
    
    System.out.println("Enter rate:-");
    double r=sc.nextDouble();
    
    System.out.println("Enter principle:- ");
    double p=sc.nextDouble();

    double si=(p*t*r)/100;
    double r2= r/100.0;
    double rr=Math.pow(1.0+r2,t);
    double ci=(p*rr)-p;

    System.out.println("Simple Interest = "+si);
    System.out.println("Compound Interest = "+String.format("%.4f",ci));
}
}