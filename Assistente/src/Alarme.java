import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alarme implements Relogio {
	
	List<Horario> alarmes = new ArrayList<Horario>();

	@Override
	public void definirAlarme(int hora, int minuto) {
		Horario horario = new Horario();
		horario.setHora(hora);
		horario.setMin(minuto);
		alarmes.add(horario);
		System.out.println("Alarme marcado para "+horario.getHora()+":"+horario.getMin());
		
	}

	@Override
	public void Operacoes() {
		
		int j = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Voce tem "+alarmes.size()+" alarmes marcados para os seguintes horários:");
	
		for(int i = 0; i < alarmes.size(); i++) {
			if(alarmes.get(i) != null) {
				System.out.println(j+" -" + alarmes.get(i).getHora()+":"+alarmes.get(i).getMin());
				j++;
			}			
			
		}
		System.out.println("Deseja desmarcar algum, se sim, qual?");
		int resp = scan.nextInt();
		int index = resp - 1;
		alarmes.remove(index);
		System.out.println("Alarme desligado");
	
		
		
		{
				
			}
		}
	

	

	
}
