import java.util.Scanner;

public class Ex16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double horasLimites,percentual,horasUsadas,ultraPassadas;
        horasLimites = 4;

        IO.println("quantas horas de celular voce teve hoje?");
        horasUsadas = sc.nextDouble();

        percentual = (horasUsadas/horasLimites)*100;

        if (horasUsadas<horasLimites){
            IO.println("voce respeitou o limite");
        }else if (horasUsadas>horasLimites){
            ultraPassadas = horasUsadas-horasLimites;
            IO.println("voce ultrapassou "+ultraPassadas+" horas do seu limite");
        }

        IO.println(percentual+"% do limite de uso de tela");
    }
}
