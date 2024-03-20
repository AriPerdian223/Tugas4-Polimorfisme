//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class Main {
    public static void main(String[] args) {
        // Contoh 1: Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("Luas persegi panjang (int): " + persegiPanjang.hitungLuas(5, 4));
        System.out.println("Luas persegi panjang (double): " + persegiPanjang.hitungLuas(5.5, 4.5));

        // Contoh 2: Suara Hewan
        SuaraHewan suaraHewan = new SuaraHewan();
        suaraHewan.suara(); //

        Kucing kucing = new Kucing();
        kucing.suara(); //

        // Contoh 3: Kendaraan
        Kendaraan kendaraan = new Kendaraan("Avanza");
        kendaraan.info();
    }
}

