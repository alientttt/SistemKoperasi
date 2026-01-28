import exception.AnggotaDuplikat;
import exception.umurException;
import model.Anggota;
import service.Koperasi;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Koperasi koperasi = new Koperasi();

        System.out.println("ID Anggota: ");
        String id = input.nextLine();

        System.out.println("Umur: ");
        int umur = input.nextInt();

        System.out.println("Nama: ");
        String nama = input.nextLine();

        System.out.println("Alamat: ");
        String alamat = input.nextLine();

        System.out.println("NIK: ");
        String nik = input.nextLine();

        System.out.println("Saldo Awal: ");
        double saldo = input.nextDouble();

        try {
            Anggota anggota = new Anggota(id,saldo,nama,alamat,nik,umur);
            koperasi.tambahAnggota(anggota);
        } catch (umurException e){
            System.out.println("Error umur: "+e.getMessage());
        } catch (AnggotaDuplikat e){
            System.out.println("Error data: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error sistem: "+e.getMessage());
        }


        System.out.println("\n--- Daftar model.Anggota ---");
        koperasi.tampilkanAnggota();
    }
}