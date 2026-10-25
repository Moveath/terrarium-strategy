public class Main
{
    public static void main(String[] args)
    {
        int moistureLevel = 30;
        Terrarium terrarium = new Terrarium(new FixedWatering());

        System.out.println("Soil moisture: " + moistureLevel + "%");
        System.out.println("Fixed watering: " + terrarium.calculateWaterAmount(moistureLevel) + " ml");

        terrarium.setWateringStrategy(new MoistureBasedWatering());
        System.out.println("Moisture-based watering: " + terrarium.calculateWaterAmount(moistureLevel) + " ml");

        terrarium.setWateringStrategy(new EcoWatering());
        System.out.println("Eco watering: " + terrarium.calculateWaterAmount(moistureLevel) + " ml");
    }
}
