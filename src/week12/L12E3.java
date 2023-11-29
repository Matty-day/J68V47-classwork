package week12;

public class L12E3 {
    public static void displaycar(car thiscar) {
        System.out.format("%s %s %d %s %d %s %d %s ", thiscar.Make, thiscar.Model, thiscar.year, thiscar.vin, thiscar.price, thiscar.colour, thiscar.milage, thiscar.condition);
    }


    public static void main(String[] args) {
        car car1 = new car();
        displaycar(car1);

        car1.Make="Ferrari";
        car1.Model="812 superfast";
        car1.year=2018;
        car1.vin="3SEF6354FSEH";
        car1.price=239900;
        car1.colour="Red";
        car1.milage=5400;
        car1.condition="verygood";
        displaycar(car1);

    }
}


