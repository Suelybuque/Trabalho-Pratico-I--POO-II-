public class Domestico extends  Passagem implements CalculoFinal_IVA{
    private String periodo;
    public  static int contDomestico;
    public Domestico (String codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String periodo){
        super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase);
        this.periodo= periodo;
        contDomestico++;
    }

    public Domestico(){
        this("", "", "", "", "","", "", "", "",0, "");

    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return super.toString()+"Domestico{" +
                "periodo='" + periodo + '\'' +
                '}';
    }

    public float vp()
    {
        float vp = 0;
        if(periodo.equalsIgnoreCase("Tarde"))
        {
            vp += vp * (VIAGEM_TARDE);
        }
        else
        {
            if(periodo.equalsIgnoreCase("Noite"))
            {
                vp += (vp * VIAGEM_NOITE);
            }
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
