
//
inicio
definir variavel vchar: produto = cerveja, nomeCliente 
definir variavel int: idade, quantidade
idade = , quantidade =
definir variavel float  : preço produto = 18, saldo diponivel, valor total 

leia 
entrada de dado: nome do cliente 
entrada de dado: idade do cliente
entrada de dado: saldo do cliente

imprima: produtos disponiveis e quantidades e preços 

leia
    entrada de dado: qual produto e qual quantidade

calcule:
    valor total = preço do produto * quantidade 

SE idade for <18
    imprima compra rejeitada por idade
        SE saldo for menor que o valor da compra
        imprima compra rejeitada por saldo insuficiente

SE idade for >=18 e saldo for menor que o valor da compra
    imprima compra rejeitada por saldo

SENAO
    imprima comprovante de compra realizada     

//fim




