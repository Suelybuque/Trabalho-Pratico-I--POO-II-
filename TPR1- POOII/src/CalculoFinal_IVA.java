public interface CalculoFinal_IVA {

    public final int REFEICAO = 3000;
    public final float DESCONTO_TRANSITO = 10/100f;
    public final float TAXA_SEMVISTO = 25/100f;
    public final float VIAGEM_TARDE = 10/100f;
    public final float VIAGEM_NOITE = 20/100f;
    public final float IVA = 16/100f;
    public float valIva();
    public float valFinal();
}
