public class Passagem {
    protected String  codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino;
    protected  float valBase;

    public Passagem (String codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase){
        this.codigo= codigo;
        this.nome= nome;
        this.apelido= apelido;
        this.dtpartida= dtpartida;
        this.horPartida= horPartida;
        this.horChegada= horChegada;
        this.estado= estado;
        this.origem= origem;
        this.destino= destino;
        this.valBase= valBase;
    }

    public Passagem(){
        this("", "", "", "", "","", "", "", "",0);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValBase(float valBase) {
        this.valBase = valBase;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setHorChegada(String horChegada) {
        this.horChegada = horChegada;
    }

    public void setHorPartida(String horPartida) {
        this.horPartida = horPartida;
    }

    public void setDtpartida(String dtpartida) {
        this.dtpartida = dtpartida;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public float getValBase() {
        return valBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDtpartida() {
        return dtpartida;
    }

    public String getHorPartida() {
        return horPartida;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", data de partida='" + dtpartida + '\'' +
                ", hora de Partida='" + horPartida + '\'' +
                ", hora de Chegada='" + horChegada + '\'' +
                ", estado='" + estado + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", valor Base=" + valBase +
                '}';
    }
}