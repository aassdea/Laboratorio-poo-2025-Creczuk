package poimorfismo;

public class NotificacionPush extends Notificacion {
	private int prioridad;
	
	
	public NotificacionPush(String destinatario, String contenido, int prioridad) {
		super(destinatario, contenido);
		this.prioridad = prioridad;
	}

	




	public int getPrioridad() {
		return prioridad;
	}



	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	

	@Override
	public void enviar() {
		System.out.println("Enviando notipush a"+ getDestinatario()+"con prioridad"+prioridad+"y contenido"+getContenido());
		
	}

}
