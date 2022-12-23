package entity;

public class Peserta extends Member {
    private String alamat, noTelpon, mdl, jdwl, kls;
    private int npm;


    public Peserta(String nama, String alamat, String noTelpon, String password, String mdl, String jdwl, String kls, int npm) {
        super(nama, password);
        this.alamat = alamat;
        this.noTelpon = noTelpon;
        this.mdl = mdl;
        this.jdwl = jdwl;
        this.kls = kls;
        this.npm = npm;
    }

    public int getNpm() {
        return npm;
    }

    public void setNpm(int npm) {
        this.npm = npm;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }


    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    @Override
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public String getMdl() {
        return mdl;
    }

    public void setMdl(String mdl) {
        this.mdl = mdl;
    }

    public String getJdwl() {
        return jdwl;
    }

    public void setJdwl(String jdwl) {
        this.jdwl = jdwl;
    }

    public String getKls() {
        return kls;
    }

    public void setKls(String kls) {
        this.kls = kls;
    }
}
