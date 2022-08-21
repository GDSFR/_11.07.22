package leto22_1.dz5._2;
import leto22_1.dz5._1.Student;
import java.util.*;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        ArrayList<Student> arrayList= setArray();
        printArr(arrayList);
        Cmp cmp= (Cmp) cmpChoice();
        sorting(arrayList,cmp);
        printArrS(arrayList);
    }
    static Scanner sc=new Scanner(System.in);
    static Comparator<Student> cmpChoice(){
        System.out.println("Choose: 1-name, 2-surname, 3- speciality, 4 - course, 5 - group, 6 - score");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                return new nameCmp();
            case 2:
                return new surnameCmp();
            case 3:
                return new specCmp();
            case 4:
                return new courseCmp();
            case 5:
                return new groupCmp();
            case 6:
                return new scoreCmp();
        }
        return null;
    }
    public static ArrayList<Student> setArray(){
        Random r=new Random();
        ArrayList<Student> iDNumber=new ArrayList<>();
        String[] names={"Migel","George","Thomas","Jan","Hikaru","Jack","Roman","Ivan","Tolyan","D(p)enis"};
        String[] surnames={"Nazimba","Jefferson","Wallet","Smith","Nakamura","Shiny","Ukraintsev","Nabokov","P(d)ushilin","P(d)etrov"};
        String[] specialities={"IT","Maths","Physics","Ohrana","Cybernetics"};
        for(int i=0;i<5;i++){
            iDNumber.add(new Student(names[r.nextInt(0,10)],surnames[r.nextInt(0,10)],specialities[r.nextInt(5)],r.nextInt(1,5),r.nextInt(1,12), r.nextInt(300)));
        }
        return  iDNumber;
    }
    static void printArr(ArrayList<Student> arr){
        for (Student s:arr) {
            s.print();
        }
    }
    static void printArrS(ArrayList<Student> arr){
        System.out.println("---------------------------------------------------------------------");
        for (int i=0;i<arr.size();i++) {
            System.out.println("|||");
            arr.get(i).print();
        }
    }
    static ArrayList<Student> sorting(ArrayList<Student> arr, Cmp cmp){
        ArrayList<Student> arrI=new ArrayList<>(arr);
        mergeSort(arrI,0,arrI.size()-1,cmp);
        arr=(ArrayList<Student>) arrI.clone();
        return arr;
     }
    static void mergeSort(ArrayList<Student> a, int lo, int hi, Cmp cmp) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid,cmp);
        mergeSort(a, mid + 1, hi,cmp);
        ArrayList<Student> buf = new ArrayList<Student>(a);
        for (int i=lo;i<hi;i++){
            buf.get(i).copy(a.get(i));
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a.get(k).copy(buf.get(j));
                j++;
            } else if (j > hi) {
                a.get(k).copy(buf.get(i));
                i++;
            } else if (0>cmp.compare(buf.get(j) , buf.get(i))) {
                a.get(k).copy(buf.get(j));
                j++;
            } else {
                a.get(k).copy(buf.get(i));
                i++;
        }
    }
}
}