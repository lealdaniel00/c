public class Perro extends SerVivo implements Trabajar{
	Perro(){
		super(0,"pepito");
	}
	public void ganarDinero(){
		System.out.println("SOy una mascota y estoy trabajando");
	}
}