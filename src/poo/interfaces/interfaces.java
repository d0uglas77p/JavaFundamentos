package poo.interfaces;

/*
Uma interface é uma coleção de métodos abstratos e constantes (variáveis finais) que define um contrato para as classes que a implementam.
Interfaces permitem a implementação de múltiplas heranças de tipo, possibilitando que uma classe possa implementar comportamentos de várias interfaces diferentes.

Características das Interfaces:

Métodos Abstratos:
Uma interface contém apenas métodos abstratos, ou seja, métodos sem implementação. Os métodos declarados em uma interface são implicitamente public e abstract.

Constantes (Variáveis Finais):
Interfaces também podem conter constantes, que são implicitamente public, static e final. Essas constantes são frequentemente utilizadas para definir valores padrão.

Implementação por Classes:
Uma classe implementa uma interface usando a palavra-chave implements, e deve fornecer implementações para todos os métodos abstratos definidos pela interface.


Usos e Benefícios das Interfaces:
Abstração e Polimorfismo:

Interfaces permitem abstrair comportamentos comuns em um contrato definido por métodos abstratos, facilitando a implementação de polimorfismo.
Contratos Claros:

Interfaces estabelecem contratos claros entre as classes que as implementam, garantindo consistência e interoperabilidade.
Flexibilidade e Extensibilidade:

Classes podem implementar múltiplas interfaces, permitindo flexibilidade na composição de comportamentos.
Padrões de Design:

Interfaces são frequentemente utilizadas em padrões de design como Strategy, Observer, entre outros, para promover a separação de preocupações e a modularidade.
 */