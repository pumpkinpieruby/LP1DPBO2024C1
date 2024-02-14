from DPR import DPR

def main():
    llist = []

    n = int(input("Masukkan jumlah anggota DPR: \n"))

    print("Masukkan ID, Nama, Bidang, Partai anggota DPR:")
    for _ in range(n):
        id, name, namaBidang, partai = input().split()
        anggota = DPR(int(id), name, namaBidang, partai)
        llist.append(anggota)

    # Menampilkan setiap anggota DPR dalam bentuk tabel
    print("-------------------------------------------------------------------------------------------")
    print("| {:<5} | {:<10} | {:<20} | {:<20} | {:<20} |".format("No.", "ID", "Nama", "Nama Bidang", "Partai"))
    print("-------------------------------------------------------------------------------------------")
    for i, anggota in enumerate(llist, 1):
        print("| {:<5} | {:<10} | {:<20} | {:<20} | {:<20} |".format(i, anggota.get_Id(), anggota.get_Name(), anggota.get_namaBidang(), anggota.get_Partai()))
    print("-------------------------------------------------------------------------------------------")

    print("\npilihan operasi : ")
    print("1. Tambah")
    print("2. Ubah")
    print("3. Hapus")
    print("4. Keluar\n")
    operasi = input("Pilih operasi yang diinginkan [t/u/h/k]: \n")

    while operasi.lower() != 'k':
        if operasi.lower() == 't':
            id, name, namaBidang, partai = input("Masukkan ID, Nama, Bidang, Partai: \n").split()
            temp = DPR(int(id), name, namaBidang, partai)
            llist.append(temp)
            print("Anggota berhasil ditambahkan.\n")
        elif operasi.lower() == 'u':
            id = int(input("Masukkan ID anggota yang ingin diubah: \n"))
            found = False
            for anggota in llist:
                if anggota.get_Id() == id:
                    name, namaBidang, partai = input(f"Masukkan data baru untuk anggota dengan ID {id}: \n").split()
                    anggota.set_Name(name)
                    anggota.set_namaBidang(namaBidang)
                    anggota.set_Partai(partai)
                    print(f"Anggota dengan ID {id} berhasil diubah.\n")
                    found = True
                    break
            if not found:
                print(f"Anggota dengan ID {id} tidak ditemukan.\n")
        elif operasi.lower() == 'h':
            id = int(input("Masukkan ID anggota yang ingin dihapus: \n"))
            found = False
            for i, anggota in enumerate(llist):
                if anggota.get_Id() == id:
                    llist.pop(i)
                    print(f"Anggota dengan ID {id} berhasil dihapus.\n")
                    found = True
                    break
            if not found:
                print(f"Anggota dengan ID {id} tidak ditemukan.\n")
        else:
            print("Operasi tidak valid.\n")

        operasi = input("Pilih operasi yang diinginkan [t/u/h/k]: \n")

    print("Program selesai.\n")

    print("-------------------------------------------------------------------------------------------")
    print("| {:<5} | {:<10} | {:<20} | {:<20} | {:<20} |".format("No.", "ID", "Nama", "Nama Bidang", "Partai"))
    print("-------------------------------------------------------------------------------------------")
    for i, anggota in enumerate(llist, 1):
        print("| {:<5} | {:<10} | {:<20} | {:<20} | {:<20} |".format(i, anggota.get_Id(), anggota.get_Name(), anggota.get_namaBidang(), anggota.get_Partai()))
    print("--------------------------------------------------------------------------------------------")
    
if __name__ == "__main__":
    main()
