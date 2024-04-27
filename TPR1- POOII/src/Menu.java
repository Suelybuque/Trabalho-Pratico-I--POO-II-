public class Menu {

    Visualizacao vis;
    Tarefas tf;
     Validacao val;
    public Menu(){
        vis= new Visualizacao();
        tf= new Tarefas();
        val= new Validacao();
    }

    public void menu(){
        int opcao=0, op, op2;
        boolean executou1= false;

        do {
            vis.visualizarOpcoesMenu();
            opcao= val.validarInt("Introduza uma opcao",1, 12);

            switch (opcao){
                case 1: tf.lerFicheiro();
                            executou1=true;
                            break;
                case 2: if (executou1)
                            tf.adaptQtTipo();
                        else
                             System.out.println("Execute a opcao 1 primeiro");
                break;
                case 3: if (executou1)
                            tf.adaptQtHotel();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 4:  if (executou1 ){
                            vis.visualizarOpcoesSubMenu();
                             op= val.validarInt("Introduza uma opcao", 1, 2);
                            if (op==1)
                                tf.adaptDadosDomestico();
                            else{
                                vis.visualizarOpcoesSubMenu2();
                                 op2= val.validarInt("Introduza uma opcao", 1, 2);
                                 if (op2==1)
                                     tf.adaptDadosDirecto();
                                 else
                                     tf.adaptDadosTransito();
                            }
                        }
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 5: if (executou1)
                            tf.adaptValorTotal();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 6: if (executou1)
                            tf.adaptadorValorTotalIva();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 7: if (executou1)
                            tf.remover();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 8: if (executou1)
                            tf.adaptadorAlterarDados();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 9: if (executou1)
                            tf.adaptMesAbril();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 10: if (executou1)
                            tf.adaptEstado();
                        else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 11:  if (executou1){
                            vis.visualizarOpcoesSubMenuBonus();
                            int opb= val.validarInt("Introduza uma opcao", 1,2);
                            if (opb==1){
                                vis.visualizarOpcoesSubmenuBonus2();
                                int opb2= val.validarInt("Introduza uma opcao", 1,2);
                                if (opb2==1){
                                    tf.reserva(1);
                                } else if (opb2==2) {
                                    int n= val.validarInt("Introduza o numero de passagens que deseja reservar(1-5)" ,1,5);
                                    tf.reserva(n);

                                }
                                tf.adaptEscrever();
                            }else if (opb==2){
                                tf.adaptVisDadosReserva();
                            }
                        }else
                            System.out.println("Execute a opcao 1 primeiro");
                break;
                case 12:
                    System.out.println("Obrigado por usar o nosso sistema!"); break;
            }

        }while (opcao!=12);
    }

}
