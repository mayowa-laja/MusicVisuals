package ie.tudublin;

import example.CubeVisual;
import c20376476.MayowasVisual;
import c20499732.*;
import example.RotatingAudioBands;
import c20407614.EmmanuelVisual;


public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};

        processing.core.PApplet.runSketch( a, new ProviesVisual());		

	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}