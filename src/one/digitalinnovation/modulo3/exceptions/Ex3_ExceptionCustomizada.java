package one.digitalinnovation.modulo3.exceptions;

import javax.swing.*;
import java.io.*;

/**
 * Ex 3 - Exception Customizada
 * Imprimir um arquivo no console
 * Nome do arquivo: src/one/digitalinnovation/modulo3/exceptions/romances-blake-crouch.txt
 */

public class Ex3_ExceptionCustomizada {

    public static void main(String[] args) {

        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo){

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line); //escrever uma linha
                bw.newLine(); //pular uma linha
                line = br.readLine(); //ler uma linha
            } while (line != null);
            bw.flush(); //descarregar
            br.close(); //fechamento
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, por favor, fale com o suporte" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);

        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath()); //lançando a exception - ira receber o nomeDoArquivo e o diretorio
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    //construtor
    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString(){
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo = '" + nomeDoArquivo + '\'' +
                ", diretorio = '" + diretorio + '\'' +
                '}';
    }
}
