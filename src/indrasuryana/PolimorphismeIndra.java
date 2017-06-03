package indrasuryana;

public class PolimorphismeIndra {
     public static void main (String []args){
      Motor klaksonmotor = new Motor();
      Bis klaksonbis = new Bis();
      Becak klaksonbecak = new Becak();
      Delman klaksondelman = new Delman();
      
      Polimorphisme h;
      System.out.println("Motor");
      h= klaksonmotor;
      h.suara();
      h.jalan();
      
      System.out.println("Bis");
      h=klaksonbis;
      h.suara();
      h.jalan();
      
      System.out.println("Becak");
      h=klaksonbecak;
      h.suara();
      h.jalan();
      
       System.out.println("Delman");
      h=klaksondelman;
      h.suara();
      h.jalan();
}
}
