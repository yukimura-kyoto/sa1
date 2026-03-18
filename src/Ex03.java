import java.util.Scanner;

public class Ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nome, curso;
        int idade;

        IO.println("===============================");
        IO.println("Olá, cadastre-se na Plataforma\n"
                +"===============================\n");

        IO.println("Qual seu Nickmane?");
        nome = sc.nextLine();
        IO.println("Qual seu jogo favorito?");
        curso = sc.nextLine();
        IO.println("Qual sua pontuação Atual?");
        idade = sc.nextInt();

        IO.println("Bem vindo "+nome+"\n"+
                "Você seu jogo favorito é "+curso+"\n"+
                "Sua pontuação é "+idade);
    }
}
