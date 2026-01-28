package model;

public class Anggota extends Orang {
    private String idAnggota;
    private double saldo;
    public Anggota(String idAnggota,double saldo,String nama,String alamat,String nik){
        super(nama,alamat,nik);
        this.idAnggota = idAnggota;
        this.saldo = saldo;
    }

    public String getIdAnggota(){
        return idAnggota;
    }

    public double getSaldo(){
        return saldo;
    }
}
