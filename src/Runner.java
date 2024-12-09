import java.util.Scanner;

/*
Task 01 >
fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
Runeer class'da obj ile cevre ve alan değelerini print eden code create ediniz.
*/
public class Runner {
    public static void main(String[] args) {

        Rectangle islem = new Rectangle();
        //1
        islem.calculatePerimeter(3, 4);
        islem.calculateArea(4, 5);

        //2
        Scanner sc = new Scanner(System.in);
        System.out.println("Dikdörtgenin kenar uzunluklarını girin: ");
        islem.setA(sc.nextInt());
        islem.setB(sc.nextInt());
        islem.calculateArea(islem.getA(), islem.getB());
        islem.calculatePerimeter(islem.getA(), islem.getB());

        //3
        islem.setArea(islem.getA()* islem.getB());
        System.out.println("islem.getArea() = " + islem.getArea());
        islem.setPerimeter( 2*( islem.getA()+islem.getB() ));
        System.out.println("islem.getPerimeter() = " + islem.getPerimeter());
    }

}
