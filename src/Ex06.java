import java.util.Scanner;

public class Ex06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double totaldeEstudo, metaEstudar;
        double estudoExtra, quantoFalta;

        metaEstudar = 40;

        IO.println("Quanto tempo você estudou este mês?");
        totaldeEstudo = sc.nextDouble();

        if (totaldeEstudo == metaEstudar){
            IO.println("Você atingiu a meta de estudar "+ metaEstudar +" este mês");
        }else if (totaldeEstudo > metaEstudar){
            estudoExtra = totaldeEstudo - metaEstudar;
            IO.println("Você ultrapassou a meta, você estudou"+ estudoExtra +" a mais que a meta a estudar");
        }else if (totaldeEstudo < metaEstudar) {
            quantoFalta = metaEstudar - totaldeEstudo;
            IO.println("Você não atingiu a meta, faltou " + quantoFalta + " horas para atingir a meta.");
        }
    }
}
