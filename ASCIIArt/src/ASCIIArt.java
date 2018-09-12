/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)



public class ASCIIArt {
	public static void speech ()
	{
	 System.out.println("");
	 System.out.println("");
	 System.out.println("                            (I am not saying I am batman,         )");
	 System.out.println("                            (I'm just saying no one has ever seen )");
	 System.out.println("                            (me and batman in a room together.    )");
}
	public static void head ()
	 {
		 System.out.println("         /\\_______/\\      o");
		 System.out.println("        /   _    _  \\    o");
		 System.out.println("       /  /  \\  /  \\ \\ o");
		 System.out.println("       |  |___\\/___| |");
		 System.out.println("       |  \\  --   /  |");
		 System.out.println("       \\__|___,,__|__/");
	 }
	public static void torso ()
	{ 
		System.out.println("      /----/   \\-----\\");
		System.out.println("     /   /        \\   \\");
		System.out.println("     |  /|  \\^^/  |\\  |");
		System.out.println("     |OO|__________|OO|");
		System.out.println("     |  |-----^----|  |");
	}
	public static void legs ()
	{
		System.out.println("     |   /  / \\  \\    |");
		System.out.println("     |  /  /   \\  \\   |");
		System.out.println("     |_OOOO_____OOOO__| ");
	}
	public static void quote ()
	{
		System.out.println("");
		System.out.println("Always be yourself, unless you can be Batman.");
		System.out.println("        Then always be batman.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		speech ();
		head ();
		torso ();
		legs ();
		quote ();
	}

}
