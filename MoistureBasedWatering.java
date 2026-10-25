public class MoistureBasedWatering implements WateringStrategy
{
    private static final int TARGET_MOISTURE = 60;
    private static final int WATER_PER_PERCENT_ML = 10;

    @Override
    public int calculateWaterAmount(int moistureLevel)
    {
        return Math.max(0, TARGET_MOISTURE - moistureLevel) * WATER_PER_PERCENT_ML;
    }
}
