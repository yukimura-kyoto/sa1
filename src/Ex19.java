import java.util.Scanner;

public class Ex19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int horas;

        IO.println("quantas horas voce dormiu?");
        horas = sc.nextInt();

        if (horas<5){
            IO.println("Pessimo");
        }else if (horas >=5 && horas <=8){
            IO.println("OK");
        }else if (horas>8){
            IO.println("Excelente");
        }
    }
}
