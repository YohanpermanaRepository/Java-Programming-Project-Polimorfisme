package Praktikumodul4 ;

class Mainprogram extends Prosesoprbilangan{
private static void cetaksemua(Prosesoprbilangan []OB, double a, double b){
        OB[0] = new Prosesoprpenjumlahan();
            OB[1] = new Prosesoprpengurangan();
                 OB[2] = new Prosesoprperkalian();
                    OB[3] = new Prosesoprpembagian();
        
        for (int inc = 0; inc < OB.length; inc++){
            OB[inc].setA(a);
            OB[inc].setB(b);
            OB[inc].setC();
            OB[inc].tampilkan();
        }
    }
    public static void main(String[] args) {
        System.out.println("-----------OPERASI BILANGAN PADA JAVA---------------");
            Prosesoprbilangan[] arr1 = new Prosesoprbilangan[4];
                cetaksemua(arr1, 10.5, 0.5);
    }
}
