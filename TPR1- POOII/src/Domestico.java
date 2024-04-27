public class Domestico extends  Passagem implements CalculoFinal_IVA{
    private String periodo;
    public  static int contDomestico;
    public Domestico (int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String periodo){
        super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase);
        this.periodo= periodo;
        contDomestico++;
    }

    public Domestico(){
        this(0, "", "", "", "","", "", "", "",0, "");

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

    @Override
    public float valPagar() {
        float val=valBase;
        if (periodo.equalsIgnoreCase("Tarde"))
            val+=valBase*TARDE;
        else if (periodo.equalsIgnoreCase("Noite"))
            val+=valBase*NOITE;
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
