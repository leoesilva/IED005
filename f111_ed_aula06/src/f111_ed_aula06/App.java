package f111_ed_aula06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;
    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static final String EX_DIR = "E:\\Documents\\Atividades\\IED005\\";

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        ex04();
    }

    private static void ex01() {
        String FILE_IN = EX_DIR + "aula06\\ex01_in.txt";
        String FILE_OUT = EX_DIR + "aula06\\ex01_out.txt";
        try {
            fileReader = new FileReader(FILE_IN);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_OUT);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        try {
            String linha = bufferedReader.readLine();
            ArrayList<String> nomes = new ArrayList<>();
            while (linha != null) {
                nomes.add(linha);
                linha = bufferedReader.readLine();
            }
            Collections.sort(nomes);
            for (String nome : nomes) {
                bufferedWriter.write(nome);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            System.out.println("Realizado com sucesso!");
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    private static void ex02() {
        String FILE_IN = EX_DIR + "aula06\\ex02_in.txt";
        String FILE_OUT = EX_DIR + "aula06\\ex02_out.txt";
        try {
            fileReader = new FileReader(FILE_IN);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_OUT);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        try {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] divisao = linha.split(" ");
                if (Double.parseDouble(divisao[divisao.length - 1]) >= 7) {
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

    private static void ex03() {
        String FILE_IN = EX_DIR + "aula06\\ex03_in.txt";
        String FILE_OUT = EX_DIR + "aula06\\ex03_out.txt";
        try {
            fileReader = new FileReader(FILE_IN);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_OUT);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        try {
            String linha = bufferedReader.readLine();
            while (linha != null) {
                String resultado = "";
                String[] divisao = linha.split("-");
                if (Integer.parseInt(divisao[2]) > Integer.parseInt(divisao[3])) {
                    resultado = "Vencedor: " + divisao[0];
                } else if (Integer.parseInt(divisao[3]) > Integer.parseInt(divisao[2])) {
                    resultado = "Vencedor: " + divisao[1];
                } else {
                    resultado = "Empate";
                }
                bufferedWriter.write(linha);
                bufferedWriter.write(" " + resultado);
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

    private static void ex04() {
        String FILE_IN = EX_DIR + "aula06\\ex04_in.txt";
        String FILE_OUT = EX_DIR + "aula06\\ex04_out.txt";
        try {
            fileReader = new FileReader(FILE_IN);
            bufferedReader = new BufferedReader(fileReader);
            fileWriter = new FileWriter(FILE_OUT);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
        try {
            String linha = bufferedReader.readLine();
            int cTimes = Integer.parseInt(linha);
            if (cTimes >= 2 && cTimes <= 99) {
                String[] times = new String[cTimes];
                int[] pontuacao = new int[cTimes];
                for (int i = 0; i < cTimes; i++) {
                    linha = bufferedReader.readLine();
                    times[i] = linha.substring(2);
                }
                linha = bufferedReader.readLine();
                int cPartidas = Integer.parseInt(linha);
                for (int i = 0; i < cPartidas; i++) {
                    linha = bufferedReader.readLine();
                    String[] placares = linha.split(" ");
                    if (Integer.parseInt(placares[2]) > Integer.parseInt(placares[3])) {
                        pontuacao[Integer.parseInt(placares[0]) - 1] += 3;
                    } else if (Integer.parseInt(placares[3]) > Integer.parseInt(placares[2])) {
                        pontuacao[Integer.parseInt(placares[1]) - 1] += 3;
                    } else {
                        pontuacao[Integer.parseInt(placares[0]) - 1] += 1;
                        pontuacao[Integer.parseInt(placares[1]) - 1] += 1;
                    }
                }
                for (int i = 0; i < times.length - 1; i++) {
                    for (int j = 0; j < times.length - i - 1; j++) {
                        if (pontuacao[j] < pontuacao[j+1]) {
                            String tempTime = times[j];
                            int tempPont = pontuacao[j];
                            times[j] = times[j+1];
                            pontuacao[j] = pontuacao[j+1];
                            times[j+1] = tempTime;
                            pontuacao[j+1] = tempPont;
                        }
                    }
                }
                /*-------------------------------------------------------------------
                    for (int i = 0; i < times.length; i++) {
                        System.out.println(times[i] + " - " + pontuacao[i] + "pts.");
                    }
                -------------------------------------------------------------------*/
                String resultado = "Campeão - " + times[0] + " - " + pontuacao[0] + " pontos";
                bufferedWriter.write(resultado);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                System.out.println("Realizado com sucesso!");
            } else {
                System.out.println("A quantidade de times deve estar entre 2 e 99");
            }
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
