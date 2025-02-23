public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen12() {
        this.idDosen = "-";
        this.nama = "-";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "-";
    }

    public Dosen12(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    public void tampilkanDetail() {
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama           : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("--------------------------------");
    }

    public void ubahStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status aktif dosen telah diperbarui.");
    }

    public int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    public void ubahBidangKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diperbarui menjadi: " + bidangKeahlian);
    }
}
