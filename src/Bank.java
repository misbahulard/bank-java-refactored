public class Bank {
    private int idBank;
    private String nama;
    private Alamat alamat;

    public Bank(int idBank, String nama, Alamat alamat) {
        this.idBank = idBank;
        this.nama = nama;
        this.alamat = alamat;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
