import java.util.Scanner;

public class Ex14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double cotaDiaria, totalFaturado, percentualMeta,faltou,excedeu;

        cotaDiaria = 5000;

        IO.println("quanto foi faturado");
        totalFaturado = sc.nextDouble();

        percentualMeta = (totalFaturado/cotaDiaria)*100;

        if (totalFaturado<cotaDiaria){
            faltou = cotaDiaria-totalFaturado;
            IO.println("cota nao atingida, faltou R$"+faltou+" para atingir a meta");
        }else if (totalFaturado>cotaDiaria){
            excedeu = totalFaturado-cotaDiaria;
            IO.println("cota atingida, voce teve R$"+excedeu+" a mais que a cota necessaria");
        }else if (totalFaturado==cotaDiaria){
            IO.println("voce obteve a cota diaria");
        }
        IO.println(percentualMeta+"% foi atingido");
    }
}
