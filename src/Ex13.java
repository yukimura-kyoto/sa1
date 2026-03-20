import java.util.Scanner;

public class Ex13 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double planoUso, planoUtilizado,planoDisponivel;

        IO.println("qual o total de internet disponivel? em GB (1024)");
        planoDisponivel = sc.nextDouble();
        IO.println("quanto ja foi utilizado?");
        planoUtilizado = sc.nextDouble();

        planoUso = (planoUtilizado/planoDisponivel)*100;

        if (planoUso<80){
            IO.println("Uso dentro do limite");
        }else if (planoUso>=80 && planoUso==100){
            IO.println("Atencao: voce esta proximo do limite");
        }else if (planoUso>100){
            IO.println("limite excedido");
        }
    }
}
