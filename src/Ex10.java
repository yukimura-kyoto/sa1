import java.util.Scanner;

public class Ex10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double paginasLidas, paginasMeta,paginasRestantes;

        paginasMeta = 300;

        IO.println("Quantas paginas voce leu?");
        paginasLidas = sc.nextDouble();

        paginasRestantes = (paginasLidas/paginasMeta)*100;

        IO.println(paginasRestantes);

        if (paginasLidas<paginasMeta){
            IO.println("voce leu "+paginasRestantes+"% do livro");
        }else if (paginasLidas==paginasMeta){
            IO.println("parabens voce completou o livro");
        }else {
            IO.println("valor invalido");
        }
    }
}
