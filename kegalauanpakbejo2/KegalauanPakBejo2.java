package kegalauanpakbejo2;
public class KegalauanPakBejo2 {

    public static void main(String[] args) {       
        keramik kA = new keramik(30, 30, 10, 54000);
        keramik kB = new keramik(40, 40, 5, 65000);
        keramik kC = new keramik(30, 40, 8, 60000);
        System.out.println("Data keramik A");
        System.out.println("Luas keramik    : " + (kA.luas())  + " cm persegi");
        System.out.println("Kaeramik        : " + kA.keramik1());
        System.out.println("Harga satu      : Rp " + kA.harga1());
        System.out.println("Total           : Rp " + kA.total() + "\n");
        
        System.out.println("Data keramik B");
        System.out.println("Luas keramik    : " + kB.luas()  + " meter persegi");
        System.out.println("Kaeramik        : " + kB.keramik1());
        System.out.println("Harga satu      : Rp " + kB.harga1());
        System.out.println("Total           : Rp " + kB.total() + "\n");
        
        System.out.println("Data keramik C");
        System.out.println("Luas keramik    : " + kC.luas()  + " meter persegi");
        System.out.println("Kaeramik        : " + kC.keramik1());
        System.out.println("Harga satu      : Rp " + kC.harga1());
        System.out.println("Total           : Rp " + kC.total() + "\n");
    }
    
}
