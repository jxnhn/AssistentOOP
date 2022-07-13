 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agendaContatos implements Agenda{
	
	Scanner escaner = new Scanner(System.in);
	
	
	List<Contato> agenda = new ArrayList<Contato>();
	

	@Override
	public void addContato(String nome, int numero) {
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setNumero(numero);
		agenda.add(contato);
		System.out.println("contato adicionado.");
		
		
	}

	@Override
	public void mandarMsg(String msg, String nome) {
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome() != null) {
				if(agenda.get(i).getNome() == nome) {
					System.out.println("a seguinte mensagem foi enviada para "+nome+": "+ msg);
				}
				else {
					System.out.println("contato nao encontrado");
				}
			}
		}
		}		
	
	


	@Override
	public void removerContato(String nome) {
		for(int i = 0; i < agenda.size(); i++) {
			if(agenda.get(i).getNome() != null) {
				if(agenda.get(i).getNome() == nome) {
					agenda.remove(i);
					System.out.println("contato excluído");
				}

}
		}
	}
	}
