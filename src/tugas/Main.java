package Laporan4;

/**
 *
 * @author Fandi
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Alamat[] alamat = new Alamat[0];
        String loop = "y";
        int x = 0, i = 0;
        do {
            cetakMenu();
            switch (scan.next()) {
                case "1":
                    alamat = Arrays.copyOf(alamat, alamat.length + 1);
                    Alamat.masukanAlamat(alamat, x);
                    x++;
                    break;
                case "2":
                    Alamat.mencetakAlamat(alamat);
                    edit();
                    i = scan.nextInt();
                    if ((i - 1) < alamat.length) {
                        Alamat.editAlamat(alamat, i);
                    } 
                    else dataNull();
                    break;
                case "3":
                    Alamat.mencetakAlamat(alamat);
                    hapus();
                    i = scan.nextInt();
                    Menghapus();
                    if (scan.next().equals("y") && (i - 1) < alamat.length) {
                    Alamat.menghapusAlamat(alamat, i);
                    }
                    else dataNull();
                    break;
                case "4":
                    Alamat.mencetakAlamat(alamat);
                    break;
                case "5":
                    loop = "n";
                    break;
            }
        } while (loop.equals("y"));
    }

    public static void cetakMenu() {
        System.out.println("Menu Pilih");
        System.out.println("1. Tambah Daftar Alamat");
        System.out.println("2. Mengubah Daftar Alamat");
        System.out.println("3. Menghapus Daftar");
        System.out.println("4. Daftar Tampilan Lengkap1");
        System.out.println("5. Keluar");
        System.out.print("Pilih : ");
    }

    public static void hapus() {
        System.out.print("Hapus nomor? ");
    }

    public static void edit() {
        System.out.print("Edit nomor? ");
    }

    public static void Menghapus() {
        System.out.print("Data akan dihapus(y/n)?");
    }

    public static void dataNull() {
        System.out.println("Data kosong\n");
    }
}