public class DPR {
    private int id;
    private String name;
    private String namaBidang;
    private String partai;

    public DPR() {
        this.id = 0;
        this.name = "";
        this.namaBidang = "";
        this.partai = "";
    }

    public DPR(int id, String name, String namaBidang, String partai) {
        this.id = id;
        this.name = name;
        this.namaBidang = namaBidang;
        this.partai = partai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamaBidang() {
        return namaBidang;
    }

    public void setNamaBidang(String namaBidang) {
        this.namaBidang = namaBidang;
    }

    public String getPartai() {
        return partai;
    }

    public void setPartai(String partai) {
        this.partai = partai;
    }
}
