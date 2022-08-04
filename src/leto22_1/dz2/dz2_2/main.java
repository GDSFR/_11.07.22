package leto22_1.dz2.dz2_2;
import java.util.Scanner;
public class main {
    public static void main(String args[]){
        Ball ball = new Ball( 10.0, 34.5);
        ball.setXY(5,5);
        ball.move(43,52.2);
        System.out.println(ball.getX()+" ; "+ball.getY());
        Scanner sc = new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        ball.setXY(x,y);
        System.out.println(ball.getX()+" ; "+ball.getY());

    }
}
