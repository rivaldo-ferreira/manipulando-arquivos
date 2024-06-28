package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.println("***** leitura e escrita de arquivos *****".toUpperCase());

        File file = new File("D:\\A_CURSO_JAVA UDEMY\\arquivos\\arquivos_txt\\arquivo_leitura.txt");
        Scanner dg = null;
        int cont = 1;

        try {
            dg = new Scanner(file);
            while(dg.hasNextLine()){
                System.out.println(cont + " - " + dg.nextLine().toUpperCase());
                cont++;
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if(dg != null){
                dg.close();
            }
        }
    }
}
