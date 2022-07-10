
public class Brilho extends Config {
	
	private int brilho = 50;

	@Override
	public void aumentar(int level) {
		brilho += level;
		System.out.println("Aumentando brilho para: "+brilho);
		
	}

	@Override
	public void diminuir(int level) {
		brilho -= level;
		System.out.println("Diminuindo brilho para: "+brilho);
		
	}



}
