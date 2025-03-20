# Day of the Week Challenge

Este repositório contém a solução para o **Day of the Week Challenge**, um desafio do curso de Java ministrado por **Tim Buchalka**. O objetivo é praticar o uso do **Enhanced Switch Statement** e explorar diferentes abordagens para retornar o nome do dia da semana com base em um número inteiro.

## Descrição do Desafio

1. Criar um método `printDayOfWeek(int day)` que utiliza o **switch expression** para mapear um número (0 a 6) para um dia da semana, retornando "Invalid Day" para valores fora desse intervalo.
2. Criar um método alternativo `printWeekDay(int day)`, utilizando um **array de strings** para mapear os dias da semana e um operador ternário para validação.
3. No `main`, chamar os métodos para valores de `0` a `7` e exibir os resultados.

## Tecnologias Utilizadas
- Java 17+
- Estruturas de Controle (`switch`, `if-else`)
- Arrays
- Operador Ternário

## Como Executar
1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/day-of-week-challenge.git
   ```
2. Compile o código:
   ```sh
   javac DayOfWeek.java
   ```
3. Execute o programa:
   ```sh
   java DayOfWeek
   ```

## Saída Esperada
O programa imprime o dia correspondente para valores de `0` a `6`, e "Invalid Day" para qualquer outro valor.

```sh
Day 0 corresponds to: Sunday
Day 1 corresponds to: Monday
...
Day 6 corresponds to: Saturday
Day 7 corresponds to: Invalid Day

Using optimized array alternative:
Day 0 corresponds to: Sunday
...
Day 7 corresponds to: Invalid Day
```

## Créditos
Curso: **Complete Java Masterclass**
Instrutor: **Tim Buchalka**

---
Se tiver sugestões ou quiser contribuir, fique à vontade para abrir um PR! 🚀
