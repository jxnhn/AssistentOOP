 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class agendaContatos implements Agenda{
	
	
	
	List<Contato> agenda = new ArrayList<Contato>();
	

	@Override
	public void addContato(String nome, int numero) {
		Contato contato = new Contato();
		
		contato.setNome(nome);
		contato.setNumero(numero);
		agenda.add(contato);		
		
	}

	@Override
	public void mandarMsg(String msg) {
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Para quem você quer mandar a mensagem?");
		while (agenda.get(i).getNome() == scanner.nextLine()) {
			System.out.println("Mensagem enviada para "+ scanner.nextLine());
		}
		i++;
		scanner.close();
	}

	@Override
	public void removerContato(String nome) {
		int i = 0;
		while (agenda.get(i).getNome() == nome) {
			agenda.remove(i);
		}
		i++;
	}

}
