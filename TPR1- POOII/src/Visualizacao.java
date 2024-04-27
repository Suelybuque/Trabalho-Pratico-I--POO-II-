import java.util.Vector;

public class Visualizacao {

    public void visualizarDomesticos(Vector vec){
        Domestico dom;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass= (Passagem)vec.elementAt(i);
            if (pass instanceof Domestico){
                dom= (Domestico) vec.elementAt(i);
                System.out.println(dom.toString());
            }

        }
    }

    public void visualizarTransito(Vector vec){
        Transito tr;
        Internacional it;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass = (Passagem) vec.elementAt(i);
            if (pass instanceof  Internacional){
                it= (Internacional) vec.elementAt(i);
                if (it instanceof Transito){
                    tr= (Transito) vec.elementAt(i);
                    System.out.println(tr.toString());
                }
            }
        }
    }

    public void visualizarDirecto(Vector vec){
        Directo dir;
        Internacional it;
        Passagem pass;
        for (int i=0; i<vec.size(); i++){
            pass = (Passagem) vec.elementAt(i);
            if (pass instanceof  Internacional){
                it= (Internacional) vec.elementAt(i);
                if (it instanceof Directo){
                    dir= (Directo) vec.elementAt(i);
                    System.out.println(dir.toString());
                }
            }
        }

    }

    public void vooAbril(Vector vec){
        Passagem pass;
        System.out.println("Voos no mes de Abril");

        for (int i=0; i<vec.size(); i++){
            pass= (Passagem) vec.elementAt(i);
            String data= pass.getDtpartida().substring(3, 5);
            if (data.equals("04")){
                System.out.println(pass);
            }
        }
    }
    public void visualizaValorTotalIVA(float valorTotalIVA) {
        System.out.println("Valor total de Iva:" + valorTotalIVA);
    }

    public void visualizarEstadoLAM(float valorTotalLAM)
    {
        if(valorTotalLAM > 750000)
            System.out.println("LAM esta em lucro !\nLucro : "+valorTotalLAM);
        else
            System.out.println("LAM esta em prejuizo !");
    }

    public void visualizarOpcoesMenu(){
        System.out.println("************Menu***********");
        System.out.println("1.Ler dados do ficheiro de texto; \n2.Visualizar quantidade de passagens de cada tipo \n" +
                "3. Visualizar quantidade de passagens com direito a hotel \n4. Visualizar dados das passagens " +
                "\n5. Visualizar valor total recebido pela LAM" +
                "\n6. Visualizar o valor total do IVA \n7.Cancelar voo \n8.Alterar dados de passagem \n9. Visualizar  todos os voos para o mes de abril" +
                "\10.Verificar a situacao financeira da empresa \n11. Reservar passagem \n12.Sair do programa.");
    }

    public void visualizarOpcoesSubMenu(){
        System.out.println("4.1. Visualizar dados dos voos domesticos \n4.2. Visualizar dados dos voos internacionais");
    }

    public void visualizarOpcoesSubMenu2(){
        System.out.println("4.2[1]. Visualizar dados dos voos Directos \n4.2[2]. Visualizar dados dos voos em Transito");
    }


    //Bonus
    public void visualizarOpcoesSubMenuBonus(){
        System.out.println("1.Introduzir e armazenar dados da reserva \n2. Visualizar dados de todas as reservas");
    }

    public void visualizarOpcoesSubmenuBonus2 (){
        System.out.println("1.Reservar uma passagem \n2. Reservar mais de uma passagem");
    }

    public void visualizarDadosReserva(Vector vec){
        for (int i= 0; i< vec.size(); i++){
            System.out.println(vec.elementAt(i));
        }
    }
}
