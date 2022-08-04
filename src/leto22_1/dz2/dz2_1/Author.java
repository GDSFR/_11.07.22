package leto22_1.dz2.dz2_1;

public  class Author{
    private String name ;
    private String eMail;
    private char gender;
    public Author(String name,String eMail,char gender){
        this.name=name;
        this.eMail=eMail;
        this.gender=gender;
    }


    public String getName(){return name;}
    public String geteMail(){return eMail;}
    public char getGender(){return gender;}
    public void seteMail(String n_eMail){this.eMail=n_eMail;}
    @Override
    public String toString() {
        return ("Author: "+name+"eMail: "+eMail+"Gender: "+gender);
    }
}
