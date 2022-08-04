package leto22_1.dz3.dz3_3;

import java.util.Random;

public class _4_brata {
    public static void main(String []args) {
        Random random = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(90) + 10;
            System.out.print(arr[i]+" ");
        }
        int f=0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                f++;
            }
        }
        if(f==3){System.out.println("\n"+"Rises strictly");}
        else{System.out.println("\n"+"Do not rises strictly, number of rises: "+f);}
    }
}
