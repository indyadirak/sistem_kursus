package model;

import java.util.ArrayList;

import entity.*;

public class Siswa {
    public ArrayList<Peserta> listSiswa;
    public ArrayList<String> arrNpm = new ArrayList<>();

    public Siswa() {
        listSiswa = new ArrayList<>();
    }

    public void insert(Peserta peserta) {
        listSiswa.add(peserta);
    }

    public String getNpm(int index) {
        arrNpm.add("06" + index);
        return arrNpm.get(index);
    }

    public int cekLogin(String npm, String password) {
        int cek = 0;
        for (int i = 0; i < getArrNpm(); i++) {
            for (int j = 0; j < getArrayList(); j++) {
                if (npm.equals(arrNpm.get(i)) && password.equals(listSiswa.get(j).getPass())) {
                    cek = 0;
                } else {
                    cek = 1;
                }
            }
        }
        return cek;
    }

    public int Login(String npm, String pasword) {
        int cekLogin = cekLogin(npm, pasword);
        if (cekLogin == 0) {
            System.out.println("login");
        } else {
            System.out.println("tidack");
        }
        return cekLogin;
    }

    public int jumlah_data_array_peserta() {
        return listSiswa.size();
    }

    public int getArrayList() {
        return listSiswa.size();
    }

    public int getArrNpm() {
        return arrNpm.size();
    }

    public Peserta getPeserta(int index) {
        return listSiswa.get(index);
    }

    public void merubah_nama(int index, String nama_baru) {

        listSiswa.get(index).setNama(nama_baru);
    }

    public void merubah_alamat(int index, String alamat_baru) {
        listSiswa.get(index).setAlamat(alamat_baru);
    }

    public void merubah_nomor_telepon(int index, String nomor_telepon_baru) {
        listSiswa.get(index).setNoTelpon(nomor_telepon_baru);
    }

    public void merubah_password(int index, String password_baru) {
        listSiswa.get(index).setPass(password_baru);
    }

    public void menghapus_account(int index) {
        listSiswa.remove(index);
    }

}
