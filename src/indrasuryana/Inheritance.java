package indrasuryana;

public class Inheritance {
     protected static String name;
   protected void eat(){
       System.out.println("semua kucing besar makan daging!");
   }
}
class WildLion extends Inheritance{
    public WildLion (String nameLion){
        WildLion.name=nameLion;
    }
}
class WildTiger extends Inheritance{
    public WildTiger (String nameTiger){
        WildTiger.name=nameTiger;
    }
}
class WildSiberianCat extends Inheritance{
    public WildSiberianCat (String nameSiberianCat){
        WildSiberianCat.name=nameSiberianCat;
    }
}
