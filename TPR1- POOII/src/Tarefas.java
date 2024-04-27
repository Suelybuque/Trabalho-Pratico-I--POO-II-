import java.util.*;
import java.io.*;
public class Tarefas {

    Vector vec;

    Vector vec_Reserva;
    Validacao validacao;
    Visualizacao vis ;
    Pesquisa pes;
   Calculos cal;

    public Tarefas(){
        vec= new Vector();
        validacao=new Validacao();
        vis = new Visualizacao();
        pes= new Pesquisa();
        cal =new Calculos();
        vec_Reserva=new Vector();
    }

    public  void  lerFicheiro(){
        StringTokenizer bloco;
        String linha,  nome, apelido, dtpartida,visto, horPartida, horChegada, estado, origem, destino, refeicao, criterio1, criterio2, periodo;
        int qtHoras, codigo;
        float valBase;

        try {
            BufferedReader br= new BufferedReader(new
                    FileReader("Dados2.txt"));
            linha=br.readLine();

            while (linha!=null){
                bloco= new StringTokenizer(linha, ";");
                codigo=Integer.parseInt(bloco.nextToken());
                nome= bloco.nextToken();
                apelido= bloco.nextToken();
                dtpartida= bloco.nextToken();
                horPartida= bloco.nextToken();
                horChegada= bloco.nextToken();
                estado= bloco.nextToken();
                origem= bloco.nextToken();
                destino= bloco.nextToken();
                valBase= Float.parseFloat(bloco.nextToken());
                criterio1= bloco.nextToken();

                if (criterio1.equalsIgnoreCase("Domestico")){
                    periodo = bloco.nextToken();
                    createDomestico(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase, periodo);
                } else if (criterio1.equalsIgnoreCase("Internacional")) {
                    visto= bloco.nextToken();
                    criterio2= bloco.nextToken();
                    if (criterio2.equalsIgnoreCase("Directo")){
                        refeicao= bloco.nextToken();
                        createDirecto(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase,visto,  refeicao);
                    } else if (criterio2.equalsIgnoreCase("Transito")) {
                        qtHoras= Integer.parseInt(bloco.nextToken());
                        createTransito(codigo, nome, apelido, dtpartida, horPartida, horChegada, estado, origem, destino, valBase,visto, qtHoras);
                    }
                }
                linha= br.readLine();

            }
            br.close();
            System.out.println("Ficheiro executado com sucesso.");
        }catch (FileNotFoundException fn){
            System.out.println("Ficheiro nao encontrado");
        }catch (NumberFormatException | IOException nio){
            System.out.println(nio.getMessage());
        }
    }


    private void createTransito(int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String visto, int qtHoras) {
        Transito t= new Transito();
        t.setCodigo(codigo);
        t.setNome(nome);
        t.setApelido(apelido);
        t.setDtpartida(dtpartida);
        t.setHorPartida(horPartida);
        t.setHorChegada(horChegada);
        t.setEstado(estado);
        t.setOrigem(origem);
        t.setDestino(destino);
        t.setValBase(valBase);
        t.setVisto(visto);
        t.setQtHoras(qtHoras);
        vec.addElement(t);
        vec.trimToSize();
    }

    private void createDirecto(int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase,String visto,  String refeicao) {
        Directo d= new Directo();
        d.setCodigo(codigo);
        d.setNome(nome);
        d.setApelido(apelido);
        d.setDtpartida(dtpartida);
        d.setHorPartida(horPartida);
        d.setHorChegada(horChegada);
        d.setEstado(estado);
        d.setOrigem(origem);
        d.setDestino(destino);
        d.setValBase(valBase);
        d.setVisto(visto);
        d.setRefeicao(refeicao);
        vec.addElement(d);
        vec.trimToSize();
    }

    private void createDomestico(int codigo, String nome, String apelido, String dtpartida, String horPartida, String horChegada, String estado, String origem, String destino, float valBase, String periodo) {
        Domestico domes= new Domestico();
        domes.setCodigo(codigo);
        domes.setNome(nome);
        domes.setApelido(apelido);
        domes.setDtpartida(dtpartida);
        domes.setHorPartida(horPartida);
        domes.setHorChegada(horChegada);
        domes.setEstado(estado);
        domes.setOrigem(origem);
        domes.setDestino(destino);
        domes.setValBase(valBase);
        domes.setPeriodo(periodo);
        vec.addElement(domes);
        vec.trimToSize();
    }


    public void adaptDadosDomestico(){
        vis.visualizarDomesticos(vec);
    }

    public void adaptDadosDirecto(){
        vis.visualizarDirecto(vec);
    }

    public void adaptDadosTransito(){
        vis.visualizarTransito(vec);
    }
    public void adaptadorValorTotalIva()
    {
        vis.visualizaValorTotalIVA(cal.valorTotalIVA(vec));
    }

    public void adaptValorTotal(){
        float valTotal= cal.calcularVtLAM(vec);
        vis.visualizarEstadoLAM(valTotal);
    }
    public void adaptadorAlterarDados()
    {
        Alteracao alt= new Alteracao();

        String name= validacao.validarString("Introduza o nome");
        String surname= validacao.validarString("Introduza o apelido");
        int indice= pes.pesquisa(vec, name, surname);
        alt.alterarDados(vec, indice);


    }

    public void adaptQtHotel(){
        System.out.println(cal.numeroHotel(vec));
    }

    public void remover(){
        int codigo= validacao.validarInt("Introduza o codigo", 10001, 99999);
        Passagem pas;
        for (int i=0; i<vec.size(); i++){
            pas= (Passagem) vec.elementAt(i);
            if (pas.getCodigo()==codigo){
                vec.removeElementAt(i);
                vec.trimToSize();
            }
        }
    }

    public void adaptQtTipo(){
        System.out.println("Quantidade de voos \ndomesticos:"+Domestico.contDomestico+ "\nInternacionais:"
                +Internacional.contInternacional + "\nDirectos:"+Directo.contDirecto+ "\nTransito:"+Transito.contTransito);
    }

    public void adaptMesAbril(){
        vis.vooAbril(vec);
    }

    public void adaptEstado(){vis.visualizarEstadoLAM(cal.calcularVtLAM(vec));}


    //Bonus

    public void reserva(int nReserva){
        String classe, dataPartida, horaPartida;
        int codigoReserva, codigoVoo;
        Vector<String> reserva= new Vector();

        for (int i=0; i<nReserva; i++){
            codigoReserva= validacao.validarInt("Introduza o codigo de reserva", 10001, 99999);
            dataPartida= validacao.validarString("Introduza a data de partida (DD/MM/AAAA)");
            horaPartida=validacao.validarString("Introduza a hora de partida (HH:MM");
            codigoVoo= validacao.validarInt("Introduza o codigo de reserva", 10001, 99999);
            classe = validacao.validarString("Introduza a classe (Economica/executiva)");

            reserva.add(Integer.toString(codigoReserva));
            reserva.add(dataPartida);
            reserva.add(horaPartida);
            reserva.add(Integer.toString(codigoVoo));
            reserva.add(classe);

            vec_Reserva.add(reserva);
            vec_Reserva.trimToSize();
        }

    }

    public void adaptEscrever(){
        EscreverFicheiro ef= new EscreverFicheiro();
        ef.escrever(vec_Reserva);
    }

    public void adaptVisDadosReserva(){
        vis.visualizarDadosReserva(vec_Reserva);
    }



}
