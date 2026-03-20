import java.util.Scanner;

public class Ex09 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double valor;

        IO.println("Qual o preço do produto que você quer comprar?");
        valor = sc.nextDouble();

        if (valor>100){
            IO.println("voce tem direito ao frete gratis");
        }else if (valor<100){
            IO.println("adicione mais produtos para ter frete gratis");
        }
    }
}

