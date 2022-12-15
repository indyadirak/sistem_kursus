package entity;

public class Peserta extends Member{
    private String alamat, noTelpon;

    public Peserta(String nama, String alamat, String noTelpon, String password){
        super(nama, password);
        this.alamat = alamat;
        this.noTelpon = noTelpon;
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
}
