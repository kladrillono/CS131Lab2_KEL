
public class Application {

	public static void main(String[] args) {
		
		Wizard harry = new Wizard("Harry Potter", 100, 0, false);
		
		harry.setKey(10);
		System.out.println(harry.toString());//test for setKey
		
		harry.unlock(10);
		System.out.println(harry.toString());//test code for unlock
		
		harry.takeDamage(10);
		System.out.println(harry.toString());//test code for takeDamage while unlocked
		
		harry.lock(10);
		System.out.println(harry.toString());//test code for lock method
		
		harry.takeDamage(20);
		System.out.println(harry.toString());// test code for takeDamage while locked
		
		System.out.println(harry.isLocked());//test code for isLocked
		
		System.out.println(harry.getName());//test code for getName
		
		System.out.println(harry.getHealth());//test code for getHealth
		
		
	}// end main

}// end class
