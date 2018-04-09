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
    
    }
}