package leto22_1.dz3.dz3_7;

public class Skirt extends Clothes implements WomenClothing {
    Skirt(Size size, int cost, String colour) {
        super(size, cost, colour);
    }
    public int getCost(){return this.cost;}
    public String  getColour(){return this.colour;}

    @Override
    public  void dressWoman(Clothes[] arr){
        System.out.println("This woman is dressed with skirt."+" Color: "+this.getColour()+" Cost: "+ this.getCost()+" Size: " +this.size.getEuroSize()+this.size.getDescription());

    }

    @Override
    public void dressMan(Clothes[] arr) {

    }
}
