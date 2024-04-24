abstract class Internacional extends Passagem implements CalculoFinal_IVA{

    protected String visto;
    public static int contInternacional;

    public Internacional (String codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto){
        super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase);
        this.visto= visto;
        contInternacional++;
    }

    public Internacional(){
        this("", "", "", "", "","", "", "", "",0, "");
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    @Override
    public String toString() {
        return super.toString()+"Internacional{" +
                "visto='" + visto + '\'' +
                '}';
    }
    public float vp()
    {
        float vp = 0;
        if(visto.equalsIgnoreCase("Nao"))
        {
            vp += vp * (TAXA_SEMVISTO);
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
