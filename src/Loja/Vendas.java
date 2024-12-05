package Loja;

import java.util.ArrayList;

public class Vendas {
	Carrinho carrinho;
	
	public Vendas(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	public void totalPreco() {
		ArrayList<Produto> p = carrinho.getProdutos();
		double total = 0;
		
		
		for(int i=0; i<p.size();i++) {
			total+=p.get(i).getPreco();
		}
		
		System.out.printf("O total da compra foi R$: %.2f %n",total);
	}
	
}
