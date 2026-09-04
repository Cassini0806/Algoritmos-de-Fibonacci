# Algoritmos de Fibonacci
Esta é uma coleção de algoritmos para a sequência de Fibonacci em diferentes linguagens de programação.

A sequência de Fibonacci é uma sequência de números inteiros, com valores iniciais de 0 e 1, onde cada termo é igual a soma de seus dois antecessores. Matematicamente representamos a sequência pela seguinte função:

$$
F(n) =
\begin{cases}
0, & \text{se } n = 0 \\
1, & \text{se } n = 1 \\
F(n-1) + F(n-2), & \text{se } n > 1
\end{cases}
$$

O algoritmo implementado em todos os codigos-fonte segue uma abordagem iterativa, onde os termos A e B são somados sequencialmente em um laço de repetição.

```
ALGORITMO Fibonacci_Iterativo

ENTRADA: n (inteiro não negativo)
SAÍDA: n-ésimo número da sequência de Fibonacci

INÍCIO
    SE n <= 0 ENTÃO
        RETORNE 0
    FIM SE

    SE n == 1 ENTÃO
        RETORNE 1
    FIM SE

    anterior <- 0
    atual <- 1

    PARA i DE 2 ATÉ n FAÇA
        proximo <- anterior + atual
        anterior <- atual
        atual <- proximo
    FIM PARA

    RETORNE atual
FIM
```

## Catálogo de Linguagens Utilizadas

O algoritmo já foi implementado nas seguintes linguagens:

* C
* JavaScript
* Julia
* Python
* Rust
