public class Main {
    public static void main(String[] args) {
        Kendaraan K1 = new Mobil("Mobil", "Toyota", 40000, "Baik", 3, 5, 4, "matic");
        Kendaraan K2 = new Mobil("Mobil", "Toyota", 30000, "Buruk", 5, 5, 2, "manual");
        Kendaraan K3 = new Motor("Motor", "Yamaha", 25000, "Baik", 17, 7,"Sport");
        Kendaraan K4 = new Motor("Motor", "Suzuki", 15000, "Buruk", 17, 7,"Copling");
        Penyewa penyewa1 = new Penyewa("Bucciarati", "Fugo");
        Penyewa penyewa2 = new Penyewa("Bucciarati", "Fugo");
        Penyewa penyewa3 = new Penyewa("Bucciarati", "Fugo");
        Penyewa penyewa4 = new Penyewa("Bucciarati", "Fugo");
        



        penyewa1.tampilIdentitas();
        K1.tampilInfo();
        penyewa1.prosesTransaksi(K1, 2);

        penyewa2.tampilIdentitas();
        K2.tampilInfo();
        penyewa2.prosesTransaksi(K1, 2);
        penyewa3.tampilIdentitas();
        K3.tampilInfo();
        penyewa3.prosesTransaksi(K1, 2);
        penyewa4.tampilIdentitas();
        K4.tampilInfo();
        penyewa4.prosesTransaksi(K1, 2);

            
      
    }
}
