import java.util.Scanner;

public class Ex05 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double totalGuardado,metaGuardar;
        double metaExtra,metaRestante;

        metaGuardar = 500;

        IO.println("Quanto você conseguiu guardar esse mês?");
        totalGuardado = sc.nextDouble();

        if (totalGuardado == metaGuardar){
            IO.println("Você atingiu a meta de guardar R$"+metaGuardar+" este mês");
        }else if (totalGuardado > metaGuardar){
            metaExtra = totalGuardado-metaGuardar;
            IO.println("Você ultrapassou a meta, foi guardado R$"+metaExtra+" a mais que a meta a guardar");
        }else if (totalGuardado < metaGuardar){
            metaRestante = metaGuardar-totalGuardado;
            IO.println("Você não atingiu a meta, faltou R$"+metaRestante+" para atingir a meta.");
        }
    }
}
