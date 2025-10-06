package poimorfismo;

public abstract class Notificacion {
	private String destinatario;
	private String contenido;
	public Notificacion(String destinatario, String contenido) {
		this.setDestinatario(destinatario);
		this.setContenido(contenido);
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public abstract void enviar();
	

}
