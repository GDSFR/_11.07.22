package leto22_1.dz3.dz3_4;

import java.util.Random;
import java.util.Scanner;

public class test_na_gayya {
    public static void main(String []args){
        int n;
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println("Krasava");
                break;
            } else {
                System.out.println("Why are you gay?");
                sc = new Scanner(System.in);
            }
        }
        Random rand =new Random();
        int[] arr = new int [n];
        for(int i =0;i<arr.length;i++) {
            arr[i]=rand.nextInt(n+1);
            System.out.print(arr[i]+" ");
        }
        int[] arr_ch=new int[n];
        System.out.println("\n"+"Chet: ");
          for(int i =0;i<arr.length;i++) {
            if(arr[i]%2==0 && arr[i]!=0){
                for(int j =0;;j++){
                    arr_ch[j]=arr[i];
                    System.out.print( arr_ch[j]+" ");
                    break;
                }
            }
        }
    }
}
