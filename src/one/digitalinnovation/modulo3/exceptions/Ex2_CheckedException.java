package one.digitalinnovation.modulo3.exceptions;

import javax.swing.*;
import java.io.*;

/**
 * Ex 2 - Checked Exception
 * Imprimir um arquivo no console
 */

public class Ex2_CheckedException {

    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) {

        String nomeDoArquivo = "romances-blake-crouch.txt";

        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Revise o nome do arquivo que você deseja imprimir - error: " + e.getCause()
            );
        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro insperado! Entre em contato com o suporte! - error: " + e.getCause()
            );

        } finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("\nApesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        // ira ler o arquivo
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine(); //ira ler linha por linha o arquivo dentro do Buffer

        // impressão/saida no console
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //laço do/while -> ira ler linha por linha o arquivo dentro do Buffer
        do {
            bw.write(line); //escrever uma nova linha
            bw.newLine();
            line = br.readLine();
        } while (line != null);

        bw.flush(); // descarregar o BufferedWriter no console
        br.close(); //fechar o BufferedReader
    }
}
