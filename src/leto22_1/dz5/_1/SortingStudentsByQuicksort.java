package leto22_1.dz5._1;

public class SortingStudentsByQuicksort implements Comparing {
    @Override
    public Student[] sort(Student[] array) {
        qs(array,0,array.length-1);
        Comparing.invert(array);
        return array;
    }
       Student[] qs(Student[] array, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2].getScore();
        do {
            while (array[leftMarker].getScore() < pivot) {
                leftMarker++;
            }
            while (array[rightMarker].getScore() > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker].getScore();
                    array[leftMarker].setScore(array[rightMarker].getScore());
                    array[rightMarker].setScore(tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            qs(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            qs(array, leftBorder, rightMarker);
        }
        return array;
    }
    public void printSortQS(Student[] arr){
        System.out.println("-------------------sorted by quick sort-------------------------");
        Comparing.printSort(arr);
    }

}

