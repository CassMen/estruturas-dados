# @author Rita Menezes.

# Nó para uma lista encadeada simples.
class No:
    def __init__(self, valor):
        self.valor = valor
        self.proximo = None

    

# Lista encadeada simples.
class ListaEncadeada:
    cabeca = None # Nó inicial.


    def __init__(self, valor = None):
        self.cabeca = No(valor)


    """
    Insere um No no início da lista com o valor dado.
    """
    def inserir(self, valor):
        no = No(valor)

        if (self.cabeca != None):
            no.proximo = self.cabeca

        self.cabeca = no


    """
    Busca por um valor qualquer.
    Retorna true se pertencer à lista, false caso contrário.
    """
    def buscar(self, valor):
        atual = self.cabeca

        while (atual != None):
            if (atual.valor == valor):
                return True
            if (atual.proximo == None):
                return False
            else:
                atual = atual.proximo

        return False
	

    """
    Remove um valor, caso esteja na lista.
    """
    def remover(self, valor):
        if (self.cabeca != None):
            if (self.cabeca.valor == valor):
                self.cabeca = self.cabeca.proximo
            else:
                anterior = self.cabeca
                atual = self.cabeca.proximo
                while (atual != None):
                    if (atual.valor == valor):
                        anterior.proximo = atual.proximo
                        atual = None
                        break
                    else:
                        anterior = atual
                        atual = atual.proximo
						
	
	
    def __str__(self):
        conteudo = ""
        atual = self.cabeca
        while (atual != None):
            conteudo += str(atual.valor)
            atual = atual.proximo
            
        return conteudo

	
lista = ListaEncadeada('A')
lista.inserir('J')
lista.inserir('F')
lista.inserir('B')
lista.inserir('W')


# Como fizemos a inserção no início da lista, ela fica de trás pra frente.
print(lista)

lista.remover('A')
lista.remover('W')
print(lista)

print("Achou A? " + str(lista.buscar('A')))
print("Achou F? " + str(lista.buscar('F')))
