package leto22_1.dz2.dz2_1;
import java.util.Scanner;

public class dz2_1 {


         public static void main(String args[]) {
             String name;
             Author me= new Author("vova ","poshel_naxui.mirea.ru ",'g');
             System.out.println(me.toString());
             System.out.println("Enter Author's name");
             Scanner sc=new Scanner(System.in);
             name =sc.nextLine();
             System.out.println(name);
        }

}