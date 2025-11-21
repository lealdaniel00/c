public class SerVivo{
	String nombre;
	int edad;
	SerVivo(int edad, String nombre){
		this.edad=edad;
		this.nombre=nombre;
	}
	public void respirar(){
		System.out.println("Estoy respirando");
	}
	public void envejecer(int valor){
		edad=edad+valor;
	}

}