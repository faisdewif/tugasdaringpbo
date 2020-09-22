
package tugasdaring.fais;

public class Arsipku implements Biodata, Nilai  {
    public static void main(String[] args) {
      Arsipku ps = new Arsipku();
      ps.tampilNama();
      ps.tampilTempatLahir();
      ps.tampilHobi();
      ps.tampilNilaiAgama();
      ps.tampilNilaiBahasaIdonesia ();
      ps.tampilNilaiMatematika();
}
    
        @Override
    public  void tampilNama() {
        System.out.println("Namaku Fais Dewi Faulinda");
    }
        @Override
    public  void tampilTempatLahir() {
        System.out.println("Tempat Tanggal Lahir 11 - November -  2002"); 
    }
        @Override
    public  void tampilHobi() {
        System.out.println("Hobiku REBAHAN BOSS!!1");
        }
        @Override
    public  void tampilNilaiAgama() {
        System.out.println("Nilai Agama : 100");
        }
        @Override
    public  void tampilNilaiBahasaIdonesia () {
        System.out.println("Nilai Bahasa Indonesia : 100"); 
        }
        
        @Override
    public  void tampilNilaiMatematika() {
        System.out.println("Nilai Matematika : 90");
        }
}
