package implementacao.bancodedados;/*
Conectando o Java com o Banco de Dados relacional já criado em Mysql, usando o JDBC.

Configuração:
- Criar o banco com suas tabelas no MySql Workbenck.
- Baixar o driver JDBC do MySql e descompactar. --> mysql-connector-j-8.1.0.zip.
    JDBC é um conjunto de bibliotecas que irá fazer a conexão do banco de dados com a linguagem.
- Copiar e colar a arquivo .jar na pasta lib do seu projeto e Add New Library ou inserir no Project Struture.

No Java:
- Criar o pacote e a classe de conexão.
    (url, user, password). de acordo com as configurações do banco.
- Criar o pacote (entify) e a classe (Usuario) para a estrutura do banco.
    A classe Usuario será o objeto java que contem todos os atributos/informações do banco de dados.
    Encapsular os atributos com os Getters e os Setters.
- Criar o pacote (DAO) e a classe do (UsuarioDAO).
    DAO é um conceito para que uma classe inserira o SQL, ou seja, é o objeto de acesso a dados e metodos que fazem conexão com o banco.
    Inserção dos dados.
- Na classe main criar o novo (Usuario).
    inserir os atributos do banco com o set.
    e instanciar o UsuarioDAO que é a classe do SQL.
- Verificar no Workbanch se foi as informações para o banco corretamente.

Com o XAMPP instalado e configurado, poderá acessar o banco com o servidor Apache no localhost
localhost/phpmyadmin/

 */