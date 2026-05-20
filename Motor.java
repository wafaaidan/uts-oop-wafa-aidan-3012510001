public class Motor extends Kendaraan {
    private String tipe;


    public Motor(String jenisKdr, String nama, double hargaSewa, String kondisi, int unit, int jmlHari, String tipe){
        super(jenisKdr, nama, hargaSewa, kondisi, unit, jmlHari);
        this.tipe = tipe;
    }
    public double BiayaTambahan(String tipe) {
        if (tipe == "Sport") {
            return 7000;
        } else{
            return 0;
        }
    }
    
    @Override
    public double hitungHargaAkhir(int jmlSewa) {
        System.out.println("Total Harga = " + hitungTotalHarga(jmlSewa));
        return hitungTotalHarga(jmlSewa) + BiayaTambahan(tipe);
    }
    @Override 
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("-------Informasi Tambahan-------");
        System.out.println("Jenis Motor: " + tipe);

    }
}
