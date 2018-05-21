public class Akun {
    private int noAkun;
    private float saldo;
    private Pelanggan pelanggan;
    private Bank bank;

    public Akun() {
    }

    public int getNoAkun() {
        return noAkun;
    }

    public void setNoAkun(int noAkun) {
        this.noAkun = noAkun;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void buatAkun(int noAkun, float saldo, Pelanggan pelanggan, Bank bank) {
        this.noAkun = noAkun;
        this.saldo = saldo;
        this.pelanggan = pelanggan;
        this.bank = bank;
    }

    private void menabung(float uang) {
        this.saldo += uang;
    }

    private boolean tarikSaldo(float uang) {
        float sisaSaldo = this.saldo - uang;
        if (sisaSaldo >= 0) {
            this.saldo -= uang;
            return true;
        } else {
            System.out.println("Saldo anda tidak mencukupi");
            return false;
        }
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
