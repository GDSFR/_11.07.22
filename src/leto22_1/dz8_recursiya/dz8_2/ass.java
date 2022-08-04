package leto22_1.dz8_recursiya.dz8_2;

import java.util.Scanner;


public class ass {
    public static void recursion(int a,int b) {
        if(a>b){
                recursion(a, b + 1);
                System.out.print(b +" ");
        } else if (a<b) {
                System.out.print(a+" ");
                recursion(a + 1, b);
        }
    }
        public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        String A =sc.nextLine();
        String B =sc.nextLine();
        Integer a,b;
        a=Integer.parseInt(A);
        b=Integer.parseInt(B);
        recursion(a.intValue(), b.intValue());

    }
}
