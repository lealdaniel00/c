public class Persona{
	String nombre;
	int edad;
	int energia;
	Casa casaMia;
	// metodo constructor
	Persona(String nombre, int edad, int ener){
		this.nombre=nombre;
		this.edad=edad;
		energia=ener;
	}
	//Duerme, respira, camina, etc etc.
	public void dormir(int tiempo){
		System.out.println("LA persona "+nombre+" esta durmiendo");
		energia=energia+tiempo;
		System.out.println(energia);
	}

	public void dormir(){
		System.out.println("LA persona "+nombre+" esta durmiendo");
		System.out.println(energia);
	}

	// Los tipos de retorno pueden ser cualquier tipo de dato. String, int, boolean, void, etc.
	public int caminar(){

		System.out.println("LA persona esta caminando");
		energia=energia-10;
		return energia;
	}
}
