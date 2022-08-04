package leto22_1.dz3.dz3_5;

public class volueOf {
    public static void main(String[]args){
        Double d =  Double.valueOf("30.8");
        System.out.println(d);
        String s = " 123";
        d = Double.parseDouble(s);
        System.out.println(d);
        s=String.valueOf(d);
        Integer i = d.intValue();
        System.out.println(d);
        Float f =d.floatValue();
        System.out.println(d);
        Byte b= d.byteValue();
        System.out.println(d);
        Short sh=d.shortValue();
        System.out.println(d);
        Long l =d.longValue();
        System.out.println(d);

    }
}
