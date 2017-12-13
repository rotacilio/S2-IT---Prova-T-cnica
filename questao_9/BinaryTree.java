package br.com.rodrigo.s2it.questao9;

public class BinaryTree {

	private int valor;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int valor) {
		super();
		this.valor = valor;
	}

	public void inserirNoRight(BinaryTree right) {
		this.right = right;
	}
	
	public void inserirNoLeft(BinaryTree left) {
		this.left = left;
	}

	public int getValor() {
		return valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public BinaryTree getRight() {
		return right;
	}
}
