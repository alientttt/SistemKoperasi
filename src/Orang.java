public class Orang {
    protected String nama;
    protected String alamat;
    protected String nik;
    Orang(String nama,String alamat,String nik){
        this.nama = nama;
        this.alamat = alamat;
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }
}
