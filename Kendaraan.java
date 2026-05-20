public abstract class Kendaraan{
    private String jenisKdr;
    private String nama;
    private double hargaSewa;
    private String kondisi;
    private int unit;
    private int jmlHari;

    public Kendaraan(String jenisKdr, String nama, double hargaSewa,  String kondisi, int unit, int jmlHari) {
        this.jenisKdr = jenisKdr;
        this.hargaSewa = hargaSewa;
        this.nama = nama;
        this.kondisi = kondisi;
        this.unit = unit;
        this.jmlHari = jmlHari;
    }
    public void setUnit(int jmlSewa){
        unit -= jmlSewa;
    }
    public String getKondisi(){
        return kondisi;
    }
    public int getUnit(){
        return unit;
    }
    public void tampilInfo(){
        System.out.println("Nama :" + nama);
        System.out.println("Kondisi: " + kondisi);
        System.out.println("Harga: " + hargaSewa);
        System.out.println("Unit: " + unit);
        System.out.println("Hari Sewa: " + jmlHari);
    }
    public double hitungTotalHarga(int jmlSewa){
        return jmlSewa * hargaSewa;
    }
    public abstract double hitungHargaAkhir(int jmlSewa);
}