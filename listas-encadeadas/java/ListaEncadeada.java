/**
 * Implementa funcionalidades de uma lista encadeada simples.
 * @author Rita Menezes.
 * @param <G> Genérico.
 */
public class ListaEncadeada<G> {
	public No<G> cabeca; // Nó inicial.
	
	public ListaEncadeada() {}
	public ListaEncadeada(G valor) {
		this.cabeca = new No<G>(valor);
	}
	
	/**
	 * Insere um No no início da lista.
	 * @param valor Genérico.
	 */
	public void inserir(G valor) {
		No<G> no = new No<G>(valor);
		
		if (cabeca != null) {
			no.proximo = cabeca;
		}
		
		cabeca = no;
	}
	
	
	/**
	 * Busca por um valor qualquer.
	 * @param valor Genérico a ser buscado.
	 * @return boolean, true se pertencer à lista, false caso contrário. 
	 */
	public boolean buscar(G valor) {
		No<G> atual = cabeca;
		while (atual != null) {
			if (atual.valor.equals(valor)) {
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
	
	
	/**
	 * Remove um valor qualquer, caso esteja na lista.
	 * @param valor Genérico a ser removido. 
	 */
	public void remover(G valor) {
		if (cabeca != null) {
			if (cabeca.valor.equals(valor)) {
				cabeca = cabeca.proximo;
			} else {
				No<G> anterior = cabeca;
				No<G> atual = cabeca.proximo;
				while (atual != null) {
					if (atual.valor.equals(valor)) {
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
	
	
	@Override
	public String toString() {
		StringBuilder conteudo = new StringBuilder("");
		No<G> atual = cabeca;
		while (atual != null) {
			conteudo.append(atual.valor.toString());
			atual = atual.proximo;
		}
		return conteudo.toString();
	}
}
