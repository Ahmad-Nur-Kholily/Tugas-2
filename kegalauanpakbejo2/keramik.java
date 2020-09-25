package kegalauanpakbejo2;
public class keramik {
//atribut
double panjang;
double lebar;
double boxs;
double harga;

// construct    
keramik(double p, double l, double box, double rp){
    this.panjang = p;
    this.lebar = l;
    this.boxs = box;
    this.harga = rp;
}

//method
double luas(){
    double hitungluas;
    hitungluas = this.panjang * this.lebar ;
    return hitungluas;
}
double keramik1(){
    double hitungkeramik1;
    hitungkeramik1 = 1000000 / this.luas();
    return hitungkeramik1;
}
    
double harga1(){
    double hitungharga1;
    hitungharga1 = this.harga / this.boxs;
    return hitungharga1;
}
double total(){
    double hitungtotal;
    hitungtotal = this.keramik1() * this.harga1();
    return hitungtotal;
}
}
