import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProjetoEditorDeTextoBasico {

    String texto;

    public ProjetoEditorDeTextoBasico(String texto) {
        this.texto = texto;
    }

    public void salvarTexto(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);

            PrintWriter writer = new PrintWriter(arquivo);
            writer.println(texto);
            writer.close();

            System.out.println("Arquivo salvo com sucesso!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        ProjetoEditorDeTextoBasico editor =
                new ProjetoEditorDeTextoBasico(texto);

        editor.salvarTexto("meuarquivo.txt");

        scanner.close();
    }
}