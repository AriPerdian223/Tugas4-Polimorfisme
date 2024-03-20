//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class Kendaraan {
    private String nama;

    // Constructor untuk menginisialisasi nama mobil
    public Kendaraan(String nama) {
        this.nama = nama;
    }

    // Metode untuk menampilkan info kendaraan
    public void info() {
        System.out.println("Ini adalah kendaraan " + nama + ".");
    }
}