package leto22_1.dz3.dz3_8;

import java.util.Objects;
import java.util.Scanner;

public class Autentification {
    private String Login="log";
    private String Password="pass";
    Autentification() {
        System.out.println("Enter login and password:"+'\n'+"Login-");
        Scanner sc =new Scanner(System.in);
        String l,p;
        while (true){
            l= sc.nextLine();
            System.out.println("Password-");
            p=sc.nextLine();
            if(l.equals(Login) && p.equals(Password)){
                System.out.println("Welcome to Estalia gentlemen");
                break;
            }
            else {
                System.out.println("why are you gay?");
                sc = new Scanner(System.in);
            }
        }
    }
}
