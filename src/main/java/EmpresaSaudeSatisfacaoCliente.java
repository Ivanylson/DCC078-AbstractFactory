public class EmpresaSaudeSatisfacaoCliente implements AbstractFactory{
    @Override
    public Associacao nomeAssociacao() {
        return new EmpresaSaude();
    }

    @Override
    public Satisfacao tipoSatisfacao() {
        return new SatisfacaoCliente();
    }
}
