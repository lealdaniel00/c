public class HolaMundo{
	public static void main(String args []){
		Persona	pepito = new Persona("hyjfhtdgrthyjhmgfhdg",20,10);
		pepito.dormir(15);
		Persona juanita = new Persona("juanita",40,50);
		juanita.dormir(50);
		juanita.dormir();
		System.out.println(juanita.caminar());
		System.out.println(juanita.caminar());
	}
}