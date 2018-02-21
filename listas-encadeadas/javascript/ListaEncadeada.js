// @author Rita Menezes.

// Nó para uma lista encadeada simples.
function No(valor) {
	this.valor = valor;
	this.proximo = null;
}


// Lista encadeada simples.
function ListaEncadeada(valor = null) {
	this.cabeca = null; // Nó inicial.	
	if (valor != null) {
		this.cabeca = new No(valor);
	}

	
	// Insere um No no início da lista com o valor dado.
	this.inserir = function(valor) {
		var no = new No(valor);
		
		if (this.cabeca != null) {
			no.proximo = this.cabeca;
		}
		this.cabeca = no;
	}
	

	// Busca por um valor qualquer.
    // Retorna true se pertencer à lista, false caso contrário.
	this.buscar = function(valor) {
		var atual = this.cabeca;
	
		while (atual != null) {
            if (atual.valor === valor) {
                return true;
			}
            if (atual.proximo == null) {
                return false;
			} else {
                atual = atual.proximo;
			}
		}
        return false;
	
	}
	
	
	// Remove um valor, caso esteja na lista.
	this.remover = function(valor) {
		if (this.cabeca != null) {
			if (this.cabeca.valor === valor) {
				this.cabeca = this.cabeca.proximo;
			} else {
				var anterior = this.cabeca;
				var atual = this.cabeca.proximo;
				while (atual != null) {
					if (atual.valor === valor) {
						anterior.proximo = atual.proximo;
						atual = null;
						break;
					} else {
						anterior = atual;
						atual = atual.proximo;
					}
				}
			}
		}
	}
	
	
	this.toString = function() {
		var conteudo = "";
		var atual = this.cabeca;
	
		while (atual != null) {
            conteudo += atual.valor.toString();
            atual = atual.proximo
        }
        return conteudo;
	}
	
	
}


lista = new ListaEncadeada('A');
lista.inserir('J');
lista.inserir('F');
lista.inserir('B');
lista.inserir('W');


// Como fizemos a inserção no início da lista, ela fica de trás pra frente.
console.log(lista.toString());

lista.remover('A');
lista.remover('W');
console.log(lista.toString());

console.log("Achou A? " + lista.buscar('A').toString());
console.log("Achou F? " + lista.buscar('F').toString());
