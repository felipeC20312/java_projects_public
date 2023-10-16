package comFactoryMethod;

public class ProcessoPaypalFactory implements ProcessoPagamentoFactory {
    @Override
    public ProcessoPagamento criarProcessoPagamento() {
        return new ProcessoPaypal();
    }
}
