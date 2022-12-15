package entity;

public class Kursus {
    private String modul, jadwal, kelas;

    public Kursus(String mdl, String jdwl, String kls) {
        this.modul = mdl;
        this.jadwal = jdwl;
        this.kelas = kls;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public String getModul() {
        return modul;
    }
}
