package model;

import java.util.ArrayList;

import entity.*;

public class Siswa {
    public ArrayList<Peserta> listSiswa;
    /*public ArrayList<String> arrNpm = new ArrayList<>();*/

    public Siswa() {
        listSiswa = new ArrayList<>();
    }

    public void insert(Peserta peserta) {
        listSiswa.add(peserta);
    }

    public void merubah_nama(int index, String nama_baru)
    {
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

    public void merubah_password_akun(int index, String password_baru)
    {
        listSiswa.get(index).setPass(password_baru);
    }

    public void menghapus_account(int index) {
        listSiswa.remove(index);
    }

}