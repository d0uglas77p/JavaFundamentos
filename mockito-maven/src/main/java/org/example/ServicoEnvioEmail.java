package org.example;

public class ServicoEnvioEmail {

    private PlataformaDeEnvio plataforma;

    public void enviaEmail(String enderecoEmail, String mensagem, boolean formatoHtml) {
        Email email;

        if (formatoHtml) {
            email = new Email(enderecoEmail, mensagem, Formato.HTML);
        } else {
            email = new Email(enderecoEmail, mensagem, Formato.TEXTO);
        }

        plataforma.enviaEmail(email);
    }
}
