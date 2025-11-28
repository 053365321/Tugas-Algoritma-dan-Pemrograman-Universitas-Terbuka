import java.util.Scanner;

public class Tugas3GajiKaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int gajiKaryawan;
            int gajiLembur;

            int[] gajiPokok = {5000000, 6500000, 9500000};
            int[] persenLembur = {30, 32, 34, 36, 38};

            System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
            String golongan = input.nextLine().toUpperCase();

            System.out.print("Masukkan Jumlah Jam Lembur: ");
            int jamLembur = input.nextInt();

            switch (golongan) {
                case "A" -> gajiKaryawan = gajiPokok[0];
                case "B" -> gajiKaryawan = gajiPokok[1];
                case "C" -> gajiKaryawan = gajiPokok[2];
                default -> {
                    System.out.println("Golongan tidak valid!");
                    return;
                }
            }
            if (jamLembur == 1) {
                gajiLembur = gajiKaryawan * persenLembur[0] / 100;
            } else if (jamLembur == 2) {
                gajiLembur = gajiKaryawan * persenLembur[1] / 100;
            } else if (jamLembur == 3) {
                gajiLembur = gajiKaryawan * persenLembur[2] / 100;
            } else if (jamLembur == 4) {
                gajiLembur = gajiKaryawan * persenLembur[3] / 100;
            } else if (jamLembur >= 5) {
                gajiLembur = gajiKaryawan * persenLembur[4] / 100;
            } else if (jamLembur == 0) {
                gajiLembur = 0;
            } else {
                System.out.println("Jam lembur tidak valid!");
                return;
            } 
            
            int totalGaji = gajiKaryawan + gajiLembur;

            System.out.println("\nRincian Gaji Karyawan");
            System.out.println("Golongan           : " + golongan);
            System.out.println("Gaji Pokok         : Rp " + gajiKaryawan);
            System.out.println("Jam Lembur         : " + jamLembur + " jam");
            System.out.println("Gaji Lembur        : Rp " + gajiLembur);
            System.out.println("________________________________");
            System.out.println("TOTAL GAJI         : Rp " + totalGaji);
        }
    }
}