package leto22_1.dz5._1;

import java.util.Scanner;

public class Student {
    static public Scanner sc=new Scanner(System.in);
    private String name;
    private String surname;
    private int course;
    private String speciality;
    private int group;
    private int score;
    public String getName(){return this.name;}
    public void  setName(String n){this.name=n;}
    public String getSurname(){return this.surname;}
    public void  setSurname(String sn){this.surname=sn;}
    public int getCourse(){return this.course;}
    public void  setCourse(int c){this.course=c;}
    public String getSpeciality(){return this.speciality;}
    public void  setSpeciality(String s){this.speciality=s;}
    public int getGroup(){return this.group;}
    public void  setGroup(int g){this.group=g;}
    public int getScore(){return  this.score;}
    public void setScore(int i){this.score=i;}
    public Student(String name,String surname,String speciality,int course,int group,int score){
        this.name=name;this.surname=surname;this.speciality=speciality;this.course=course;this.group=group; this.score=score;
    }
    public Student(){};
    public void print(){System.out.println(this.getName()+" "+this.getSurname()+" "+this.getSpeciality()+" Course:"+this.getCourse()+" Group:"+this.getGroup()+" Score:"+this.score);}
    public void copy(Student o1){
        this.setName(o1.name);
        this.setSurname(o1.surname);
        this.setSpeciality(o1.speciality);
        this.setCourse(o1.course);
        this.setGroup(o1.group);
        this.setScore(o1.score);
    }
    Student(int i){this.score=i;}
}
