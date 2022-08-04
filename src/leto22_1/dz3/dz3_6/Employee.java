package leto22_1.dz3.dz3_6;

import java.text.DecimalFormat;

public class Employee {
    private String fullname;
    private  double salary;
    public Employee(double salary,String fullname){this.salary = salary;this.fullname = fullname;}
    DecimalFormat format = new DecimalFormat("1500.05");
    public  void out( Employee e){System.out.println("Fullname: "+fullname+" Salary: "+ salary);}
    public  void out_s( Employee e){System.out.println(" Salary: "+ format.format(salary));}

}
