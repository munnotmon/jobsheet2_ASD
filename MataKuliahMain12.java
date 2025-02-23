public class MataKuliahMain12 {
    public static void main(String[] args) {
        MataKuliah12 mk1 = new MataKuliah12();
        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilkanDetail();

        MataKuliah12 mk2 = new MataKuliah12("MK102", "Struktur Data", 3, 6);
        System.out.println("\n=== Informasi Mata Kuliah 2 ===");
        mk2.tampilkanDetail();

        System.out.println("\n>> Memperbarui Mata Kuliah 2 <<");
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(3);

        System.out.println("\n=== Informasi Terbaru Mata Kuliah 2 ===");
        mk2.tampilkanDetail();
    }
}