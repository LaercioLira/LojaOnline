package Loja;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Produto> produtos;
	
	public Carrinho() {
		this.produtos = new ArrayList<>();
	}
	
	public void adicionar(Produto p) {
		produtos.add(p);
		System.out.println("Produto "+p.getNome()+" foi adicionado no carrinho.");
		System.out.println("Ele custa R$ "+p.getPreco());
		System.out.println("-------------------------------");
	}
	
	public void remover(String nome) {
		int codigo =-1;
		for(int i=0; i<produtos.size();i++) {
			if(produtos.get(i).getNome().equals(nome)) {
				codigo = i;
				produtos.remove(i);
				break;
			}else {
				continue;
			}
		}
		
		if (codigo == -1) {
			System.out.println("O produto não foi encontrado!");
			System.out.println("-----------------------------");
			
		}else {
			System.out.println("O produto "+nome+" foi removido do carrinho!");
			System.out.println("--------------------------------------------");
		}
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	
	
}
