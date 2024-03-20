//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class SuaraHewan {
    // Metode untuk menampilkan suara hewan umum
    public void suara() {
        System.out.println("Hewan Kucing membuat suara.");
    }
}

class Kucing {
    // Overriding metode untuk menampilkan suara anjing
    public void suara() {
        System.out.println("Meow Meow!");
    }
}
