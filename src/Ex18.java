import java.util.Scanner;

public class Ex18 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int pontuacao;

        IO.println("qual sua pontuacao jogador?");
        pontuacao = sc.nextInt();

        if (pontuacao<50){
            IO.println("Ruim");
        }else if (pontuacao>=50 && pontuacao<=100){
            IO.println("Medio");
        }else if (pontuacao>100){
            IO.println("Pro");
        }
    }
}
