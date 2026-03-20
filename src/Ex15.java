import java.util.Scanner;

public class Ex15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double calorias,caloriasLimite,percentual;

        caloriasLimite = 2000;

        IO.println("quantas calorias voce consumiu hoje");
        calorias = sc.nextDouble();

        percentual = (calorias/caloriasLimite)*100;
        if (calorias>caloriasLimite){
            IO.println("voce ultrapassou as calorias limite");
        }else if (calorias<caloriasLimite){
            IO.println("voce esta dentro dos limites");
        }
        IO.println(percentual+"% do limite de calorias");
    }
}
