import java.util.Scanner;

public class Ex17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double bateriaCelular;

        IO.println("quantos porcento ta seu celular?");
        bateriaCelular = sc.nextDouble();

        if (bateriaCelular<20){
            IO.println("Critico");
        }else if (bateriaCelular>=20 && bateriaCelular<=80){
            IO.println("Normal");
        }else if (bateriaCelular>80){
            IO.println("Alto");
        }
    }
}
