package poimorfismo;

public class NotificacionSMS extends Notificacion {
	private int numero_remitente;

	public NotificacionSMS(String destinatario, String contenido, int numero_remitente) {
		super(destinatario, contenido);
		this.setNumero_remitente(numero_remitente);
	}

	public int getNumero_remitente() {
		return numero_remitente;
	}

	public void setNumero_remitente(int numero_remitente) {
		this.numero_remitente = numero_remitente;
	}
	
	@Override
	public void enviar() {
		System.out.println("Enviando SMS a"+ getDestinatario()+"desde"+numero_remitente+"y contenido"+getContenido());
		
		
		
	}

}
