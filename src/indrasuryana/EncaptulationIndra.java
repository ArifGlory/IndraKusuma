package indrasuryana;


public class EncaptulationIndra {
    public static void main(String[]args){
         Encaptulation a=new Encaptulation ();
        a.Nama="Indra Suryana";
        a.Alamat="Bandar Lampung";
        a.Status="Mahasiswa";
        a.setNotelpon(0);
        System.out.println("Nama = "+ a.Nama);
        System.out.println("Alamat = "+ a.Alamat);
        System.out.println("Status = "+ a.Status);
        System.out.println("Notelpon = "+ a.getNotelpon());
    
}
}
