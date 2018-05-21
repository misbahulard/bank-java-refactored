public class App {

    public static void main(String[] args) {
        Alamat alamatBank = new Alamat("nusantara-1", "Krian", "Sidoarjo", "Jawa Timur", 61262);
        Alamat alamatPelanggan = new Alamat("bliblis-v", "Krian", "Sidoarjo", "Jawa Timur", 61261);
        Bank bank = new Bank(1, "BCA", alamatBank);
        Akun akun = new Akun();
        Pelanggan pelanggan = new Pelanggan(1, "Arka", "351001112950001", alamatPelanggan);
        akun.buatAkun(1, 50000, pelanggan, bank);

        System.out.println("Nasabah: " + akun.getPelanggan().getNama());
        System.out.println("Akun: " + akun.getBank().getNama() + ", No Akun: " + akun.getNoAkun() + ", Saldo: " + akun.getSaldo());
    }
}
