package DIP_Validacao.Comunicacao;

import DIP_Validacao.Interface.IComunicador;

public class ServicoEmail implements IComunicador {

    @Override
    public void enviar (String mensagem) {
        System.out.println("Enviando E-mail SMTP: " + mensagem);
    }

}
