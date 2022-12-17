package model;

import java.util.ArrayList;

import entity.*;

public class Siswa {
    public ArrayList<Peserta> listSiswa;

    public Siswa() {
        listSiswa = new ArrayList<>();
    }

    public void insert(Peserta peserta) {
        listSiswa.add(peserta);
    }

    public int cekLogin(String nama, String password) {
        int loop = 0;
        while (!listSiswa.get(loop).getNama().equals(nama) && !listSiswa.get(loop).getPass().equals(password)) {
            loop++;
        }
        return loop;
    }

    public int getArrayList() {
        return listSiswa.size();
    }

    public Peserta getPeserta(int index) {
        return listSiswa.get(index);
    }

    public void merubah_nama(String nama_lama, String nama_baru) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++) {
            if (listSiswa.get(perulangan).getNama().equals(nama_lama)) {
                listSiswa.get(perulangan).setNama(nama_baru);
            }
        }
    }

    public void merubah_alamat(String nama, String alamat_baru) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++) {
            if (listSiswa.get(perulangan).getNama().equals(nama)) {
                listSiswa.get(perulangan).setAlamat(alamat_baru);
            }
        }
    }

    public void merubah_nomor_telepon(String nama, String nomor_telepon_baru) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++) {
            if (listSiswa.get(perulangan).getNama().equals(nama)) {
                listSiswa.get(perulangan).setNoTelpon(nomor_telepon_baru);
            }
        }
    }

    public void merubah_password(String nama, String password_baru) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++) {
            if (listSiswa.get(perulangan).getNama().equals(nama)) {
                listSiswa.get(perulangan).setPass(password_baru);
            }
        }
    }

    public void menghapus_account(String nama) {
        for (int perulangan = 0; perulangan < listSiswa.size(); perulangan++) {
            if (listSiswa.get(perulangan).getNama().equals(nama)) {
                listSiswa.remove(perulangan);
            }
        }
    }

}
