public class ex03 {

    public static void main(String[] args) {

        String[] cidade ={
                "Curitiba",
                "Tibagi",
                "Joinville",
                "Porto Alegre",
                "São Paulo",
        };;

        int[] nivel = {40, 10, 110, 90, 170};

        for(int i = 0; i < nivel.length; i++){

            if(nivel[i] > 100){

                System.out.println(cidade[i] + " Nivel de poluição muito alto! ");
            }
        }
    }
}
