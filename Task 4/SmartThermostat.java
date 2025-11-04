public class SmartThermostat extends SmartDevice{
	private boolean isOn=false;
	public void turnOn(){
	isOn=true;
	System.out.println("Smart Light is turned on.");}
	
	public void turnOff(){
		isOn=false;
	System.out.println("Smart light is turned off");}
		
	public String getStatus(){
		if (isOn) {
    return "SmartThermostat is ON";
} else {
    return "SmartThermostat is OFF";
}
	}
	}