package ie.tudublin;

import c20376476.Menu;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Menu());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}