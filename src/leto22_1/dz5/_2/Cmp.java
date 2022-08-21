package leto22_1.dz5._2;

import leto22_1.dz5._1.Student;

import java.util.Comparator;
class Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        System.out.println("antibaza");

        return 0;
    }
}
class nameCmp extends Cmp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class surnameCmp extends Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }

}
class specCmp extends Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSpeciality().compareTo(o2.getSpeciality());
    }
}
class courseCmp extends Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse()- o2.getCourse();
    }
}
class groupCmp extends Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGroup()-o2.getGroup();
    }
}
class scoreCmp extends Cmp implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore()-o2.getScore();
    }
}
