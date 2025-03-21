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
                total += faceDoDado;

                System.out.println("Voce jogou: " + faceDoDado);
            }

            System.out.println("Soma das faces dos dados jogados: " + total);
        }

        scanner.close();
    }
}
