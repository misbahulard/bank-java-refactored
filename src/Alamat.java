public class Alamat {
    private String namaJalan;
    private String kecamatan;
    private String kabupaten;
    private String provinsi;
    private int kodePos;


    public Alamat() {
    }

    public Alamat(String namaJalan, String kecamatan, String kabupaten, String provinsi, int kodePos) {
        this.namaJalan = namaJalan;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
        this.kodePos = kodePos;
    }

    public String getNamaJalan() {
        return namaJalan;
    }

    public void setNamaJalan(String namaJalan) {
        this.namaJalan = namaJalan;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public int getKodePos() {
        return kodePos;
    }

    public void setKodePos(int kodePos) {
        this.kodePos = kodePos;
    }
}
