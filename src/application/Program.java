package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("***** leitura e escrita de arquivos *****".toUpperCase());

        String path = "D:\\A_CURSO_JAVA UDEMY\\arquivos\\arquivos_txt\\arquivo_leitura.txt";
        int cont = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null) {
                System.out.println(cont + " - " + line);
                line = br.readLine();
                cont++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
