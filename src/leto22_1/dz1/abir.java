package leto22_1.dz1;
import java.util.Scanner;
public class abir {
    public static void main(String[] args){
    Scanner sc =new Scanner (System.in);
    int i;
    System.out.print("Введите целое число: ");
    if(sc.hasNextInt()){
        i =sc.nextInt();
        System.out.println(i*2);
    }
    else{
        System.out.print("Вы не ввели целое число правильно.");
    }
    }
}
