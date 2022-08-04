package leto22_1.dz8_recursiya.dz8_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ss {
    public static void recursion(int n,int q,int t) {
        if(n==1){
            System.out.print(n);
            t++;
        }
        else{
            t=((n-1)*n)/2;
            recursion(n-1,q,t);
            for(int i=0;i<n;i++){
                t++;
                if(t>q){
                    break;
                }
                else {
                    System.out.print(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        recursion(10,sc.nextInt(),0);
   }
}
