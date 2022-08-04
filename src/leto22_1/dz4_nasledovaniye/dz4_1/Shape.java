package leto22_1.dz4_nasledovaniye.dz4_1;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;
    public Shape(String c, boolean f){
        this.color=c;
        this.isFilled=f;
    }
    public Shape(){}
    public String getColor(){return color;}
    public boolean isFilled(){return isFilled;}
    public void setColor(String c){this.color=c;}
    public void setFilled(boolean b){this.isFilled=b;}
    @Override
    public String toString(){return " Colour: "+ color+" filled? "+isFilled;}
    abstract double getArea();
    abstract double getPerimeter();

}
