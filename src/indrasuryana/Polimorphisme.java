package indrasuryana;

public class Polimorphisme {
    String jenis;
    String ciri;

public void suara(){
    System.out.println("Suara Klakson");
}
public void jalan(){
    System.out.println("Cara Berjalan");
}
}
class Motor extends Polimorphisme {
    public void suara(){
        System.out.println("Tinnnntinnnn");
    }
    public void jalan(){
        System.out.println("Berlari");
        System.out.println("======================");
    }
    }
class Bis extends Polimorphisme{
    public void suara(){
        System.out.println("Telolettelolet");
    }
    public void jalan(){
        System.out.println("Terbang");
        System.out.println("=====================");
    }
}
class Becak extends Polimorphisme{
    public void suara(){
        System.out.println("Tottottt");
    }
    public void jalan(){
        System.out.println("Terbang");
        System.out.println("=====================");
    }
}
class Delman extends Polimorphisme{
    public void suara(){
        System.out.println("Hiiiiiihiii");
    }
    public void jalan(){
          System.out.println("Berenang");
          System.out.println("=======================");
    }
}
