product = "Cerveja";
productPrice = 18.00;
isRestricted = False


name = input("Digite seu nome: \n");
age = int(input("Digite sua idade: \n"));
balance = float(input("Digite seu saldo: \n"));

quantityProduct = int(input("Digite a quantidade do produto: \n"));

totalPrice = quantityProduct * productPrice;

if isRestricted:
    if age >= 18:
        if  totalPrice > balance:
            print("Saldo insuficiente para a compra")
        else:
            print("Compra aprovada")
    else:
        print("Produto para maiores de 18 anos" )
else:
    if totalPrice <= balance:
        print("Compra aprovada")
    else:
        print("Sem saldo para a compra")
        
    


        
    
