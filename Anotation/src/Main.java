public class Main {
    public static void main(String[] args) {
        Tabela anotacao = Classe.class.getAnnotation(Tabela.class);
        String nomeDaTabela = anotacao.nome();

        System.out.println("Nome da Tabela: " + nomeDaTabela);

        Classe exemplo = new Classe("Exemplo");
        exemplo.exibirDados();
    }
}