import java.util.*;

public class q5_fibonacci{

static int fibo(int x){
    if (x==0 || x==1){
        return x;

    }
    else{
        return fibo(x-1) + fibo(x-2); 
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the term:- ");
    int a=sc.nextInt();
    System.out.println(fibo(a));
}
}