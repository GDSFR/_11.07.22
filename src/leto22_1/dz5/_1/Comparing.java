package leto22_1.dz5._1;

public interface Comparing {
    Student[] sort(Student[] arr);
    static Student[] invert(Student[] arr){
        int temp;
        for (int i = arr.length-1, j = 0; i >=arr.length/2 ; i--,j++) {
            temp = arr[j].getScore();
            arr[j].setScore(arr[i].getScore());
            arr[i].setScore(temp);
        }
        return arr;
    }
    static void printSort(Student[] arr){
        for(Student ass:arr){
            System.out.println(ass.getScore());
        }
    };
}
