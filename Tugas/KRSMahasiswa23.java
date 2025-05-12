package Tugas;

public class KRSMahasiswa23 {

    String nama, nim, prodi;

    public KRSMahasiswa23(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Prodi: " + prodi);
    }
}
