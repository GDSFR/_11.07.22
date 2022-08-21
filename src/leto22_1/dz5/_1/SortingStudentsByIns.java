package leto22_1.dz5._1;

public class SortingStudentsByIns implements Comparing{
    @Override
    public Student[] sort(Student[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left].getScore();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > array[i].getScore()) {
                    array[i + 1].setScore(array[i].getScore());
                } else {
                    break;
                }
            }
            array[i + 1].setScore(value);

        }
        return array;
    }
    public void printSortI(Student[] arr){
        System.out.println("-------------------sorted by insert-------------------------");
        Comparing.printSort(arr);
    }
}
