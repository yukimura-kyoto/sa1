import java.util.Scanner;

public class Ex01 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nome, curso;
        int idade;

        IO.println("===============================");
        IO.println("Olá, cadastre-se na Plataforma");
        IO.println("===============================\n");

        IO.println("Qual seu nome?");
        nome = sc.nextLine();
        IO.println("Qual Curso você está matriculado?");
        curso = sc.nextLine();
        IO.println("Qual sua Idade?");
        idade = sc.nextInt();

        IO.println("Bem vindo "+nome+"\n"+
                "Você está cursando "+curso+"\n"+
                "Você tem "+idade+" Anos");
    }
}
