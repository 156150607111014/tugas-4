package Laporan4;
/**
 *
 * @author Fandi
 */
import java.util.Scanner;
public class Alamat {
    Scanner scan = new Scanner(System.in);
    private String nama;
    private String alamat;
    private String no_telepon;
    private String email;
    
    public Alamat(){
    this.nama = "";
    this.alamat = "";
    this.no_telepon = "";
    this.email = "";
    }

    public Alamat(String nama, String alamat, String no_telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.no_telepon = no_telepon;
        this.email = email;
    }

    public void setNama() {
        System.out.print ("Nama\t\t: ");
        this.nama = scan.nextLine();
    }

    public void setAlamat() {
        System.out.print("Alamat\t\t: ");
        this.alamat = scan.nextLine();
    }

    public void setNo_telepon() {
        System.out.print("No. Telepon\t: ");
        this.no_telepon = scan.nextLine();
    }

    public void setEmail() {
        System.out.print("Email\t\t: ");
        this.email = scan.nextLine();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public String getEmail() {
        return email;
    }
    public static void mencetakAlamat(Alamat[] alamat) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(" \nNo.\t\tNama\t\t\tAlamat\t\t\tNo.Telp\t\tEmail");
        System.out.println("--------------------------------------------------------------------------");
        for (int x = 0; x<alamat.length; x++) {
            System.out.print((x+1)+"\t");
            if (alamat[x].getNama().equals(""))
                System.out.print("Terhapus\n");
            else{
                System.out.print(alamat[x].getNama() + "\t");
                System.out.print(alamat[x].getAlamat() + "\t");
                System.out.print(alamat[x].getNo_telepon() + "\t");
                System.out.print(alamat[x].getEmail() + "\n");}
            }
            System.out.println("");
    }
    public static void masukanAlamat (Alamat[] alamat, int x){
        System.out.println("Masukan Data Baru");
        alamat[x] = new Alamat();
        alamat[x].setNama();
        alamat[x].setAlamat();
        alamat[x].setNo_telepon();
        alamat[x].setEmail();
        System.out.println("");
    }
    public static void menghapusAlamat (Alamat[] alamat, int y){
        System.out.println("\nData Terhapus");
        --y;
        alamat[y] = new Alamat();
        System.out.println("");
    }
    public static void editAlamat(Alamat[] alamat, int y){
        System.out.println("\nEdit Alamat");
        --y;
        alamat[y].setNama();
        alamat[y].setAlamat();
        alamat[y].setNo_telepon();
        alamat[y].setEmail();
        System.out.println("");
    }
}