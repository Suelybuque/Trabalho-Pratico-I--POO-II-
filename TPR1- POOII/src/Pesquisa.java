import java.util.*;
public class Pesquisa {

    public Pesquisa(){}

    public int pesquisa(Vector vec, int codigo){
        int ind=-1;
        boolean encontrado=false;
        Passagem pass= new Passagem();
        for (int i=0; i<vec.size(); i++){
            pass= (Passagem) vec.elementAt(i);
            if (pass.getCodigo()==codigo){
                ind=i;
                encontrado=true;
            }
        }

        return ind;
    }



}
