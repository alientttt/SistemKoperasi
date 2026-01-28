package model;

public class Orang {
    protected String nama;
    protected String alamat;
    protected String nik;
    protected int umur;
    Orang(String nama,String alamat,String nik,int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
        this.umur = umur;
    }

    public String getNama(){
        return nama;
    }

    public int getUmur(){
        return umur;
    }
}
