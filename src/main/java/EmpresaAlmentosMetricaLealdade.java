public class EmpresaAlmentosMetricaLealdade implements AbstractFactory{
    @Override
    public Associacao nomeAssociacao() {
        return new EmpresaAlimentos();
    }

    @Override
    public Satisfacao tipoSatisfacao() {
        return new MetricaLealdadeCliente() ;
    }
}
