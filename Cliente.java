class Cliente{

	//Atributos
	private String nombre;
	private String telefono;
	private String direccion;
	private String correo;
	private float m2_propiedad;
	private float valor_propiedad;
	private float valor_venta;

	public Cliente(
		String nombre, String telefono, String direccion, String correo, 
		float m2_propiedad, float valor_propiedad,float valor_venta){

		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.m2_propiedad = m2_propiedad;
		this.valor_propiedad = valor_propiedad;
		this.valor_venta = valor_venta;
	}


	public String getNombre(){
		return this.nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getTelefono(){
		return this.telefono;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	public String getDireccion(){
		return this.direccion;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public String getCorreo(){
		return this.correo;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public float getM2Propiedad(){
		return this.m2_propiedad;
	}

	public void setM2Propiedad(float m2_propiedad){
		this.m2_propiedad = m2_propiedad;
	}

	public float getValorPropiedad(){
		return this.valor_propiedad;
	}

	public void setValorPropiedad(float valor_propiedad){
		this.valor_propiedad = valor_propiedad;
	}

	public float getValorVenta(){
		return this.valor_venta;
	}

	public void setValorVenta(float valor_venta){
		this.valor_venta = valor_venta;
	}

	@Override
	public String toString(){
		String salida = "------------------------------\n";
		salida += "Nombre: "+this.nombre + "\n";
		salida += "Telefono: "+this.telefono + "\n";
		salida += "Direccion: "+this.direccion + "\n";
		salida += "Correo: "+this.correo + "\n";
		salida += "M2 propiedad: "+this.m2_propiedad + "\n";
		salida += "Valor propiedad: "+this.valor_propiedad + "\n";
		salida += "Valor venta: "+this.valor_venta + "\n";
		salida += "\n------------------------------";
		return salida;
	}
}