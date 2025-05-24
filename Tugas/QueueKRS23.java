package Tugas;

public class QueueKRS23 {

    KRSMahasiswa23[] data;
    int front, rear, size, max, selesai;

    public QueueKRS23(int max) {
        this.max = max;
        data = new KRSMahasiswa23[max];
        front = 0;
        rear = -1;
        size = 0;
        selesai = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(KRSMahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, belum bisa proses KRS.");
            return;
        }

        System.out.println("Memproses 2 mahasiswa untuk KRS:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Mahasiswa:");
            data[front].tampil();
            data[front] = null;
            front = (front + 1) % max;
            size--;
            selesai++;
        }
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Belum ada 2 antrian terdepan.");
            return;
        }
        System.out.println("2 Antrian terdepan:");
        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampil();
            System.out.println("----------------------");
            i = (i + 1) % max;
        }
    }

    public void clear() {
        front = rear = -1;
        size = selesai = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian:");
        int i = front;
        for (int j = 0; j < size; j++) {
            System.out.println((j + 1) + ".");
            data[i].tampil();
            System.out.println("----------------------");
            i = (i + 1) % max;
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } else {
            System.out.print("Mahasiswa terakhir dalam antrian : ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampil();
        }
    }

    public int getJumlah() {
        return size;
    }

    public int getSelesai() {
        return selesai;
    }

    public int getBelumSelesai() {
        return size;
    }
}
