import java.awt.*;

public class VehicleFactory {
    public static Volvo240 createVolvo240(){
        Volvo240 volvo240 = new Volvo240(2, Color.black,240,1600);
        volvo240.setCurrentDirection("east");
        volvo240.setY(300);
        return volvo240;
    }

    public static Saab95 createSaab95(){
        Saab95 saab95 = new Saab95(2,Color.black,300,1600);
        saab95.setCurrentDirection("east");
        saab95.setY(100);
        return saab95;
    }

    public static Scania createScania(){
        Scania scania= new Scania(2,Color.black,240,16000);
        scania.setCurrentDirection("east");
        scania.setY(500);
        return scania;
    }

}
