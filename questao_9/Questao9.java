package br.com.rodrigo.s2it.questao9;

public class Questao9 {
	
	public void popularArvoreBinaria(BinaryTree binaryTree) {
		
		// Preenche o lado esquerdo da árvore
		BinaryTree no1Left = new BinaryTree(3);
		BinaryTree no1Left1Left = new BinaryTree(1);
		BinaryTree no1Left1Right = new BinaryTree(6);
		BinaryTree no1Left1Right1Left = new BinaryTree(4);
		BinaryTree no1Left1Right1Right = new BinaryTree(7);
		
		binaryTree.inserirNoLeft(no1Left);
		no1Left.inserirNoLeft(no1Left1Left);
		no1Left.inserirNoRight(no1Left1Right);
		no1Left1Right.inserirNoLeft(no1Left1Right1Left);
		no1Left1Right.inserirNoRight(no1Left1Right1Right);
		
		// Preenche o lado direito da árvore
		BinaryTree no1Right = new BinaryTree(10);
		BinaryTree no1Right1Right = new BinaryTree(14);
		BinaryTree no1Right1Right1Left = new BinaryTree(13);
		
		binaryTree.inserirNoRight(no1Right);
		no1Right.inserirNoRight(no1Right1Right);
		no1Right1Right.inserirNoLeft(no1Right1Right1Left);
	}
	
	public int somarNosSubsequentes(int noInicial, BinaryTree binaryTree, int soma) {
		if (binaryTree.getLeft() != null) {
			soma += binaryTree.getLeft().getValor();
			somarNosSubsequentes(noInicial, binaryTree.getLeft(), soma);
		}
		return soma;
	}
	
	public static void main(String[] args) {
		
		// Inicializa a árvore com nó raiz valendo 10 
		BinaryTree binaryTree = new BinaryTree(8);
		System.out.println(new Questao9().somarNosSubsequentes(10, binaryTree, 0));
		
	}
	
}
