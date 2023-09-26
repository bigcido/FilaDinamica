package view;
import model.Fila;
import controller.OperacaoController;
import model.Clientes;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random random = new Random();
		Fila<Clientes> fila = new Fila<>();
		int qtdPecas;
		float vlrPecas;
		
		for (int i = 1; i<=20; i++) {
			String nome = "Cliente" +i;
			qtdPecas = random.nextInt(51) + 20;
			vlrPecas = random.nextFloat() *95 + 5;
			Clientes cli = new Clientes(nome, qtdPecas, vlrPecas);
			fila.insert(cli);
		}
		OperacaoController op = new OperacaoController();
		op.caixa(fila);
				
		}
		

}


