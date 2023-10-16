package semFactoryMethod.view;

import semFactoryMethod.ProcessoCartao;
import semFactoryMethod.ProcessoPagamento;
import semFactoryMethod.ProcessoPayPal;

public class main {
    public static void main(String[] args) {
        ProcessoPagamento ProcessoPaypal = new ProcessoPayPal();
        ProcessoPagamento ProcessoCartao = new ProcessoCartao();
    }
}
