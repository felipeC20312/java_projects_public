package comFactoryMethod;

public class ProcessoCartãoFactory implements ProcessoPagamentoFactory{
    @Override
    public ProcessoPagamento criarProcessoPagamento() {
        return new ProcessoCartao();
    }
}
