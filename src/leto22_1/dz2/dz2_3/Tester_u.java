package leto22_1.dz2.dz2_3;
import java.util.Scanner;
public class Tester_u {
    private static int n;

    public static void setN(int N) {
        n = N;
    }

    public static void main(String args[]){
        int m; double x=0;double y=0; double r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        m=sc.nextInt();
        setN(m);
        Point[] e =new Point[n];
        Circle[] t = new Circle[n];
        System.out.println("Enter array of circles:");

        for(int i=0;i<n;i++){
            System.out.println("N"+(i+1));
            x =sc.nextDouble(); y = sc.nextDouble(); r = sc.nextDouble();
            Point O=new Point(x,y);
            Circle circle =new Circle(O,r,i+1);
            t[i]=circle;
            e[i]=O;
        }
        for(int i=0;i<n;i++){
            t[i].outC(t[i]);
        }
        System.out.println("Sorted:");

        for (int left = 0; left < t.length; left++) {
            Circle value = t[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.get_s(value) < t[i].get_s(t[i])) {
                    t[i + 1] = t[i];
                } else {
                    break;
                }
            }
            t[i + 1] = value;
        }

            for(int i=0;i<n;i++){
            t[i].outC(t[i]);
        }
    }
}
