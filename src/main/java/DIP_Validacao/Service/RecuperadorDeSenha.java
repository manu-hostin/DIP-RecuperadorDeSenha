package DIP_Validacao.Service;

import DIP_Validacao.Interface.IComunicador;

public class RecuperadorDeSenha {

    private IComunicador comunicador;
    public RecuperadorDeSenha(IComunicador comunicador) {
        this.comunicador = comunicador;
    }


    public void recuperar (String contato) {

        String link = "http://techstore.com/reset?token=123";

        comunicador.enviar(
                "Clique no link para resetar sua senha: " + link
        );

    }

}
