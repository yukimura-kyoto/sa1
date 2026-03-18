import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int numPedido;
        String nomePrato, nomeCliente;
        double valorPedido;

        IO.println("=================================\n"+
                " Bem Vindo ao Restaurante Karma\n"+
                "=================================");

        IO.println("Qual o seu nome");
        nomeCliente = sc.nextLine();
        IO.println("Qual prato você quer?");
        nomePrato = sc.nextLine();
        IO.println("Qual o valor?");
        valorPedido = sc.nextDouble();

        IO.println("=================================\n"+
                "               NFE\n"+
                "=================================");
        IO.println("Nome do Cliente: "+nomeCliente+"\n"+"Nome do Prato: "+nomePrato+"\n"+"Valor: R$"+valorPedido);
    }
}
