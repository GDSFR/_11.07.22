package leto22_1.dz2.dz2_4;

public class Comp {
    private int n;
    private String name;
    public Comp(String name,int n){this.name=name;this.n=n;}
    public int get_n(Comp c){return n;}
    public void set_n(int n){this.n=n;}
    public String get_name(Comp c){return name;}
    public void set_name(String name){this.name= name;}
public String out(Comp comp){return "Name: "+comp.get_name(comp)+" Number: "+comp.get_n(comp);}
}
