package leto22_1.dz2.dz2_2;

public class Ball {
    private double x;
    private double y;
    public Ball(double x,double y) {
        this.x=x;
        this.y=y;
    }
    public Ball(){ x = 0.0;y = 0.0;}
    public void move(double dx,double dy){this.x+=dx;this.y+=dy;}
    public void setXY(double X,double Y){this.x = X; this.y = Y;}
    public void setX(double X){this.x = X;}
    public double getX(){return x;}
    public void setY(double Y){this.y = Y;}
    public double getY(){return y;}
    @Override
    public String toString(){
        return ("X:"+x+"Y:"+y);
    }
}
