package poimorfismo;

public class NotificacionEmail extends Notificacion {
	private String asunto;

	public NotificacionEmail(String destinatario, String contenido, String asunto) {
		super(destinatario, contenido);
		this.asunto = asunto;
	
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	@Override
	public void enviar() { 
		System.out.println("Enviando Email a"+ getDestinatario()+"con asunto"+asunto+"y contenido"+getContenido());
	
	
	}

}
