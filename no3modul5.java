package modul5;

import java.util.Scanner;

public class no3modul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahHari = 0;

        System.out.print("Masukan urutan no bulan (1-12) : ");
        int bulan = input.nextInt();

        switch (bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                jumlahHari = 31;
                break;
            case 4: case 6: case 9: case 11:
                jumlahHari = 30;
                break;
            case 2:
                jumlahHari = 28; // Februari memiliki 28 hari
                break;
            default:
                System.out.println("Nomor bulan tidak valid.");
                break;
    
        }

        System.out.println("Jumlah hari pada bulan ke-" + bulan + " adalah " + jumlahHari + " hari.");

        input.close();
    }
    
}
