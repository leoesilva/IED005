package f111_ed_aula05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;
    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static final String FILE_IN = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\entrada.txt";
    private static final String FILE_OUT = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\saida.txt";

    public static void main(String[] args) {
        try {
            fileReader = new FileReader(FILE_IN);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_OUT);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        // exemploLeitura();
        // exemploEscrita();
        // ex1Maiusculo();
        // ex2DataSubstring();
        // ex3DataSplit();
        ex4RedeProteina();
    }

    private static void exemploLeitura() {
        try {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    private static void exemploEscrita() {
        try {
            bufferedWriter.write("Linha 1");
            bufferedWriter.write("Linha 2");
            bufferedWriter.newLine();
            bufferedWriter.write("Linha 3");
            bufferedWriter.flush();

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    private static void ex1Maiusculo() {
        // String textoNormal = "Exemplo";
        // String textoMaiusculo = textoNormal.toUpperCase();
        try {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                bufferedWriter.write(linha.toUpperCase());
                bufferedWriter.newLine();
                linha = bufferedReader.readLine();
            }
            bufferedWriter.flush();
            System.out.println("Realizado com sucesso!");

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    private static void ex2DataSubstring() {
        String dataAmericana = "03/21/2024";
        String dataBrasileira = dataAmericana.substring(3, 5)
                + "/" + dataAmericana.substring(0, 2)
                + "/" + dataAmericana.substring(6);
        System.out.println(dataBrasileira);
    }

    private static void ex3DataSplit() {
        String dataAmericana = "03/21/2024";
        String[] dataDividida = dataAmericana.split("/");
        String dataBrasileira = dataDividida[1] + "/" + dataDividida[0] + "/" + dataDividida[2];
        System.out.println(dataBrasileira);
    }

    private static void ex4RedeProteina() {
        try {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] divisao = linha.split(" ");
                if (Double.parseDouble(divisao[1]) >= 0.5) {
                    bufferedWriter.write(linha);
                    bufferedWriter.newLine();
                }                
                linha = bufferedReader.readLine();
            }
            bufferedWriter.flush();
            System.out.println("Realizado com sucesso!");

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
