import java.util.ArrayList;
import java.util.List;

public class Koperasi {
    private List<Anggota> daftarAnggota;

    public Koperasi(){
        daftarAnggota = new ArrayList<>();
    }

    public void tambahAnggota(Anggota anggota){
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan: " + anggota.getNama());
    }

    public void tampilkanAnggota(){
        for (Anggota ang : daftarAnggota){
            System.out.println(ang.getIdAnggota() + " --- " + ang.getNama());
        }
    }
}
