public class Main {

    public Main() {
        System.out.println("Kalkulator Fisika Diaktifkan");
    }

    public double hitungEnergi(double massa, double kecepatan) {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public double hitungEnergi(double massa, double gravitasi, double ketinggian) {
        return massa * gravitasi * ketinggian;
    }

    public static void main(String[] args) {
        Main kalkulator = new Main();

        double massa = 50;  
        double kecepatan = 10;  
        double gravitasi = 9.8;  
        double ketinggian = 20;  

        double energiKinetik = kalkulator.hitungEnergi(massa, kecepatan);
        double energiPotensial = kalkulator.hitungEnergi(massa, gravitasi, ketinggian);

        System.out.println("Energi Kinetik: " + energiKinetik + " Joule");
        System.out.println("Energi Potensial: " + energiPotensial + " Joule");
    }
}