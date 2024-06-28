package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("***** leitura e escrita de arquivos *****".toUpperCase());

        String path = "D:\\A_CURSO_JAVA UDEMY\\arquivos\\arquivos_txt\\arquivo_leitura.txt";
        BufferedReader br = null;
        FileReader fr = null;
        int cont = 1;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while(line != null){
                System.out.println(cont + " - " + line);
                line = br.readLine();
                cont++;
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
