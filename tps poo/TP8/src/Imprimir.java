package threads;

public class Imprimir implements Runnable {
	Thread t;
	String NombrePais;
	
	public Imprimir(String NombrePais){ 
		this.NombrePais = NombrePais;
		t = new Thread(this,"Hilo");
		t.start();
		
	};
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " "+ NombrePais);
			try {
				Thread.sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("HECHO! " + NombrePais);
		}


}
