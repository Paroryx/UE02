public class Planes {
    public static void main(String[] args) {
        double altitude, takeoffLength, flightLength, landingLength, averageSpeed;
        //input
        Out.print("Please enter flight altitude (km) >");
        altitude = In.readDouble();
        Out.print("Please enter takeoff length (km) >");
        takeoffLength = In.readDouble();
        Out.print("Please enter flight length (km) >");
        flightLength = In.readDouble();
        Out.print("Please enter landing length (km) >");
        landingLength = In.readDouble();
        Out.print("Please enter average speed (km/h) >");
        averageSpeed = In.readDouble();

        //calculations
        float ascentDistance = (float) Math.sqrt( (takeoffLength*takeoffLength) + (altitude*altitude) );
        float descentDistance = (float) Math.sqrt( (landingLength*landingLength) + (altitude*altitude) );
        float totalDistance = (float) (ascentDistance+flightLength+descentDistance);
        float totalFuelConsumption = (float) (ascentDistance*32.5 + flightLength*17.5 + descentDistance*4.5);
        float flightDurationH = (float) (totalDistance/averageSpeed);
        int flightDurationM = (int) (totalDistance/(averageSpeed/60));

        double halfTakeoffLength = takeoffLength*0.5;
        double halfLandingLength = landingLength*0.5;
        float newAscentDistance = (float) Math.sqrt( (halfTakeoffLength*halfTakeoffLength) + (altitude*altitude) );
        float newDescentDistance = (float) Math.sqrt( (halfLandingLength*halfLandingLength) + (altitude*altitude) );
        double newTotalDistance = newAscentDistance + halfTakeoffLength + flightLength + halfLandingLength + newDescentDistance;
        double lengthDistanceDifference = newTotalDistance-totalDistance;

        //output
        String temp = "Ascent distance: %.2f km\nDescent distance: %.2f km\nTotal distance: %.2f km\nTotal fuel consumption: %.2f liters\nFlight duration: %.2f hours (%d minutes)\nExtended distance with halved takeoff and landing length: %.2f km";
        String formatted = String.format(temp,ascentDistance,descentDistance,totalDistance,totalFuelConsumption,flightDurationH,flightDurationM,lengthDistanceDifference);
        Out.println(formatted);
    }
}