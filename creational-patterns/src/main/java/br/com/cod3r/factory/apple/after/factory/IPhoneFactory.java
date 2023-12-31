package br.com.cod3r.factory.apple.after.factory;

import br.com.cod3r.factory.apple.after.model.IPhone;

public abstract class IPhoneFactory {

   public IPhone createIPhone() {
    IPhone device = null;
    device = createIPhone();
    device.getHardware();
    device.assemble();
    device.certificates();
    device.pack();
    return device;
   }

 
	
}
