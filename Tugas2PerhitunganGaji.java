import java.util.Scanner;

public class Tugas2PerhitunganGaji {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            char golongan;
            int jamLembur;
            double gajiPokok;
            double persenLembur;
            double gajiLembur;
            double totalGaji;

            System.out.print("Masukkan Golongan (A/B/C): ");
            golongan = input.next().charAt(0);

            System.out.print("Masukkan Jam Lembur: ");
            jamLembur = input.nextInt();

            gajiPokok = switch (golongan) {
                case 'A', 'a' -> 5000000;
                case 'B', 'b' -> 6500000;
                case 'C', 'c' -> 9500000;
                default -> 0;
            };

            if (jamLembur == 1) {
                persenLembur = 0.30;
            } else if (jamLembur == 2) {
                persenLembur = 0.32;
            } else if (jamLembur == 3) {
                persenLembur = 0.34;
            } else if (jamLembur == 4) {
                persenLembur = 0.36;
            } else if (jamLembur >= 5) {
                persenLembur = 0.38;
            } else {
                persenLembur = 0;
            }

            gajiLembur = gajiPokok * persenLembur;

            totalGaji = gajiPokok + gajiLembur;

            System.out.println("\nHasil Perhitungan Gaji");
            System.out.println("Gaji Pokok      : Rp " + gajiPokok);
            System.out.println("Gaji Lembur     : Rp " + gajiLembur);
            System.out.println("__________________________________");
            System.out.println("Total Penghasilan: Rp " + totalGaji);
        }
    }
}