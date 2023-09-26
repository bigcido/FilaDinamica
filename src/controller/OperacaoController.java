package controller;
import model.Fila;
import model.Clientes;
import view.Principal;

public class OperacaoController {

	public OperacaoController() {
		super();
	}

	Clientes cliente;

	public void caixa(Fila<Clientes> file) {
		float valor = 0; 
		int tamanho = file.size();
		
		for (int i = 0; i <= tamanho; i++) {
			try {
				cliente = file.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			valor = cliente.vlrPecas*cliente.qtdPecas;
			System.out.println("Cliente: "  +cliente.nome+ " Valor da compra: " +valor);
		}
		
	}
}
