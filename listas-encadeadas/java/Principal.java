/**
 * Interface com o usuário, mostra as implementações.
 * @author Rita Menezes.
 */
public class Principal {
	public static void main(String[] args) {
		ListaEncadeada<Character> lista = 
				new ListaEncadeada<Character>('A');
		lista.inserir('J');
		lista.inserir('F');
		lista.inserir('B');
		lista.inserir('W');
		
		// Como fizemos a inserção no início da lista, ela fica de trás pra frente.
		System.out.println(lista);
		
		lista.remover('A');
		lista.remover('W');
		System.out.println(lista);
		
		System.out.println("Achou A? " + lista.buscar('A'));
		System.out.println("Achou F? " + lista.buscar('F'));
	}

}
