public class DosenMain12 {
    public static void main(String[] args) {
        Dosen12 dosen1 = new Dosen12();
        System.out.println("=== Informasi Dosen 1 ===");
        dosen1.tampilkanDetail();

        Dosen12 dosen2 = new Dosen12("DS003", "Siti Aminah", true, 2010, "Matematika");
        System.out.println("\n=== Informasi Dosen 2 ===");
        dosen2.tampilkanDetail();

        System.out.println("\n>> Memperbarui Data Dosen 2 <<");
        dosen2.ubahStatusAktif(false);
        dosen2.ubahBidangKeahlian("Statistika");

        System.out.println("\n=== Informasi Terbaru Dosen 2 ===");
        dosen2.tampilkanDetail();

        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja Dosen 2: " + masaKerja + " tahun");
    }
}