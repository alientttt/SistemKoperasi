public class Orang {
    String nama;
    String alamat;
    String nomorIdentitas;
    Orang(String nama,String alamat,String nomorIdentitas){
        this.nama = nama;
        this.alamat = alamat;
        this.nomorIdentitas = nomorIdentitas;
    }

    public void makeSound(){
        System.out.println("Ini dari class orang");
    }

}
