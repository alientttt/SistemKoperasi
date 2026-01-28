import model.Anggota;
import service.Koperasi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Koperasi koperasi = new Koperasi();

        System.out.println("ID model.Anggota: ");
        String id = input.nextLine();

        System.out.println("Nama: ");
        String nama = input.nextLine();

        System.out.println("Alamat: ");
        String alamat = input.nextLine();

        System.out.println("NIK: ");
        String nik = input.nextLine();

        System.out.println("Saldo Awal: ");
        double saldo = input.nextDouble();

        Anggota anggota = new Anggota(id,saldo,nama,alamat,nik);
        koperasi.tambahAnggota(anggota);

        System.out.println("\n--- Daftar model.Anggota ---");
        koperasi.tampilkanAnggota();
    }
}