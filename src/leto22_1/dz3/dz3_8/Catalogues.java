package leto22_1.dz3.dz3_8;

import leto22_1.dz2.dz2_4.Comp;

import java.util.ArrayList;
import java.util.Scanner;

public enum Catalogues {
    c_1(1),c_2(2),c_3(3);
    private int n;
    Scanner sc = new Scanner(System.in);

    Catalogues(int n){this.n=n;}

    public void toShow_c(Catalogues m,ArrayList b) {
        switch (m) {
            case c_1:
                for (C_1 c : C_1.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something?");
                    if (sc.nextLine().equals("yes")) {
                        System.out.println("Witch lot?");
                        sc = new Scanner(System.in);
                        C_1 first = C_1.valueOf(sc.nextLine());
                        b.add(first.toString());
                    }
                    else break;
                }

            case c_2:{
                break;
            }
            case c_3:{
                break;
            }
        }
    }
}
