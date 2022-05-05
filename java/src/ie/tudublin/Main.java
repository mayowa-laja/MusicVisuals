package ie.tudublin;

import example.CubeVisual;
import c20376476.Menu;
import example.RotatingAudioBands;

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