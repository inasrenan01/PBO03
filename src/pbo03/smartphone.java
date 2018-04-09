package pbo03;

public class smartphone {
    private String merk;
    private String warna;
    private String memory;
    private double harga;
    
    
    void cetakInfo() {
        System.out.println("Merk \t:"+merk+"\n"+
                "Warna \t:"+warna+"\n"+
                "Ukuran \t:"+memory+"\n"+
                "Harga \t:"+harga); 
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
