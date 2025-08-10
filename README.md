# Bank Withdrawal

Um programa que feito em Java que simula um saque em dinheiro. O usuário fornece a quantia que deseja sacar e o programa retorna
a quantia dividida em notas de 50, 25 e 5 somente.

## Exemplos:

-> *Quantia: 100*

<- *2 notas de 50*

---

-> *Quantia: 125*

<- *2 notas de 50 e 1 nota de 25*

---

-> *Quantia: 135*

<- *2 notas de 50, 1 nota de 25 e 2 notas de 5*

---

-> *Quantia: 30*

<- *1 nota de 25 e 1 nota de 5*

---

## Regras de negócio

- [x] A quantia deve ser divisível por 5 e positivo. Caso contrário, o programa
  deve apresentar
  uma mensagem de erro ao usuário;

- [x] A nota de 50 deve ser prioridade;

