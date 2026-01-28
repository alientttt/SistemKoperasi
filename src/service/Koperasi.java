package service;

import exception.AnggotaDuplikat;
import exception.umurException;
import model.Anggota;

import java.util.ArrayList;
import java.util.List;

public class Koperasi {
    private List<Anggota> daftarAnggota;

    public Koperasi(){
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota) throws umurException, AnggotaDuplikat {

        if(anggota == null){
            throw new IllegalStateException("Object anggota kosong/null");
        }

        if (anggota.getNama().isEmpty()){
            System.out.println("Nama wajib diisi");
            return;
        }

        if (anggota.getUmur()<17){
            throw new umurException("Umur anggota minimal 17 tahun");
        }

        for (Anggota ang : daftarAnggota){
            if (ang.getIdAnggota().equals(anggota.getIdAnggota())){
                throw new AnggotaDuplikat("ID anggota sudah terdaftar");
            }
        }




        daftarAnggota.add(anggota);
        System.out.println("model.Anggota berhasil ditambahkan: " + anggota.getNama());
    }

    public void tampilkanAnggota(){
        for (Anggota ang : daftarAnggota){
            System.out.println(ang.getIdAnggota() + " --- " + ang.getNama());
        }
    }
}
