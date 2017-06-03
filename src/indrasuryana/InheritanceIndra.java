package indrasuryana;

public class InheritanceIndra {
    public static void main (String[] args){
       WildLion myLion = new WildLion ("Simba");
        System.out.println("my Lion is :"+ WildLion.name);
        myLion.eat();  

        WildTiger myTiger = new WildTiger ("Harimau");
        System.out.println("my Tiger is :" + WildTiger.name);
        myTiger.eat();  

        WildSiberianCat myCat = new WildSiberianCat ("Kucingku manis");
        System.out.println("my cat is :" + WildSiberianCat.name);
        myCat.eat(); 
    }
}
