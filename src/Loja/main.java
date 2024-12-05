package Loja;

public class main {

	public static void main(String[] args) {
		Produto p1 = new Produto("Chaveiro", "Conveniência e acessórios",  15.90);
		Produto p2 = new Produto("Colar", "bijouteria, folheado ouro", 22.90);
		Produto p3 = new Produto("Bola de mão", "borracha, fisioterapia", 5.90);
		
		
		System.out.println("Loja Conveniência");
		System.out.println("-----------------");
		
		Carrinho c = new Carrinho();
		
		c.adicionar(p1);
		c.adicionar(p3);
		c.adicionar(p2);
		c.remover("Chaveiro");
		
		Vendas v = new Vendas(c);
		v.totalPreco();


	}

}
