import java.util.Scanner;
import java.util.ArrayList;

public class ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> trilha = new ArrayList<>();

        int i = 1;
        while ( i == 1) {

            System.out.println("Digite uma das opções: \n 1- Adicionar Ponto de interesse \n 2- Remover \n 3- Listar \n 4- Sair ");
             int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:

                    if (trilha.size() == 0) {

                        System.out.println("Digite qual seria o ponto de interesse: ");
                        scanner.nextLine();
                        String ponto = scanner.nextLine().trim();

                        trilha.add(ponto);

                        System.out.println("Ponto adicionado com sucesso!");
                    } else{

                        System.out.println("Gostaria de adicinar o ponto de interesse em algum ponto específico? \n 1- Sim 2- Não");
                        opcao = scanner.nextInt();

                        if (opcao == 1) {

                            System.out.println("Digite qual seria o ponto de interesse: ");
                            scanner.nextLine();
                            String ponto = scanner.nextLine().trim();

                            System.out.println("Digite a posição");
                            int posicao = scanner.nextInt();

                            trilha.add(posicao, ponto);

                            System.out.println("Ponto adicionado com sucesso!");
                        } else {

                            System.out.println("Digite qual seria o ponto de interesse: ");
                            scanner.nextLine();
                            String ponto = scanner.nextLine().trim();

                            trilha.add(ponto);

                            System.out.println("Ponto adicionado com sucesso! \nposição: " + trilha.indexOf(ponto) );
                        }
                    }
                break;

                case 2:

                    System.out.println("Digite o index do ponto que deseja remover: ");
                    int index = scanner.nextInt();

                    System.out.println("Ponto : " + trilha.get(index) + " removido com sucesso!");

                    trilha.remove(index);
                break;

                case 3:

                    for(int n = 0 ; n < trilha.size(); n++){

                        System.out.println(n + " - "+ trilha.get(n));
                    }
                break;

                case 4:

                    i = 0;

                    System.out.println("Tenha um ótimo dia! ");

                    break;
            }
        }
    }
}
