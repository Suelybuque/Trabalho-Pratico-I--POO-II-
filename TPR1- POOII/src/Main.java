public class Main {
    public static void main(String[] args) {
        Tarefas tf= new Tarefas();
        System.out.println("A executar");
        tf.lerFicheiro();
        //tf.adaptQtTipo();
       // tf.remover();
        tf.adaptVisDados();
        tf.adaptadorAlterarDados();
    }
}