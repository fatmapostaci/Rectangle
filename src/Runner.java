import java.util.Scanner;

/*
Task 01 >
fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
*/
public class Runner {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        //boş constructor ile hesaplama
        Rectangle islem = new Rectangle();
        System.out.println("Dikdörtgenin kenar uzunluklarını girin: ");
        //dışarıdan alınan verileri objenin özelliği olarak set eder
        islem.setA(sc.nextInt());
        islem.setB(sc.nextInt());
        //objenin tuttuğu değerleri get ederek methodlara gönderdim
        islem.calculateArea(islem.getA(), islem.getB());
        islem.calculatePerimeter(islem.getA(), islem.getB());



        //2 parametreli constructor ile hesaplama
        System.out.println("Dikdörtgenin kenar uzunluklarını girin: ");
        Rectangle islem2 = new Rectangle(sc.nextInt(),sc.nextInt());
        islem.setArea(islem2.getA()* islem2.getB());
        islem.setPerimeter( 2*( islem2.getA()+islem2.getB() ));
        System.out.println( islem );

    }

}
