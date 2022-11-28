import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){



            Scanner scanner = new Scanner(System.in);


            Parallelepiped parallelepiped = new Parallelepiped();
            System.out.println("     HRIGTH    :");
            parallelepiped.setHeigth(scanner.nextInt());
            System.out.println("     LENGTH    :");
            parallelepiped.setLength(scanner.nextInt());
            System.out.println("     WIDTH     :");
            parallelepiped.setWidth(scanner.nextInt());


            if (parallelepiped.getHeigth() < 0 || parallelepiped.getLength() < 0 || parallelepiped.getWidth() < 0) {
                throw new ArithmeticException("this number is negative");

            }
            if (parallelepiped.getHeigth() > 20 || parallelepiped.getLength() > 20 || parallelepiped.getWidth() > 20) {

                throw new ArithmeticException("this number is greater than 20");
            }



            System.out.println("                     SQUARE ");

            System.out.println(parallelepiped.getSquare(parallelepiped.getHeigth(), parallelepiped.getLength(), parallelepiped.getWidth()));


            System.out.println("                     VOLUME");

            System.out.println(parallelepiped.getVolume(parallelepiped.getHeigth(), parallelepiped.getLength(), parallelepiped.getWidth()));





    }
}