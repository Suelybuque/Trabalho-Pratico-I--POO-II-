import java.util.*;
public class Pesquisa {

    public Pesquisa(){}

    public int pesquisa(Vector vec, String nome, String apelido ){
        int ind=-1;
        boolean encontrado=false;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass= (Passagem) vec.elementAt(i);
            if (pass.getNome().equalsIgnoreCase(nome) && pass.getApelido().equalsIgnoreCase(apelido)){
                ind=i;
                encontrado=true;
            }
        }

        return ind;
    }



}
