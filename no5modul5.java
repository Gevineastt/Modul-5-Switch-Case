package modul5;

import java.util.Scanner;

public class no5modul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // menginput gaji pokok karyawan yang dimasukan oleh user
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = input.nextDouble();
        
        // menginput golongan yang dimasukan oleh user 
        System.out.print("Masukkan golongan (I, II, III, IV): ");
        String golongan = input.next().toUpperCase();
        
        // menginput masa kerja karyawan 
        System.out.print("Masukkan masa kerja (tahun): ");
        int masaKerja = input.nextInt();
        
        double persentaseBonus = 0;

        //menentukan presentase bonus dengan swtich case dan if-else
        switch (golongan) {
            case "I":
                if (masaKerja >= 0 && masaKerja <= 10) {
                    persentaseBonus = 0.50;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.60;
                } else  {
                    persentaseBonus = 0.70;
                }
                break;
            case "II":
                if (masaKerja >= 0 && masaKerja <= 10) {
                    persentaseBonus = 0.60;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.70;
                } else  {
                    persentaseBonus = 0.80;
                }
                break;
            case "III":
                if (masaKerja >= 0 && masaKerja <= 10) {
                    persentaseBonus = 0.70;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.80;
                } else {
                    persentaseBonus = 0.90;
                }
                break;
            case "IV":
                if (masaKerja >= 0 && masaKerja <= 10) {
                    persentaseBonus = 0.80;
                } else if (masaKerja >= 11 && masaKerja <= 20) {
                    persentaseBonus = 0.90;
                } else {
                    persentaseBonus = 1.00;
                }
                break;
            default:
                System.out.println("Golongan tidak valid. Silakan masukkan golongan I, II, III, atau IV.");
                input.close();
            
        }

        // menghitung bonus 
        double bonus = gajiPokok * persentaseBonus;

        // menampilkan hasil
        System.out.printf("Bonus karyawan: "+bonus);
        
        input.close();
    }
}
