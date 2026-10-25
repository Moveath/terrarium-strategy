# Terrarium Strategy

Assignment 5 for Software Design Patterns.

## About

This Java console program uses the Strategy pattern to calculate how much water a terrarium needs.

The program has three watering strategies:

- `FixedWatering` returns 100 ml when soil moisture is below 60%.
- `MoistureBasedWatering` calculates the water needed to reach 60% moisture. In this simple model, 10 ml adds 1 percentage point.
- `EcoWatering` uses the same target but limits the water amount to 150 ml.

All three strategies return 0 ml when soil moisture is 60% or higher.

`WateringStrategy` declares the common method `calculateWaterAmount()`. `Terrarium` stores a strategy and passes the calculation to it. The strategy can be changed at runtime with `setWateringStrategy()`.

`Main` compares all three strategies using the same terrarium object and soil moisture of 30%. The results are 100 ml, 300 ml, and 150 ml.

## Clean Code

1. **Meaningful names:** `calculateWaterAmount()` and `setWateringStrategy()` explain what the methods do.
2. **Single responsibility:** each strategy handles one watering algorithm; `Main` selects the strategies and prints the results.
3. **Polymorphism:** `Terrarium` calls the strategy through the interface, without `if` or `switch` checks on its type.
4. **Algorithm independence:** `Terrarium` depends only on `WateringStrategy` and does not know how the water amount is calculated.
5. **Easy extensibility:** a new strategy can implement `WateringStrategy` and be passed to `setWateringStrategy()` without changing `Terrarium` or the existing strategies.

## How to run

Open a terminal in this folder and run with a Java JDK:

```sh
javac -d bin *.java
java -cp bin Main
```

Expected output:

```text
Soil moisture: 30%
Fixed watering: 100 ml
Moisture-based watering: 300 ml
Eco watering: 150 ml
```
