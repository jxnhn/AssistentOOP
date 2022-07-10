
public class Som extends Config {
	
	private int som = 0;
	
	@Override
	public void aumentar(int level) {
		som += level;
		System.out.println("Aumentando o Som para " + som);
		
	}

	@Override
	public void diminuir(int level) {
		som -= level;
		System.out.println("Diminuindo o som para " +som);
	}
		
		
	}
	
	
