package DIP_Validacao;

import DIP_Validacao.Interface.IComunicador;
import DIP_Validacao.Service.RecuperadorDeSenha;
import DIP_Validacao.Comunicacao.ServicoEmail;
import DIP_Validacao.Comunicacao.ServicoSMS;

public class Main {

    public static void main(String[] args) {

        // Recuperação usando EMAIL
        IComunicador email = new ServicoEmail();

        RecuperadorDeSenha recuperadorEmail =
                new RecuperadorDeSenha(email);

        recuperadorEmail.recuperar("cliente@email.com");

        System.out.println("---------------------------------");


        // Recuperação usando SMS
        IComunicador sms = new ServicoSMS();

        RecuperadorDeSenha recuperadorSMS =
                new RecuperadorDeSenha(sms);

        recuperadorSMS.recuperar("47999999999");

    }

}