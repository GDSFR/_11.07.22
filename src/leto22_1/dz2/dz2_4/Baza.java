package leto22_1.dz2.dz2_4;
import java.util.ArrayList;
import java.util.Scanner;
public class Baza {
    private int size;
    private Comp[] Cb=new Comp[size];
    public Baza(int size){
        this.size=size;
        Scanner sc = new Scanner(System.in);
            for(int j=0;j<(size+1);j++){
                Comp comp = new Comp(sc.nextLine(),j);
                this.Cb[j]=comp;
                System.out.println(Cb[j].out(Cb[j]));
            }
        }
    public void addComp(String name){
        size++;
        Comp comp =new Comp(name,size);
        Cb[size]=comp;
        Cb[size].set_n(size);
    }
    public void deleteComp( Comp c){
        ArrayList<Comp> comps=new ArrayList<>();
        comps.remove(c.get_n(c));
        size--;
    }
    public void search(String name){
        int flag =0;
        for(int i =0;i<size;i++){
            if (name==Cb[i].get_name(Cb[i])){
                System.out.println("Available, number is: "+(i+1));
                flag++;
                break;
            }
        }
        if(flag==0) {
            System.out.println("Unavailable");

        }
    }
    public int get_size(){return size;}
}
