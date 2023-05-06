import java.util.*;

public class grade_marking{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks:- ");
    int s1=sc.nextInt();
    int s2=sc.nextInt();
    int s3=sc.nextInt();
    int s4=sc.nextInt();
    int s5=sc.nextInt();

    int sum=s1+s2+s3+s4+s5;
    int per=sum/5;
    System.out.println("Percentage = "+per+" %");
    if (per >=90){
        System.out.println("Grade ==> A.");   
    }
    else if (per >=80){
        System.out.println("Grade ==> B.");   
    }
    else if (per >=60){
        System.out.println("Grade ==> C.");   
    }
    else if (per <60){
        System.out.println("Grade ==> D.");   
    }

}
}