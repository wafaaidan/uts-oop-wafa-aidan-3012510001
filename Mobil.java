public class Mobil extends Kendaraan {
    private String transmisi;
    private int jmlKursi;

    public Mobil(String jenisKdr, String nama, double hargaSewa, String kondisi, int unit, int jmlHari, int jmlKursi, String transmisi){
        super(jenisKdr, nama, hargaSewa, kondisi, unit, jmlHari);
        this.jmlKursi = jmlKursi;
        this.transmisi = transmisi;
    }
    public double BiayaTambahan(int jmlKursi) {
        if (jmlKursi >= 4) {
            return 5000;
        } else{
            return 0;
        }
    }
    
    @Override
    public double hitungHargaAkhir(int jmlSewa) {
        System.out.println("Total Harga = " + hitungTotalHarga(jmlSewa));
        return hitungTotalHarga(jmlSewa) + BiayaTambahan(jmlKursi);
    }
    @Override 
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("-------Informasi Tambahan-------");
        System.out.println("Jumlah Kursi: " + jmlKursi + " kursi" );
        System.out.println("Transmisi: " + transmisi);
    }
}
