public class Penyewa {
    private String namaPenyewa;
    private String namaPelanggan;

    public Penyewa(String namaPenyewa, String namaPelanggan) {
        this.namaPenyewa = namaPenyewa;
        this.namaPelanggan = namaPelanggan;
    }
    public void tampilIdentitas(){
        System.out.println("Petugas: " + namaPenyewa);
        System.out.println("Pelanggan: " + namaPelanggan);
    }
    public void prosesTransaksi(Kendaraan K, int jmlSewa) {

        if (K.getUnit() < jmlSewa) {
            System.out.println("Status Transaksi: Gagal");
            System.out.println("Alasan          : Unit Kendaraan tidak tersedia");

        } else if(K.getKondisi() == "Buruk"){
            System.out.println("Status Transaksi: Gagal");
            System.out.println("Alasan          : Kondisi Unit kendaraan tidak layak");
        }else {
            double hargaAkhir = K.hitungHargaAkhir(jmlSewa);
            System.out.println("Status Transaksi: Berhasil" );
            System.out.println("Harga Akhir     : " + hargaAkhir);
            K.setUnit(jmlSewa);
        }
        System.out.println("Sisa Unit       : " + K.getUnit());
        System.out.println("---------------------------------");
    }
}
