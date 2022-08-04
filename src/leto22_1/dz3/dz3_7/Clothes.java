package leto22_1.dz3.dz3_7;

public abstract class Clothes implements WomenClothing,MenClothing {
    protected Size size;
    protected int cost;
    protected String colour;
    Clothes(Size size, int cost, String colour) {
        this.size=size; this.colour=colour; this.cost=cost;
    }
    @Override
    public String toString(){return size+" "+cost+" "+colour+" "+size.getDescription();}
    public Size getSize(){return size;}

    @Override
    public void dressWoman(Clothes[] arr) {

    }
}
