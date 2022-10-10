public abstract class Transport {

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engine;
    }

    private final String brand;
    private final String model;
    private final double engine;


    public Transport(String brand, String model, double engine) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Укажите бренд";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Укажите модель";
        } else {
            this.model = model;
        }
        if (engine < 0) {
            this.engine = 0;
            System.out.println("Укажите объем двигателя");
        } else {
            this.engine = engine;
        }
    }

    public abstract void start();

    public abstract void finish();

    public abstract void pitStop();

    public abstract void LapTime();

    public abstract void maxSpeed();
}
