import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Scanner S = new Scanner(System.in);
            System.out.println("Favor informe o Cep");
            String informa =S.nextLine();
            Endereco novoEndereco = consultaCep.buscaEndereco(informa);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);

        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finish Apliccation");
        }
    }

}