import java.util.Scanner;

public class Ex12 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double totalAulas, totalAulasFeitas, percentual;
        totalAulas = 60;

        IO.println("Quantas aulas ja foram concluidas?");
        totalAulasFeitas = sc.nextDouble();

        percentual = (totalAulasFeitas/totalAulas)*100;
        IO.println("voce ja fez "+percentual+"% do curso");

        if (percentual<50){
            IO.println("voce ainda esta no comeco do curso");
        }else if (percentual ==50 && percentual<100){
            IO.println("voce esta avancando bem");
        }else if (percentual>=100){
            IO.println("parabens curso concluido");
        }
    }
}
