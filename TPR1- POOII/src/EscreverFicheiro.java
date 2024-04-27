import java.util.*;
import java.io.*;

public class EscreverFicheiro {
    public EscreverFicheiro(){}

    public void escrever(Vector vec){
        try{
            FileOutputStream fo=  new FileOutputStream("Dados.dat");
            ObjectOutputStream os= new ObjectOutputStream(fo);

            os.writeObject(vec);
            os.close();
            System.out.println("Ficheiro de objectos criado com sucesso!");
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}
