import java.io.*;
import java.util.*;

public class EscreverFicheiro {
    public EscreverFicheiro(){}

    public void escrever(Vector<String> vec){
        try{
            FileWriter fw = new FileWriter("Dados.txt");
            for(String linha : vec) {
                fw.write(linha + "\n");
            }
            fw.close();
            System.out.println("Ficheiro criado com sucesso!");
        } catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
