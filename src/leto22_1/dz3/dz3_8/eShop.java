package leto22_1.dz3.dz3_8;

import java.util.ArrayList;
import java.util.Scanner;

public class eShop {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        Autentification a=new Autentification();
        ArrayList<String > b=new ArrayList<String>();
        while (true) {
            System.out.println("Select action:" + '\'' + "1-Show Catalogues" + '\'' + "2-Show list_name "+"3-Show basket" );
            int i = sc.nextInt();
            switch (i) {
                case 1: {
                    for (Catalogues c : Catalogues.values()) {
                        System.out.println(c);
                    }
                    break;
                }
                case 2:{
                    sc=new Scanner(System.in);
                    Catalogues c= Catalogues.valueOf(sc.nextLine());
                    c.toShow_c(c,b);
                    break;
                }
                case 3:{
                    for (String s:b) {
                        System.out.println(s);
                    }
                }
            }
        }

    }
}
