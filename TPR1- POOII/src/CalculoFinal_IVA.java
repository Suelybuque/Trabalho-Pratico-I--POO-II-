public interface CalculoFinal_IVA {
    final float TARDE=10/100f, NOITE=20/100f, IVA=16/100f, DESCONTO=10/100f, INTER_TAXA=25/100f;
    final int REFEICAO= 3000;
    public float valPagar();
    public float valIva();
    public float valFinal();
}
