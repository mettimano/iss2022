package it.unibo.radarSystem22.domain.concrete;

import java.io.IOException;

import it.unibo.radarSystem22.domain.interfaces.ILed;
import it.unibo.radarSystem22.domain.models.LedModel;

public class LedConcrete extends LedModel implements ILed {
	private Runtime rt=Runtime.getRuntime(); // it gives a way to access to the os
	
	@Override
	protected void ledActivate(boolean val) {
		try {
			
			if(val) rt.exec("sudo bash led25GpioTurnOn.sh");
			else 	rt.exec("sudo bash led25GpioTurnOff.sh");
				
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
