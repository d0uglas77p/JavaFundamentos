package poo.polimorfismo;

/*
O polimorfismo é um conceito fundamental da programação orientada a objetos que permite que objetos de diferentes classes sejam tratados de maneira uniforme através de uma interface comum.
Isso promove flexibilidade, reutilização e extensibilidade do código.

Existem dois tipos principais de polimorfismo em Java:
- polimorfismo de sobrecarga (overloading)
- polimorfismo de sobrescrita (overriding).

1. Polimorfismo de Sobrecarga (Overloading):
O polimorfismo de sobrecarga ocorre quando duas ou mais funções no mesmo escopo têm o mesmo nome,
mas assinaturas diferentes (número diferente de parâmetros ou tipos de parâmetros diferentes).
Em tempo de compilação, o compilador determina qual função será chamada com base nos argumentos passados.

2. Polimorfismo de Sobrescrita (Overriding):
O polimorfismo de sobrescrita ocorre quando uma subclasse fornece uma implementação específica de um método que já está definido na sua superclasse.
O método na subclasse substitui (ou sobrescreve) o método correspondente na superclasse.
Isso é feito para fornecer uma implementação especializada do método na subclasse.

O polimorfismo de sobrescrita é frequentemente usado em conjunto com referências de tipos de superclasse que apontam para objetos de subclasses,
permitindo que métodos sejam chamados de maneira dinâmica com base no tipo real do objeto em tempo de execução (princípio de associação tardia ou late binding).
 */