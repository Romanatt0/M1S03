import java.util.ArrayList;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        ArrayList<Integer> energia = new ArrayList<>();


        energia.add(100);
        energia.add(434);
        energia.add(121);
        energia.add(434);
        energia.add(30);
        energia.add(134);
        energia.add(112);
        energia.add(123);
        energia.add(109);
        energia.add(90);
        energia.add(80);
        energia.add(65);
        energia.add(100);
        energia.add(200);

        int valor = 0;

        for (int i = 0; i < energia.size(); i++) {

            valor = valor + energia.get(i);
        }

        double resut = valor / 12;

        System.out.println(resut + "kWh por mês");

    }
}
