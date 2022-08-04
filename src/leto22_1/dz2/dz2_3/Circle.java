package leto22_1.dz2.dz2_3;

public class Circle {
    private Point O;
    private double r;
    private double s;
    private int n;
    public Circle(Point O,double r,int n){this.O=O;this.r=r;this.n=n;this.s=3.14*Math.pow(this.r,2);}
    public void outC(Circle c){
        System.out.println("Number:"+n+O.outP(O)+" Radius: "+r+" Square: "+3.14*Math.pow(r,2));
    }
    public double get_s(Circle C){return this.s;}
    public void set_s(double s){this.s = s;}
}
