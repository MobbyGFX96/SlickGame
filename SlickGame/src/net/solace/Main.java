package net.solace;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {
	public static void main(String[] args) {
		try {
			AppGameContainer appgc = new AppGameContainer(new GameController());
			appgc.setDisplayMode(800, 600, false);
			appgc.start();
		} catch (SlickException exception) {
			
		}
	}
}
