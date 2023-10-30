package comFactoryMethod.view;

import comFactoryMethod.ProcessoCartãoFactory;
import comFactoryMethod.ProcessoPagamento;
import comFactoryMethod.ProcessoPagamentoFactory;
import comFactoryMethod.ProcessoPaypalFactory;

public class main {
    public static void main(String[] args) {
    
    ProcessoPagamentoFactory factory;

    factory = new ProcessoPaypalFactory();
    ProcessoPagamento processoPaypal = factory.criarProcessoPagamento();

    factory = new ProcessoCartãoFactory();
    ProcessoPagamento processoCartao = factory.criarProcessoPagamento();
    }

}
