import java.util.Scanner;

public class Ex11 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double tamanhoArquivo, arquivoBaixado, percentual;

        tamanhoArquivo = 2048;

        IO.println("Quanto do arquivo ja foi baixado?");
        arquivoBaixado = sc.nextDouble();

        percentual = (arquivoBaixado/tamanhoArquivo)*100;

        if (arquivoBaixado<tamanhoArquivo){
            IO.println("ja foi baixado "+percentual+"% do arquivo");
        }else if (arquivoBaixado==tamanhoArquivo){
            IO.println("download concluido");
        }else {
            IO.println("valor invalido");
        }
    }
}
