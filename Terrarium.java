public final class Terrarium
{
    private WateringStrategy wateringStrategy;

    public Terrarium(WateringStrategy wateringStrategy)
    {
        setWateringStrategy(wateringStrategy);
    }

    public void setWateringStrategy(WateringStrategy wateringStrategy)
    {
        if (wateringStrategy == null)
        {
            throw new IllegalArgumentException("Watering strategy is required");
        }

        this.wateringStrategy = wateringStrategy;
    }

    public int calculateWaterAmount(int moistureLevel)
    {
        if (moistureLevel < 0 || moistureLevel > 100)
        {
            throw new IllegalArgumentException("Moisture must be between 0 and 100");
        }

        return wateringStrategy.calculateWaterAmount(moistureLevel);
    }
}
