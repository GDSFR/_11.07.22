package leto22_1.dz3.dz3_7;

public class Atelier implements WomenClothing,MenClothing{

    @Override
    public void dressMan(Clothes[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i].dressMan(arr);
        }
    }

    @Override
    public void dressWoman(Clothes[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i].dressWoman(arr);
        }
    }
}
