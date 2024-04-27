public final class Directo extends Internacional implements CalculoFinal_IVA {

   public static int contDirecto;
   private String refeicao;

   public Directo (int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto, String refeicao) {
       super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase, visto);
       this.refeicao= refeicao;
       contDirecto++;
   }

   public  Directo (){
       this(0, "", "", "", "","", "", "", "",0, "", "");

   }


    public String getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(String refeicao) {
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        return super.toString()+"Directo{" +
                "refeicao='" + refeicao + '\'' +
                '}';
    }

    @Override
    public float valPagar() {
       float val=valBase;
       val+=valBase*INTER_TAXA;
       if (refeicao.equalsIgnoreCase("Sim"))
           val+=REFEICAO;
        return val;
    }

    @Override
    public float valIva() {
        return valPagar()*IVA;
    }

    @Override
    public float valFinal() {
        return valPagar()+valIva();
    }
}
