package parcial2;

public class Venta {

	 private int id;
	 private String cafe;
	 private int cantidad;
	 private String tarjetasocio;
	 private double preciotot;
	public Venta(int id, String cafe, int cantidad, String tarjetasocio, double preciotot) {
		super();
		this.id = id;
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.tarjetasocio = tarjetasocio;
		this.preciotot = preciotot;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCafe() {
		return cafe;
	}
	public void setCafe(String cafe) {
		this.cafe = cafe;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTarjetasocio() {
		return tarjetasocio;
	}
	public void setTarjetasocio(String tarjetasocio) {
		this.tarjetasocio = tarjetasocio;
	}
	public double getPreciotot() {
		return preciotot;
	}
	public void setPreciotot(double preciotot) {
		this.preciotot = preciotot;
	}
	@Override
	public String toString() {
		return "Venta [id=" + id + ", cafe=" + cafe + ", cantidad=" + cantidad + ", tarjetasocio=" + tarjetasocio
				+ ", preciotot=" + preciotot + "]";
	}

}
