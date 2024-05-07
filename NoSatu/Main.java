import java.util.Scanner;

// Class Hotel sebagai blueprint untuk membuat objek hotel
class Hotel {
    // Variabel instance untuk data hotel
    private String nama;
    private int kapasitasKamar;
    private double hargaKamar;

    // Constructor untuk inisialisasi objek Hotel
    public Hotel(String nama, int kapasitasKamar, double hargaKamar) {
        this.nama = nama;
        this.kapasitasKamar = kapasitasKamar;
        this.hargaKamar = hargaKamar;
    }

    // Getter dan setter untuk mendapatkan dan mengatur nilai variabel instance
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKapasitasKamar() {
        return kapasitasKamar;
    }

    public void setKapasitasKamar(int kapasitasKamar) {
        this.kapasitasKamar = kapasitasKamar;
    }

    public double getHargaKamar() {
        return hargaKamar;
    }

    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    // Method Overloading untuk pesan kamar dengan berbagai opsi
    public void pesanKamar() {
        System.out.println("Pesan kamar standar");
    }

    public void pesanKamar(int jumlahKamar) {
        System.out.println("Pesan " + jumlahKamar + " kamar");
    }

    // Method Overriding untuk mencetak informasi hotel
    @Override
    public String toString() {
        return "Hotel: " + nama + ", Kapasitas Kamar: " + kapasitasKamar + ", Harga Kamar: " + hargaKamar;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input informasi hotel dari user
        System.out.println("Masukkan nama hotel:");
        String namaHotel = scanner.nextLine();

        System.out.println("Masukkan kapasitas kamar:");
        int kapasitasKamar = scanner.nextInt();

        System.out.println("Masukkan harga kamar per malam:");
        double hargaKamar = scanner.nextDouble();

        // Membuat objek Hotel menggunakan constructor
        Hotel hotel = new Hotel(namaHotel, kapasitasKamar, hargaKamar);

        // Menampilkan informasi hotel
        System.out.println("Informasi Hotel:");
        System.out.println(hotel);

        // Memanggil method pesanKamar
        hotel.pesanKamar();
        hotel.pesanKamar(2);
    }
}
