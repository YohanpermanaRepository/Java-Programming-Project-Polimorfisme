package Praktikumodul4;

public class Prosesoprpengurangan extends Prosesoprbilangan{
    
    @Override
    protected void setC(){
        this.c= this.a-this.b;
    }
    @Override
    protected void tampilkan(){
        System.out.println(" # OPERASI PENGURANGAN");
            System.out.println("BILANGAN A = "+this.getA());
                System.out.println("BILANGAN B = "+this.getB());
                    System.out.println("HASIL DARI A - B = "+this.getC());
    }
}
