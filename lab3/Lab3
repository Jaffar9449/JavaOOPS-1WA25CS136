abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated; // in kWh

    EnergySource(int sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void display() {
        System.out.println("Source ID       : " + sourceId);
        System.out.println("Source Name     : " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.printf("Efficiency      : %.2f%%%n", calculateEfficiency());
        System.out.println("-----------------------------");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    @Override
    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class Lab3 {
    public static void main(String[] args) {
        // Dynamic method dispatch: superclass reference, subclass objects
        EnergySource source;

        source = new SolarEnergy(1, "Solar Panel Farm", 4000);
        source.display();   // calls SolarEnergy.calculateEfficiency()

        source = new WindEnergy(2, "Wind Turbine Park", 6000);
        source.display();   // calls WindEnergy.calculateEfficiency()
    }
}
