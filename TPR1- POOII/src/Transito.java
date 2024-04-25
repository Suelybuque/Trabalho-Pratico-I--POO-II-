public class Transito extends Internacional implements CalculoFinal_IVA{
   private int qtHoras;
   public  static int contTransito;

   public Transito(int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto, int qtHoras) {
       super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase, visto);
       this.qtHoras= qtHoras;
       contTransito++;

   }
    public Transito(){
        this(0, "", "", "", "","", "", "", "",0, "", 0);

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

    @Override
    public float valIva() {
        return 0;
    }

    @Override
    public float valFinal() {
        return 0;
    }
}
