package UnguidedMgg03;

public class PengolahSuhu {

    public static final double NILAI_KOSONG = -1.0;
    private double[] suhuHarian;

    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i;
            }
        }
        return -1;
    }

    public void isiDataKosong() {
        int idx = cariIndexKosong();
        if (idx != -1) {
            suhuHarian[idx] = (suhuHarian[idx - 1] + suhuHarian[idx + 1]) / 2.0;
        }
    }

    public double hitungRataRata() {
        double total = 0;
        for (double s : suhuHarian) {
            total += s;
        }
        return total / suhuHarian.length;
    }
}
