import java.util.*;
public class Calculos
{
    public Calculos()
    {

    }
    public float valorTotalIVA(Vector v)
    {
        float vt = 0;
        Passagem p;
        Internacional it;
        CalculoFinal_IVA cal;
        for(int i = 0; i < v.size(); i++)
        {
            p = (Passagem)v.elementAt(i);
            if(p instanceof Internacional)
            {
                it=(Internacional)v.elementAt(i);
                if(it instanceof Directo)
                {
                    cal= (Directo) p;
                    vt += cal.valIva();
                }
                else  if(it instanceof Transito)
                {
                        cal= (Transito) p;
                        vt += cal.valIva();
                }

            }
            else  if(p instanceof Domestico)
            {
                    cal = (Domestico) p;
                    vt += cal.valIva();

            }
        }
        return vt;
    }


    public float calcularVtLAM(Vector v)
    {
        float vt = 0;
        Passagem p;
        CalculoFinal_IVA cal;
        for(int i = 0; i < v.size(); i++)
        {
            p = (Passagem) v.elementAt(i);
            Internacional internacional;
            if(p instanceof Internacional)
            {
                internacional = (Internacional) p;
                if(internacional instanceof Transito)
                {
                    cal= (Transito)p;
                    vt += cal.valFinal();
                }
                else if (internacional instanceof Directo)
                {
                    cal= (Directo)p;
                    vt += cal.valFinal();
                }
            }
            else if(p instanceof Domestico)
                {
                    cal= (Domestico)p;
                    vt += cal.valFinal();
                }

        }
        return vt;
    }

    public int numeroHotel(Vector vec){
        Passagem pas;
        Internacional it;
        Transito tr;
        int n=0;

        for (int i=0; i< vec.size(); i++){
            pas= (Passagem) vec.elementAt(i);
            if (pas instanceof  Internacional){
                it= (Internacional)  vec.elementAt(i);
                if (it instanceof Transito){
                    tr= (Transito) vec.elementAt(i);
                    if (tr.getQtHoras()>12)
                        n++;
                }
            }
        }

        return n;

    }

}
