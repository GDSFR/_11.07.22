package leto22_1.dz5._1;

import java.util.Arrays;

public class SortingStudentsByMergesort implements  Comparing {
    @Override
    public Student[] sort(Student[] arr) {
        int[] arrI=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arrI[i]=arr[i].getScore();
        }
        mergeSort(arrI, 0, arr.length - 1);
        for(int i=0;i<arr.length;i++) {
            arr[i].setScore(arrI[i]);
        }
        return Comparing.invert(arr);
    }
    private void mergeSort(int[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);
        int[] buf = Arrays.copyOf(a, a.length);
        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
    public void printSortMs(Student[] arr){
        System.out.println("-------------------sorted by merge sort-------------------------");
        Comparing.printSort(arr);
    }

}


