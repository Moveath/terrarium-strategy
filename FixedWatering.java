public class FixedWatering implements WateringStrategy
{
    private static final int WATER_AMOUNT_ML = 100;
    private static final int MOISTURE_LIMIT = 60;

    @Override
    public int calculateWaterAmount(int moistureLevel)
    {
        if (moistureLevel >= MOISTURE_LIMIT)
        {
            return 0;
        }

        return WATER_AMOUNT_ML;
    }
}
