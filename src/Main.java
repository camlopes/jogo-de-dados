import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int quantidadeDados;
        int total = 0;
        int faceDoDado;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Escolha a quantidade de dados jogados: ");
        quantidadeDados = scanner.nextInt();

        if(quantidadeDados <= 0){
            System.out.println("A quantidade de dados não pode ser negativa ou 0.");
        } else {

            for(int i = 0; i < quantidadeDados; i++){
                faceDoDado = random.nextInt(1, 7);
                mostrarDado(faceDoDado);
                total += faceDoDado;

                System.out.println("Voce jogou: " + faceDoDado);
            }

            System.out.println("Soma das faces dos dados jogados: " + total);
        }

        scanner.close();
    }

    static void mostrarDado(int faceDoDado){
        String dado1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dado2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dado3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dado4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dado5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dado6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(faceDoDado){
            case 1 -> System.out.print(dado1);
            case 2 -> System.out.print(dado2);
            case 3 -> System.out.print(dado3);
            case 4 -> System.out.print(dado4);
            case 5 -> System.out.print(dado5);
            case 6 -> System.out.print(dado6);
            default -> System.out.print("Jogada invalida");
        }
    }
}
