package modul5;

import java.util.Scanner;

public class no6modul5{

    // Enum untuk agama
    enum Agama {
        HINDU,
        BUDHA,
        YAHUDI,
        KATOLIK,
        KRISTEN,
        ISLAM
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama agama
        System.out.print("Masukkan nama agama (Hindu, Budha, Yahudi, Katolik, Kristen, Islam): ");
        String inputAgama = scanner.nextLine().toUpperCase();

        // Mengonversi input string ke enum Agama tanpa validasi
        

        // Menggunakan switch-case untuk menentukan kitab suci dan nabi
        String kitabSuci = "";
        String nabi = "";

        try {
            Agama agama = Agama.valueOf(inputAgama);

            switch (agama) {
                case HINDU:
                    kitabSuci = "Veda";
                    nabi = "-";
                    break;
                case BUDHA:
                    kitabSuci = "Tripitaka";
                    nabi = "Sidarta Gautama";
                    break;
                case YAHUDI:
                    kitabSuci = "Taurat";
                    nabi = "Musa";
                    break;
                case KATOLIK:
                case KRISTEN:
                    kitabSuci = "Injil";
                    nabi = "Yesus";
                    break;
                case ISLAM:
                    kitabSuci = "Alquran";
                    nabi = "Muhammad";
                    break;
                default:
                System.out.println("Tidak diketahui");
            
        } 
    }catch (IllegalArgumentException e) {
            System.out.println("Agama tidak sah");
            // TODO: handle exception
        }
        
        

        // Menampilkan hasil
        System.out.print("Agama "+inputAgama+ ", Kitab Suci "+kitabSuci+ " dan Nabi "+nabi);
        scanner.close();
    }
}

