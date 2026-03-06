package DIP_Validacao.Service;

import DIP_Validacao.Interface.IComunicador;

public class ServicoSMS implements IComunicador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}
