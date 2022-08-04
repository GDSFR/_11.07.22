package leto22_1.dz3.dz3_6;

import java.util.Scanner;

public class Report {
    private static Employee[] Baza;
    public Report(){

    }
     public static void generateReport(){
         for (int i=0;i<Baza.length;i++) {
             Baza[i].out_s(Baza[i]);
         }
    }
    public static   void set_baza() {
        Scanner sc = new Scanner(System.in);
        Employee[] arr=new Employee[3];double s; String fn;
        for (int i=0;i<arr.length;i++) {
            s=sc.nextDouble();fn=sc.nextLine();fn=sc.nextLine();
            arr[i]=new Employee(s,fn);
            arr[i].out(arr[i]);
        }
        Baza=arr;
        for (int i=0;i<Baza.length;i++) {
            Baza[i].out(Baza[i]);
        }
    }
}
