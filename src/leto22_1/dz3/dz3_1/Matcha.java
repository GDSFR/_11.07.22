package leto22_1.dz3.dz3_1;
import java.util.Random;
import java.util.*;
public class Matcha {
    public static void main(String []args){
        Random r = new Random();
        int[] arr_class = new int [20];
        System.out.println("Before sort:"+"\n"+"Class");

        for (int a=0;a<arr_class.length;a++) {
            arr_class[a]=r.nextInt(1000);
            System.out.println(arr_class[a]+" ");
        }
        System.out.println("Method");
        double[] arr_method=new double[20];
        for (int a=0;a<arr_method.length;a++) {
            arr_method[a]=r.nextInt(1000);
            System.out.println(arr_method[a]+" ");
        }
        for (int left = 0; left < arr_class.length; left++) {
            int value = arr_class[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr_class[i]) {
                    arr_class[i + 1] = arr_class[i];
                } else break;
            }
            arr_class[i + 1] = value;
        }
        for (int left = 0; left < arr_method.length; left++) {
            double value = arr_method[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr_method[i]) {
                    arr_method[i + 1] = arr_method[i];
                } else {
                    break;
                }
            }
            arr_method[i + 1] = value;
        }
        System.out.println("After sort:"+"\n"+"Class");
        for (int a:arr_class) {
            System.out.println(a+" ");
        }
        System.out.println("Method");

        for (double a:arr_method) {
            System.out.println(a+" ");
        }


    }
}
