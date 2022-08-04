package leto22_1.dz1;
import java.util.Scanner;

public class dz1 {
    public static void fact(int a){
        int f=1;
        for(int i =1;i<=a;i++) {
            f*=i;
        }
        System.out.println("fact:"+f);
    }
    public static void main(String[] args){
    int j=1;
    int a=5;
        for(double i=1;i<11;){
            System.out.println(j+"-"+1/i);
            i++;j++;
        }
        fact(a);
    }
}
            /*
        Scanner sc =new Scanner(System.in);
        int sum =0;
        int[] arr  = new int[5];
        int i=0,min=999999999,max=0;
        System.out.println("Vvodi govno");

        while (i<arr.length){
                    if(sc.hasNextInt()){
                        arr[i]= sc.nextInt();
                        if (arr[i]>max) max=arr[i];
                        if(arr[i]<min) min=arr[i];
                        sum+=arr[i];
                    }
                    else {System.out.println("Ti mudak ");
                        sc.next();
                        i--;
                    }
                    i++;
                }
        System.out.println("Summa: ");
        System.out.println(sum);
        System.out.println("Srednee govnische: ");
        System.out.println(sum/arr.length);
        System.out.println("Max: ");
        System.out.println(max);
        System.out.println("Min: ");
        System.out.println(min);
*/