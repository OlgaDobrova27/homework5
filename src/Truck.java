public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engine) {
        super(brand, model, engine);
    }
    public void start() {System.out.println("Запрыгнуть в кабину и завести машину");}

    public void finish() { System.out.println("Выключить двигатель и выйти");

    }
    public String toString() { return "Грузовик:" + super.toString();}

    public void pitStop(){
        System.out.println("Заехать в боксы");
        System.out.println("Заправить грузовик и сменить резину");
    }
    public void LapTime() {
        System.out.println("Лучшая скорость круга у грузовика");}

        public void maxSpeed() {
            System.out.println("Максимальная скорость у грузовика");}
        }