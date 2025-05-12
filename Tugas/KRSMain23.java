package Tugas;

import java.util.Scanner;

public class KRSMain23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS23 antrian = new QueueKRS23(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa untuk KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian Sekarang");
            System.out.println("7. Jumlah Mahasiswa Sudah Proses");
            System.out.println("8. Jumlah Mahasiswa Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh!");
                        break;
                    }
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    KRSMahasiswa23 mhs = new KRSMahasiswa23(nama, nim, prodi);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.printAll();
                    break;
                case 4:
                    antrian.peek2();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlah());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa selesai KRS: " + antrian.getSelesai());
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa belum KRS: " + antrian.getBelumSelesai());
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }

}
