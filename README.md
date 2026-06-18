EXERCICIOS GENERICS POO - PROFESSOR TIAGO IFSC 06/2026

- Projeto ArrayUtil: criando métodos genéricos. Crie a classe ArrayUtil com os seguintes
métodos estáticos que operam em cima de um vetor genérico.

1) count(vetor, elemento): conta o número de ocorrências de elemento em vetor e retorna
(int). Perceba que a forma genérica de comparar se dois objetos são iguais é o “equals” e
não o “==” e como o vetor é genérico, poderá ser de Integer mas poderá ser por exemplo
de “String”. Faça os devidos testes para Integers e Strings.

2) max(vetor): retorna o maior elemento de um vetor. Perceba que nesse caso, para que o
algoritmo seja genérico, deverá utilizar o método compareTo da interface Comparable.
Caso o vetor seja nulo ou vazio lance uma IllegalArgumentException com a mensagem:
“Array vazio ou null”. Faça os devidos testes para Integers e Strings.

3) min(vetor): equivalente ao exercício 2 mas retorna o mínimo valor.

- Projeto Lists: criando classes genéricas. Complemente a classe ListaEncadeada criada em aula
e crie a ListaVetor genéricas.

4) Classe ListaEncadeada:
   
i. Crie o método add(valor, int pos): adiciona um valor (tipo genérico) na posição,
considere as posições de 0 a tamanho -1.

Caso se passe um valor fora do intervalo lance uma IllegalArgumentException com uma mensagem. 
Bônus: faça com que o método add(valor) que adiciona no final, chame esse método 
para evitar lógicas duplicadas.

ii. Crie o método remove(int pos): remove e retorna um elemento na posição passada por
parâmetro (não esqueça de decrementar o tamanho). Caso o parâmetro seja fora do
intervalo de posições lance uma IllegalArgumentException.

iii. Crie o método remove(valor): que remove o valor (tipo genérico) passado por
parâmetro. Retorne um boolean que informa se removeu algum elemento ou não da
lista.
