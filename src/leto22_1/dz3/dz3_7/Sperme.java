package leto22_1.dz3.dz3_7;

import java.util.Scanner;

public class Sperme {
    public  static Scanner sc=new Scanner(System.in);
     public static void main(String[] args) {

         System.out.println("N:");
         Clothes[] arr=new Clothes[sc.nextInt()];
         for(int i=0;i<arr.length;i++){
             switch (sc.nextInt()){
                 case 1: {                 sc=new Scanner(System.in);
                     arr[i]=new TShirt(Size.valueOf(sc.nextLine()),20,"black");break;}
                 case 2: {                 sc=new Scanner(System.in);
                     arr[i]=new Pants(Size.valueOf(sc.nextLine()),40,"white");break;}
                 case 3: {                 sc=new Scanner(System.in);
                     arr[i]=new Skirt(Size.valueOf(sc.nextLine()),25,"red");break;}
                 case 4: {                 sc=new Scanner(System.in);
                     arr[i]=new Tie(Size.valueOf(sc.nextLine()),15,"yellow");break;}
             }
         }
             for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i].toString());
             }
         Atelier a=new Atelier();
         a.dressMan(arr);
         a.dressWoman(arr);
    }
}
