package leto22_1.dz4_nasledovaniye.dz4_7;

public interface count {
   static int count(String s){return s.length();};
   static String nechet(String a){
       String sa="new string: ";
       for( int i=0;i<a.length();i++){
           if(i%2==0) {
               sa = sa + a.charAt(i);
           }
       }
       return sa;
   }
   static String reverse(String s){
       String sa="new string:";
       for(int i=s.length();i>0;i--){
           sa=sa+s.charAt(i-1);
       }
       return sa;
   }
}
