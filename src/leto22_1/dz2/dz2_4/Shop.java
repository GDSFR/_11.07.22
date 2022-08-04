package leto22_1.dz2.dz2_4;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n =sc.nextInt();
        int k=n++;
        System.out.println("Initialize the array: 'Name' ");
        Comp[] arr=new Comp[k];
        String name = sc.nextLine();
        for(int j=0;j<k;j++){
            name = sc.nextLine();
            arr[j]=new Comp(name,j+1);
            System.out.println(arr[j].out(arr[j]));
        }
        ArrayList<Comp> comps =new ArrayList<>();
        for (Comp a:arr) {
            comps.add(a);
        }
    while(true){
        System.out.println("Select action:"+'\''+"1-Add"+'\''+"2-Delete"+'\''+"3-Search"+'\''+"4-Print");
        int i=sc.nextInt();
        switch(i){
            case 1:{
                System.out.println("Enter name:");
                k++;
                Comp c=new Comp(sc.nextLine(),k);
                c=new Comp(sc.nextLine(),k);
                comps.add(c);
                break;
            }
            case 2:{
                System.out.println("Enter number:");
                int b = sc.nextInt();
                comps.remove(b-1);
                for (int v=b-1;b-1<comps.size();b++) {
                   comps.get(b - 1).set_n(b);
                }
                break;
            }
            case 3:{
                System.out.println("Enter name:");
                name = sc.nextLine();
                int flag =0;
                name = sc.nextLine();
                int y=0;
                for(Comp a:comps){
                    if (name.equals(comps.get(y).get_name(comps.get(y)))){
                        System.out.println("Available, number is: "+(y+1));
                        flag++;
                        break;
                    }
                    y++;
                }
                if(flag==0) {
                    System.out.println("Unavailable");
                }

                break;
            }
            case 4:{
                for (Comp a:comps) {
                    System.out.println(a.out(a));
                }
            }
        }
        }
    }
}
