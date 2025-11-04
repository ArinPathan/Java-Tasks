public class Main{
	public static void main(String[]args){
		Animal lion= new Lion();
		Animal elephant= new Elephant();
		Animal monkey = new Monkey();
		
		lion.makeSound();
		System.out.println("Animal: "+lion.type());
		
		elephant.makeSound();
		System.out.println("Animal: "+elephant.type());
		
		monkey.makeSound();
		System.out.println("Animal: "+monkey.type());
	}
}
		