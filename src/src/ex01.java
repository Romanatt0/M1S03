import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] temp = new int[7];

        double media = 0;

        for(int i = 0; i < temp.length; i++){

            System.out.print("Me informe a temperatura do dia " + (i + 1) + ": ");
            temp[i] = sc.nextInt();

            media = temp[i];

        }

        media = media/ temp.length;

        System.out.println("Temperatura media do dia: " + media + " Graus Celsius ");


    }
}