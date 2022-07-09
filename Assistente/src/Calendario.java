import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calendario implements MarcadordeEventos{
	
	List<Evento> eventos = new ArrayList<Evento>();
	
	@Override
	public void MarcarEvento(String nome) {
		Evento evento = new Evento();
		evento.setNome(nome);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ano");
		evento.setAno(scanner.nextInt());
		System.out.println("Digite o mês");
		evento.setMes(scanner.nextInt());
		System.out.println("Digite o dia");
		evento.setDia(scanner.nextInt());
		scanner.close();
		
		eventos.add(evento);
		System.out.println("O evento "+ nome+" foi marcado para o dia " +evento.getDia()+"/"+evento.getMes()+"/"+evento.getAno());
}
	@Override
	public void desmarcarEvento(String nome) {
		for(int i = 0; i < eventos.size(); i++) {
			if(eventos.get(i).getNome() != null) {
				if(eventos.get(i).getNome() == nome) {
					eventos.remove(i);
					System.out.println("Evento desmarcado.");
				}
			}
		}
		
		
	}
	@Override
	public void mostrarEventos() {
		System.out.println("Eventos marcados: ");
		for(int i = 0; i < eventos.size(); i++) {		
			System.out.println(eventos.get(i).getNome());
		}
	}
	
	
	
	
}
