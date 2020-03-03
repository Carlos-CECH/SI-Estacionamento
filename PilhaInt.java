package pilha_sequencial_inteiros;

public class PilhaInt {

	public final int N = 6;

	int dados[] = new int[N];
	int topo;
	int decimal;
	
	
	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo == N) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int elem) {
		if (!isFull()) {
			dados[topo] = elem;
			topo++;
		} else {
			System.err.println("stack overflow");
		}
		decimal = decimal / 2;
	}

	public boolean isEmpty() {
		if (topo == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static class RetornoInt {
		int elem;
		boolean sucesso;
		int decimal;
	}

	public RetornoInt pop() {
		RetornoInt saida = new RetornoInt();
		
		if (!isEmpty()) {
			topo--;
			saida.elem = dados[topo];
			saida.sucesso = true;
		} else {
			System.err.println("Stack is empty!!!");
			saida.sucesso = false;
		}
		
		return saida;
		
	}
}
