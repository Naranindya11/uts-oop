
public class Data {
    private String nim;
    private String nama;
    private String kelas;
    private String alamat;

    public Data() {
        nim = "";
        nama = "";
        kelas = "";
        alamat = "";
    }
    
    public Data(String nim, String nama, String kelas, String alamat) {
    this.nim = nim;
    this.nama = nama;
    this.kelas= kelas;
    this.alamat = alamat;
}

public void setNoSurat(String nim) {
    this.nim = nim;
}

public void setTanggalSurat(String nama) {
    this.nama = nama;
}

public void setPerihal(String kelas) {
    this.kelas = kelas;
}

public void setTujuan(String alamat) {
    this.alamat = alamat;
}

public String getNim() { return nim; }

public String getNama() { return nama; }

public String getKelas() { return kelas; }

public String getAlamat() { return alamat; }

}