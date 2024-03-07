import java.util.ArrayList;
import java.util.Scanner;

// class Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    // constructor
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // getter
    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getJurusan() {
        return jurusan;
    }

    // method tampilDataMahasiswa
    void tampilDataMahasiswa() {
        System.out.println("data mahasiswa");
        tampilUniversitas();
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    // static method tampilUniversitas
    static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }
}

// class Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        ArrayList<Mahasiswa> mahasiswaInputan = new ArrayList<>();

        while (exit) {
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan anda (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // Membersihkan data dalam nextLine
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();

                    String nim;
                    do {
                        System.out.print("Masukkan NIM (15 karakter): ");
                        nim = scanner.nextLine();
                        if (nim.length() != 15) {
                            System.out.println("Panjang NIM harus 15 karakter!");
                        }
                    } while (nim.length() != 15);

                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = scanner.nextLine();

                    Mahasiswa mahasiswaBaru = new Mahasiswa(nama, nim, jurusan);
                    mahasiswaInputan.add(mahasiswaBaru); // Menambahkan objek Mahasiswa ke dalam ArrayList
                    System.out.println("Data berhasil ditambahkan");
                    break;

                case 2:
                    if (mahasiswaInputan.isEmpty()) {
                        System.out.println("Belum ada data Mahasiswa.");
                    } else {
                        System.out.println("Data Mahasiswa");
                        for (Mahasiswa mahasiswa : mahasiswaInputan){
                            mahasiswa.tampilDataMahasiswa();
                        }
                    }
                    break;

                case 3:
                    exit = false;
                    System.out.println("Adios amigos");
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
        scanner.close();
    }
}
