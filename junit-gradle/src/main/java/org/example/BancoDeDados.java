package org.example;

import java.util.logging.Logger; // Importa a classe Logger do pacote java.util.logging

public class BancoDeDados {

    // Cria um objeto Logger para registrar mensagens de log
    private static Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    // Método estático para iniciar a conexão com o banco de dados
    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexao"); // Registra uma mensagem de log informando que a conexão foi iniciada
    }

    // Método estático para finalizar a conexão com o banco de dados
    public static void finilizarConexao() {
        LOGGER.info("Finalizou conexao"); // Registra uma mensagem de log informando que a conexão foi finalizada
    }

    // Método estático para inserir dados de uma pessoa no banco de dados
    public static void insereDados(Pessoa pessoa) {
        LOGGER.info("Inseriu dados"); // Registra uma mensagem de log informando que os dados foram inseridos
    }

    // Método estático para remover dados de uma pessoa do banco de dados
    public static void removeDados(Pessoa pessoa) {
        LOGGER.info("Removeu dados"); // Registra uma mensagem de log informando que os dados foram removidos
    }
}
