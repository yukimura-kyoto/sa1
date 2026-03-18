import java.util.Scanner;

public class Ex07 {
    static void main() {
        double n1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua nota?");
        n1 = sc.nextDouble();

        if (n1>=7){
            IO.println("Aprovado");
        }else {
            IO.println("Reprovado");
        }
    }
}
