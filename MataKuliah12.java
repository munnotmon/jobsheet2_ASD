public class MataKuliah12 {
    String kode;
    String nama;
    int sks;
    int durasi;

    public MataKuliah12() {
        this.kode = "MK101";
        this.nama = "Pemrograman Dasar";
        this.sks = 4;
        this.durasi = 8;
    }

    public MataKuliah12(String kode, String nama, int sks, int durasi) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.durasi = durasi;
    }

    public void tampilkanDetail() {
        System.out.println("Kode Mata Kuliah : " + kode);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS             : " + sks);
        System.out.println("Durasi (jam)    : " + durasi);
        System.out.println("--------------------------------");
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diperbarui menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.durasi += jam;
        System.out.println("Jumlah jam bertambah. Sekarang: " + durasi + " jam.");
    }

    public void kurangiJam(int jam) {
        if (jam > durasi) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        } else {
            this.durasi -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Sekarang: " + durasi + " jam.");
        }
    }
}
