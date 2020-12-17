import java.awt.*;

public class VehicleApplication {

    public static void main(String[] args) {


        CarView carvi = new CarView("frame");
        CarModel carmod = new CarModel(carvi.getWidth(),carvi.getHeight());
        SpeedViewer spedvi = new SpeedViewer("speedframe");
        CarController cc = new CarController(carvi, carmod,spedvi);
        MoveLogger moveLogger = new MoveLogger();
        carmod.addPossitionObserver(moveLogger);
        carmod.addPossitionObserver(carvi);
        carmod.addSpeedObserver(spedvi);

        carvi.drawPanel.receiveCars(carmod.getCars());
        

       // spedvi.createTextFields();

        //här slutade vi
       // carvi.drawPanel.paintComponent(carvi.getGraphics(), volvo240);
        //carvi.drawPanel.paintComponent(carvi.getGraphics(), scanis);
            // försökte alltså få en paintComponent som tar en Car som inparameter.
        cc.startTimer();

    }
}
