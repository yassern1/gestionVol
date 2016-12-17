
public class Principal {
	public Principal(){
		printMessage();
		firstExample();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Principal();
	}
	public void printMessage(){
		System.out.println("Hello world!!!!!");
	}
	
	public void firstExample(){
		Compagnie c1= new Compagnie("id1", "RAM");
		Compagnie c2= new Compagnie("id2", "RyanAir");
		System.out.println(c1+"\n"+c2);
	}
}
