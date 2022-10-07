import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClienteTest {
    @Test
    void deveSerEmpresaAlimentos(){
        AbstractFactory factory = new EmpresaAlmentosMetricaLealdade();
        Cliente cliente = new Cliente(factory);
        assertEquals("Empresa de Alimentos", cliente.imprimeAssociacao());
    }

    @Test
    void deveSerMetricaLealdadeCliente(){
        AbstractFactory factory = new EmpresaAlmentosMetricaLealdade();
        Cliente cliente = new Cliente(factory);
        assertEquals("Metrica de Lealdade Cliente", cliente.imprimeSatisfacao());
    }

    @Test
    void deveSerEmpresaSaude(){
        AbstractFactory factory = new EmpresaSaudeSatisfacaoCliente();
        Cliente cliente = new Cliente(factory);
        assertEquals("Empresa de Saúde", cliente.imprimeAssociacao());
    }

    @Test
    void deveSerSatifacaoCliente(){
        AbstractFactory factory = new EmpresaSaudeSatisfacaoCliente();
        Cliente cliente = new Cliente(factory);
        assertEquals("Satisfação do Cliente", cliente.imprimeSatisfacao());
    }
}