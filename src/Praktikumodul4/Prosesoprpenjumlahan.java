package Praktikumodul4;

public class Prosesoprpenjumlahan extends Prosesoprbilangan{
    
    @Override
    protected void setC(){
        this.c= this.a+this.b;
    }
    @Override
    protected void tampilkan(){
        System.out.println("# OPERASI PENJUMLAHAN");
            System.out.println("BILANGAN A = "+this.getA());
                System.out.println("BILANGAN B = "+this.getB());
                    System.out.println("Hasil dari A + B = "+this.getC());
    }
}
