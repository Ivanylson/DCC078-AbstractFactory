public class Cliente {
    private Associacao associacao;
    private Satisfacao satisfacao;


    public Cliente(AbstractFactory factory){
        this.associacao = factory.nomeAssociacao();
        this.satisfacao = factory.tipoSatisfacao();
    }

    public String imprimeAssociacao(){
        return this.associacao.imprime();
    }

    public String imprimeSatisfacao(){
        return this.satisfacao.imprime();
    }
}
