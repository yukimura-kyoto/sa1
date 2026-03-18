import java.util.Scanner;

public class Ex04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int passos,passosRestantes,metaPassos,passosExtra;


        metaPassos = 10000;

        IO.println("Quantos passos você deu hoje?");
        passos = sc.nextInt();

        if (passos == 10000){
            IO.println("Sua meta foi cumprida, você andou "+passos+" passos hoje.");
        }else if (passos < 10000){
            passosRestantes = metaPassos-passos;
            IO.println("Sua meta não foi cumprida, faltaram "+passosRestantes+" para completar sua meta");
        }else {
            passosExtra = passos-metaPassos;
            IO.println("A meta foi ultrapassada, você andou "+passosExtra+" a mais.");
        }
    }
}
