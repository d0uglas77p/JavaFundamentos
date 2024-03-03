package implementacao.biblioteca;

/*
----------------------------------------
RESUMO PARA ENTENDER O ECOSISTEMA JAVA

JVM = carrega e executa os aplicativos java em qualquer maquina que contem um sistema operacional.
Compila os arquivos .java em arquivos .class -> (bytecode) e é entendido pela maquina virtual.
JRE = ambiente de execução java, é utilizado pelo usuario que vai executar algum programa java na sua maquina e dentro dele existe uma jvm.
JDK = kit de desenvolvimento, usado para desenvolver o java.

Basicamente, a JVM é onde o sistema Java é executado.
JRE é o ambiente de execução Java, que possui JVM e a biblioteca de classes do Java.
e o JDK, possui uma JRE adicionando as ferramente exclusivas do desenvolvimento
----------------------------------------

Boa parte dos frameworks utilizam os jars
.jar = empacotamento de uma uma biblioteca do java

É possivel exportar o arquivo jar e o executavel dele.
A exportação do jar executavel tera que ter a classe main para ser distribuido e usado no ambiente jre,
e poder usar os metotos criados no java.

Exemplo de lib:
o apache communs tem um conjunto de bibliotecas: lang, collections, codec, email e etc...

Biblioteca pelo IntelliJ:
1. No repositorio central escolher a biblioteca, baixar o arquivo zip que contem o .jar e extrair.
2. - Verificar se a lib esta em External Libraries ou em Libraries
   - File > Project Struture > Libraries
   - Adicionar New Project Libraries - Java e procurar o diretorio do arquivo .jar extraido
   - Aplicar e Ok, verificar se está em External Libraries
   - Na classe que quer usar, aplicar a função que deseja.
   - Verificar se o import foi feito na classe --> import org.apache.commons.lang3.StringUtils;

   É possivel adicionar tambem um diretorio para os .jar no seu projeto diretamente no seu projeto.
   - Clique em New na pasta do seu projeto > Directory
   - Cria uma pasta chamada lib > copie e cole o arquivo .jar na pasta lib
   - Clique com o botão direito sobre o jar e vai em Add as Library
   - Create library - ok

   É possivel verificar quais bibliotecas que estão já estão em seu projeto junto com a JDK.
   - File > Project Struture > Modulos > SeuProjeto

É possivel ver a referencia do codigo fonte da biblioteca em External Libraries.
O aquivo .class que já vem complidado, para poder rodar no seu projeto.
Na documentação contém toda as descrições.

Maven = gerenciador de dependencias do java/compilação de codigo e seu empacotamento
pom.xml =  descreve o projeto contruido, suas dependencias sobre modulos e componentes externos, ordem de compilação, diretorios e plugins.
<dependency>
    <gropId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.8.1</version>
</dependency>

 */