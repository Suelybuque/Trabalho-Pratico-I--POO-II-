import java.util.Vector;

public class Visualizacao {

    public void visualizarDomesticos(Vector vec){
        Domestico dom;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass= (Passagem)vec.elementAt(i);
            if (pass instanceof Domestico){
                dom= (Domestico) vec.elementAt(i);
                System.out.println(dom.toString());
            }

        }
    }

    public void visualizarTransito(Vector vec){
        Transito tr;
        Internacional it;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass = (Passagem) vec.elementAt(i);
            if (pass instanceof  Internacional){
                it= (Internacional) vec.elementAt(i);
                if (it instanceof Transito){
                    tr= (Transito) vec.elementAt(i);
                    System.out.println(tr.toString());
                }
            }
        }
    }

    public void visualizarDirecto(Vector vec){
        Directo dir;
        Internacional it;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass = (Passagem) vec.elementAt(i);
            if (pass instanceof  Internacional){
                it= (Internacional) vec.elementAt(i);
                if (it instanceof Directo){
                    dir= (Directo) vec.elementAt(i);
                    System.out.println(dir.toString());
                }
            }
        }

    }

    public void visualizaValorTotalIVA(float valorTotalIVA) {
    }
}
