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

    public void merubah_nama(int index,String nama_baru) {

        listSiswa.get(index).setNama(nama_baru);
    }

    public void merubah_alamat(int index, String alamat_baru)
    {
        listSiswa.get(index).setAlamat(alamat_baru);
    }

    public void merubah_nomor_telepon(int index, String nomor_telepon_baru)
    {
        listSiswa.get(index).setNoTelpon(nomor_telepon_baru);
    }

    public void merubah_password(int index, String password_baru) {
        listSiswa.get(index).setPass(password_baru);
    }

    public void menghapus_account(int index) {
        listSiswa.remove(index);
    }

}
