public class Articulo {

	private int numeroArticulo;
	private String descripcion;
	private float precio;
	
	
	public Articulo(int numeroArticulo, String descripcion, float precio) {
		super();
		this.numeroArticulo = numeroArticulo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getNumeroArticulo() {
		return numeroArticulo;
	}
	public void setNumeroArticulo(int numeroArticulo) {
		this.numeroArticulo = numeroArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
		
}
