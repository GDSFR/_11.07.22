package leto22_1.dz5._1;

import java.util.Random;

public class Main {
    public static Student[] gen(){
        Random r=new Random();
        Student[] arr = new Student[20];
        for (int a=0;a<arr.length;a++) {
            arr[a]=new Student(r.nextInt(0,300));
            System.out.println("---"+arr[a].getScore());
        }
        return arr;
    }

    public static void main(String[] args) {
        SortingStudentsByIns s=new SortingStudentsByIns();
        SortingStudentsByQuicksort qs=new SortingStudentsByQuicksort();
        SortingStudentsByMergesort Ms= new SortingStudentsByMergesort();
        s.printSortI(s.sort(gen()));
        qs.printSortQS(qs.sort(gen()));
        Ms.printSortMs(Ms.sort(gen()));
    }
}
