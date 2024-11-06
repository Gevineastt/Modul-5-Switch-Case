package modul5;

import java.util.Scanner;

public class no4modul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //menginput ukuran kaos yang telah dimasukan oleh user 
        System.out.print("Masukan ukuran kaos (S, M, L, XL, XXL) : ");
        String UK = input.nextLine().toUpperCase();

        //menginput jumlah kaos yang dibeli 
        System.out.print("Masukan jumlah kaos yang dibeli : ");
        int jumlah = input.nextInt();

        int hargaPerbuah = 0;

        // menetukan harga perbuah berdasarkan ukuran 
        switch (UK) {
            case "S":
                hargaPerbuah = 30000;
                break;
            case "M":
                hargaPerbuah = 38000;
                break;
            case "L": 
                hargaPerbuah = 45000;
                break;
            case "XL":
                hargaPerbuah = 50000;
                break;
            case "XXL":
                hargaPerbuah = 60000;
                break;
                
                default:
                System.out.println("Ukuran kaos tidak valid.");
                break;
        }

        //menghitung harga total
        int totalHarga = hargaPerbuah * jumlah;

        //menampilkan total harga 
        System.out.println("Total yang dibayarkan " + jumlah + "untuk kaos dengan ukuran " + UK + " adalah rp " + totalHarga);

         input.close();
    }
}
