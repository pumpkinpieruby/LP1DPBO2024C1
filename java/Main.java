import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<DPR> dprList = new ArrayList<>();

        System.out.print("Masukkan jumlah anggota DPR: \n");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Masukkan ID, Nama, Bidang, Partai anggota DPR: \n");
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            String namaBidang = scanner.next();
            String partai = scanner.next();
            scanner.nextLine(); // Consume newline

            DPR anggota = new DPR(id, name, namaBidang, partai);
            dprList.add(anggota);
        }

        // Menampilkan setiap anggota DPR dalam bentuk tabel
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-20s | %-20s | %-20s |\n", "No.", "ID", "Nama", "Nama Bidang", "Partai");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < dprList.size(); i++) {
            DPR anggota = dprList.get(i);
            System.out.printf("| %-5d | %-10d | %-20s | %-20s | %-20s |\n", (i + 1), anggota.getId(), anggota.getName(), anggota.getNamaBidang(), anggota.getPartai());
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        char operasi;
        System.out.println("\npilihan operasi : ");
        System.out.println("1. Tambah");
        System.out.println("2. Ubah");
        System.out.println("3. Hapus");
        System.out.println("4. Keluar\n");
        System.out.println("pilih operasi yang diinginkan [t/u/h/k] : ");
        // t untuk tambah
        // u untuk ubah
        // h untuk hapus
        // k untuk keluar

        operasi = scanner.next().charAt(0); //input operasi yang ingin digunakan

        while (operasi != 'k' && operasi != 'K') {
            if (operasi == 't' || operasi == 'T') {
                System.out.print("Masukkan ID, Nama, Bidang, Partai anggota DPR baru: \n");
                int id = scanner.nextInt();
                String name = scanner.next();
                String namaBidang = scanner.next();
                String partai = scanner.next();
                scanner.nextLine(); // Consume newline

                DPR temp = new DPR(id, name, namaBidang, partai);
                dprList.add(temp);

                System.out.println("Anggota berhasil ditambahkan.\n");
            } else if (operasi == 'u' || operasi == 'U') {
                System.out.println("Masukkan ID anggota yang ingin diubah:");
                int id = scanner.nextInt();
                boolean found = false;

                for (DPR anggota : dprList) {
                    if (anggota.getId() == id) {
                        System.out.printf("Masukkan data baru untuk anggota dengan ID %d:\n", id);
                        String name = scanner.next();
                        String namaBidang = scanner.next();
                        String partai = scanner.next();
                        scanner.nextLine(); // Consume newline

                        anggota.setName(name);
                        anggota.setNamaBidang(namaBidang);
                        anggota.setPartai(partai);

                        System.out.printf("Anggota dengan ID %d berhasil diubah.\n\n", id);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.printf("Anggota dengan ID %d tidak ditemukan.\n", id);
                }
            } else if (operasi == 'h' || operasi == 'H') {
                System.out.println("Masukkan ID anggota yang ingin dihapus: ");
                int id = scanner.nextInt();
                boolean found = false;

                for (int j = 0; j < dprList.size(); j++) {
                    if (dprList.get(j).getId() == id) {
                        dprList.remove(j);
                        System.out.printf("Anggota dengan ID %d berhasil dihapus.\n\n", id);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.printf("Anggota dengan ID %d tidak ditemukan.\n\n", id);
                }
            } else {
                System.out.println("Operasi tidak valid.\n");
            }

            System.out.println("pilih operasi yang diinginkan [t/u/h/k] :");
            operasi = scanner.next().charAt(0);
        }

        System.out.println("Program selesai.\n");

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-20s | %-20s | %-20s |\n", "No.", "ID", "Nama", "Nama Bidang", "Partai");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < dprList.size(); i++) {
            DPR anggota = dprList.get(i);
            System.out.printf("| %-5d | %-10d | %-20s | %-20s | %-20s |\n", (i + 1), anggota.getId(), anggota.getName(), anggota.getNamaBidang(), anggota.getPartai());
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    
}
