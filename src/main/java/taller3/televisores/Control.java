package taller3.televisores;

public class Control {
	
	private TV tv;
	
	public void enlazar(TV tv) {
    	this.tv = tv;
    	tv.setControl(this);
    	
    }
	
	public void setCanal(int canal) {
		 if(tv.estado==true && this.tv.canal <=120) {
		 tv.setCanal(canal); 
		 }	 
	 }
	
	public TV getTv() {
		return tv;
	}
	
	public void canalUp() {
		if(tv.estado == true && tv.canal<120) {
			tv.setCanal(tv.canal++);
		}
		
	}
    public void canalDown() {
        if(tv.estado == true && tv.canal>1) {
        	tv.setCanal(tv.canal--);
		}
	}
    public void volumenUp() {
           if(tv.estado == true && tv.volumen<7) {
        	   tv.setVolumen(tv.volumen++);
		}
	}
    public void volumenDown() {
    	if(tv.estado == true && tv.volumen>0) {
    		tv.setVolumen(tv.volumen--);
 		}
	}
    
    public void turnOn() {
		tv.estado = true;
	}
     public void turnOff() {
    	 tv.estado = false;
	}
}