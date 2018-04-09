package pbo03;
public class smartphoneAksi {
    public static void main(String[] args) {
    smartphone a = new smartphone();
    
        a.setMerk("OPPO");
        a.setWarna("hitam");
        a.setMemory("16GB");
        a.setHarga(150000);
        
        a.cetakInfo();
        
        System.out.print("Merknya \t:");
        System.out.println(a.getMerk());
        System.out.print("Warnanya \t:");
        System.out.println(a.getWarna());
        System.out.print("Memorynya \t:");
        System.out.println(a.getMemory());
        System.out.print("Harganya \t:");
        System.out.println(a.getHarga());
    
        tablet b = new tablet();
        b.setMerk("samsung");
        b.setWarna("putih");
        b.setMemory("23GB");
        b.setHarga(2000000);
        b.setJenissmartphone("hp layar besar");
        b.setukuranlayar("8 imci");
        b.cetakInfo();
        System.out.println("Jenis\t: "+b.getJenismartphone());
        System.out.println("ukuranlayar\t: "+b.getukuranlayar());
        b.throttle();
    }
}