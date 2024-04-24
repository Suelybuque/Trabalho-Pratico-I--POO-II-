public final class Directo extends Internacional implements CalculoFinal_IVA {

   public static int contDirecto;
   private String refeicao;

   public Directo (String codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto, String refeicao) {
       super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase, visto);
       this.refeicao= refeicao;
       contDirecto++;
   }

   public  Directo (){
       this("", "", "", "", "","", "", "", "",0, "", "");

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
    public float vp()
    {
        float vp = 0;
        if(refeicao.equalsIgnoreCase("Sim"))
        {
            vp += REFEICAO;
        }
        return vp;
    }
    @Override
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
