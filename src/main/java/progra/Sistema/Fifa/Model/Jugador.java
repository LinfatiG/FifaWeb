package progra.Sistema.Fifa.Model;

public class Jugador {

	private String fotografia;
	private String nombre;
	private String nacionalidad;
	private int rating;
	private int edad;
	private String club;
	private int potencial;
	private int velocidad;
	private int controlBalon;
	private int agilidad;
	private int resistencia;

	public Jugador() {
	}

	@Override
	public String toString() {
		return "Nombre: "+nombre+" Fotografía: "+fotografia+" Edad: "+edad+" Nacionalidad: "+nacionalidad+" Club:"+club;
	}

	public String getFotografia() {
		return this.fotografia;
	}

	/**
	 * 
	 * @param fotografia
	 */
	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	/**
	 * 
	 * @param nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getRating() {
		return this.rating;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getClub() {
		return this.club;
	}

	/**
	 * 
	 * @param club
	 */
	public void setClub(String club) {
		this.club = club;
	}

	public int getPotencial() {
		return this.potencial;
	}

	/**
	 * 
	 * @param potencial
	 */
	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getControlBalon() {
		return this.controlBalon;
	}

	/**
	 * 
	 * @param controlBalon
	 */
	public void setControlBalon(int controlBalon) {
		this.controlBalon = controlBalon;
	}

	public int getAgilidad() {
		return this.agilidad;
	}

	/**
	 * 
	 * @param agilidad
	 */
	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	public int getResistencia() {
		return this.resistencia;
	}

	/**
	 * 
	 * @param resistencia
	 */
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

}