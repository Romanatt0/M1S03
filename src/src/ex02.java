import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] animais = {"Leão", "Tigre", "Zebra", "Urso", "Raposa"};

        String [] nivel = {"Sem risco de extinção", "Risco de extinsão!", "Sem risco de extinção", "Sem risco de extinção", "Risco de extinção!"};

        System.out.print("Digite o nome de um animal: ");
        String nome = sc.nextLine().trim();

        for(int i = 0; i < animais.length; i++){

            if(animais[i].toUpperCase().equals(nome.toUpperCase())){

                int n = i;

                i = animais.length;

                System.out.println("O animal consta no sistema!");

                System.out.println(animais[n] + ": " + nivel[n]);

            } else if (i >= animais.length - 1) {

                System.out.println("Animal não encontrado!");

            }



        }
    }
}
