public class EcoWatering implements WateringStrategy
{
    private static final int TARGET_MOISTURE = 60;
    private static final int WATER_PER_PERCENT_ML = 10;
    private static final int MAX_WATER_AMOUNT_ML = 150;

    @Override
    public int calculateWaterAmount(int moistureLevel)
    {
        int amountMl = Math.max(0, TARGET_MOISTURE - moistureLevel) * WATER_PER_PERCENT_ML;

        return Math.min(amountMl, MAX_WATER_AMOUNT_ML);
    }
}
