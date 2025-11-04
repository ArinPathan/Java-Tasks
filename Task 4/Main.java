public class Main {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight();
        SmartDevice thermostat = new SmartThermostat();

        light.turnOn();
        System.out.println(light.getStatus());

        thermostat.turnOn();
        System.out.println(thermostat.getStatus());

        light.turnOff();
        System.out.println(light.getStatus());
    }
}