package leto22_1.dz4_nasledovaniye.dz4_5;

import java.util.Scanner;

public class test {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        Book[] arr=new Book[sc.nextInt()];
        for (int i=0;i<arr.length;i++) {
            arr[i]=new Book(new Scanner(System.in).nextLine());
        }
        Reader r=new Reader(3,321,"Aboba","ohrana","28.09.2029");
        r.takeBook(arr);
    }
}
