public class Transito extends Internacional implements CalculoFinal_IVA{
   private int qtHoras;
   public  static int contTransito;
    // public static int contHotel = 0;
   public Transito(String codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto, int qtHoras) {
       super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase, visto);
       this.qtHoras= qtHoras;
       contTransito++;

   }
    public Transito(){
        this("", "", "", "", "","", "", "", "",0, "", 0);

    }

    public int getQtHoras() {
        return qtHoras;
    }

    public void setQtHoras(int qtHoras) {
        this.qtHoras = qtHoras;
    }

    @Override
    public String toString() {
        return super.toString()+"Transito{" +
                "qtHoras=" + qtHoras +
                '}';
    }
    public float vp()
    {
        float vp = 0;
        if(qtHoras >= 6 || qtHoras <= 12)
        {

            vp -= valBase * DESCONTO_TRANSITO;
        }
        else
        {
            // Socorro
            if(qtHoras > 12)
            {
                System.out.println("Direito a hotel adquirido !");
                // contHotel++;
            }
        }
        return vp;
    }
    public float valIva()
    {
        float valorPagar, iva;
        valorPagar = vp();
        iva = valorPagar * IVA;
        return iva;
    }
    public float valFinal()
    {
        float valorPagar, iva;
        valorPagar = vp();
        iva = valIva();
        return valorPagar + iva;
    }
}
