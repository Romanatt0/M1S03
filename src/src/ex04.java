import java.util.Scanner;
import java.util.ArrayList;


public class ex04 {

    public static void main(String[] args) {

        Scanner reciclagem = new Scanner(System.in);

        ArrayList<String> reciclados = new ArrayList<String>();


        System.out.println("Me diga quantas categarias de reciclaveis você deseja: ");
        int n = reciclagem.nextInt();
        reciclagem.nextLine();

        for(int i = 0; i < n; i++){

            System.out.println("Digite a categoria " + (i + 1) + ":");
            reciclados.add(reciclagem.nextLine());
        }

        for (int i = 0; i < reciclados.size(); i++) {
            System.out.println(reciclados.get(i));
        }
    }
}
