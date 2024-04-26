import java.util.*;
public class Alteracao
{
    private Validacao validacao;
    public Alteracao()
    {

    }
    public void alterarDados(Vector v, int indice)
    {
        Passagem p;
        validacao = new Validacao();
        String estado, horaPartida, horaChegada;
            System.out.println("================ ALTERACAO DE DADOS ================");
            estado = validacao.validarString("Estado da passagem?\n[A embarcar]\n[Atrasado]\n[Check-In]\n=> ");
            horaPartida = validacao.validarString("Hora de partida? Ex: HH:MM");
            horaChegada = validacao.validarString("Hora de chegada? Ex: HH:MM");
            p = (Passagem) v.elementAt(indice);
            p.setEstado(estado);
            p.setHorPartida(horaPartida);
            p.setHorChegada(horaChegada);
            System.out.println("Dados alterados com sucesso !");
            System.out.println(v.elementAt(indice));


    }


}
