import java.util.Scanner;

public class Ex20 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double valorCompra, desconto = 0;
        String cashback = "";

        IO.println("Qual o valor da sua compra?");
        valorCompra = sc.nextDouble();

        if (valorCompra <= 100) {
            cashback = "2%";
            desconto = valorCompra * 0.02;
        } else if (valorCompra <= 500) {
            cashback = "5%";
            desconto = valorCompra * 0.05;
        } else {
            cashback = "10%";
            desconto = valorCompra * 0.10;
        }


        IO.println("Você tem " + cashback + " de cashback");
        IO.println("voce tem R$"+desconto+" de cashback");
    }
}
