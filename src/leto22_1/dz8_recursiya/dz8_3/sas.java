package leto22_1.dz8_recursiya.dz8_3;

import java.util.Scanner;

public class sas {
    public static double recursion(double c,int i) {
        Double r=i/Math.pow(10, c);
        Double y=-Math.pow(10,c)+i;
        int R=r.intValue();
        int Y=y.intValue();
        if(c==0){
            return 0;
        }

        else {
          return (R + recursion(c-1,Y));
        }
    }
        public static void main (String []args){
        Scanner sc =new Scanner(System.in);
        String A =sc.nextLine();
        String B =sc.nextLine();
        Integer a,b;
        a=Integer.parseInt(A);
        b=Integer.parseInt(B);
        double c =a.doubleValue();
        int t =0;
            for(Double i=Math.pow(10,c-1);i<Math.pow(10,c);i++){
                if((recursion(c,i.intValue()))==b.intValue()){
                    t++;
                }
            }
            System.out.print(t);

        }

}
