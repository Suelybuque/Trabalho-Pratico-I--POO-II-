abstract class Internacional extends Passagem {

    protected String visto;
    public static int contInternacional;

    public Internacional (int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto){
        super(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase);
        this.visto= visto;
        contInternacional++;
    }

    public Internacional(){
        this(0, "", "", "", "","", "", "", "",0, "");
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
}
