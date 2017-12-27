package forecast;

public class Forecast {

    public static void main (String args[]){
        ForecastService forecastService =new ForecastService(0,2,0.5,0.001,1);
        forecastService.doForeat();


    }
}
