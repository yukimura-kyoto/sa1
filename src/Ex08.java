import java.util.Scanner;

public class Ex08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idade;

        IO.println("Qual sua idade?");
        idade = sc.nextInt();

        if (idade >=18){
            IO.println("Você pode entrar no Evento");
        }else {
            IO.println("Você não pode entrar no evento");
        }
    }
}
