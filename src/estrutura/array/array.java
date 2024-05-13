package estrutura.array;

/*
Um array é uma estrutura de dados que armazena uma coleção de itens
do mesmo tipo, que pode ser um tipo primitivo ou um objeto.
Cada  item  no vetor possui o seu próprio local numerado, chamado índice.
O índice é utilizado para acessar um elemento no vetor, assim, recuperar ou atribuir uma informação naquele índice.
Em um array o índice se inicia a partir do 0, ou seja,
para acessar o elemento que está na segunda posição do array utilizaremos o índice 1 e assim sucessivamente.

Em Java, listas (List) e arrays (array) são conceitos distintos e têm diferenças significativas em termos de funcionalidade, flexibilidade e uso.

Arrays (array):

Arrays em Java são estruturas de dados que armazenam elementos do mesmo tipo em uma sequência contígua de memória.
Os arrays têm um tamanho fixo que é definido na criação e não pode ser alterado depois.
Os elementos de um array podem ser acessados diretamente por meio de um índice numérico.
Arrays podem ser usados para armazenar primitivos (como int, float, char, etc.) ou objetos (como String, Object, outras arrays, etc.).
Exemplo de declaração: int[] numeros = new int[5];
Listas (List):

Listas em Java são estruturas de dados que representam uma coleção ordenada de elementos.
As listas são interfaces no Java (por exemplo, List, ArrayList, LinkedList) que permitem armazenar e manipular coleções de objetos.
Listas são flexíveis em tamanho, ou seja, podem crescer dinamicamente à medida que mais elementos são adicionados e podem diminuir quando elementos são removidos.
As listas oferecem métodos para adicionar, remover, acessar, pesquisar e manipular elementos de forma eficiente.
Listas podem conter elementos de qualquer tipo de objeto (incluindo null).
Exemplo de declaração usando ArrayList: List<String> nomes = new ArrayList<>();
Principais diferenças entre Array e List:

Tamanho Fixo vs Dinâmico:

Um array tem um tamanho fixo que é definido na criação e não pode ser alterado posteriormente.
Uma lista é dinâmica e pode crescer ou diminuir conforme necessário.
Flexibilidade:

Arrays são menos flexíveis em comparação com listas. Uma vez criado, o tamanho de um array não pode ser alterado.
Listas oferecem mais flexibilidade e funcionalidades adicionais, como adicionar, remover e pesquisar elementos de forma eficiente.
Tipo de Dados:

Arrays podem armazenar elementos de tipos primitivos e objetos.
Listas são usadas principalmente para armazenar objetos e oferecem uma maneira mais fácil de manipular coleções de elementos.
API:

Arrays têm uma funcionalidade básica limitada, enquanto as listas fornecem uma API mais rica com métodos úteis para manipulação de coleções, como add(), remove(), get(), size(), entre outros.
Em resumo, embora tanto arrays quanto listas sejam usados para armazenar coleções de elementos em Java, eles têm propósitos e comportamentos diferentes.
Arrays são mais simples e têm tamanho fixo, enquanto as listas são mais flexíveis e oferecem funcionalidades avançadas para manipulação dinâmica de coleções.
A escolha entre usar um array ou uma lista depende das necessidades específicas do seu programa em relação à manipulação e gerenciamento de dados.
 */