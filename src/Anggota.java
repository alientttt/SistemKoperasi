public class Anggota extends Orang {
    public String idAnggota;
    double saldoSimpanan;
    Anggota(String idAnggota,double saldoSimpanan,String nama,String alamat,String nomorIdentitas){
        super(nama,alamat,nomorIdentitas);
        this.idAnggota = idAnggota;
        this.saldoSimpanan = saldoSimpanan;
    }

    @java.lang.Override
    public void makeSound() {
        System.out.println("ini dari class Anggota");
    }
}
