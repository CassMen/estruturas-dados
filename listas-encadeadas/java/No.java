/**
 * Nó para uma lista encadeada simples.
 * @author Rita Menezes.
 * @param <G> Genérico.
 */
public class No<G> {
	public G valor;
	public No<G> proximo;
	
	public No(G valor) {
		this.valor = valor;
	}
}
