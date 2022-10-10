public class MotorCars extends Transport implements Competing{

    public MotorCars(String brand, String model, double engine) {
        super(brand, model, engine);
    }
        @Override
        public void start () {
            System.out.println("Вставить ключ в замок зажигания");
        }
        @Override
        public void finish () {
            System.out.println("Выключить зажигание и выйти");
        }
        @Override
        public String toString () {
            return "Машина: " + super.toString();
        }
        @Override
        public void pitStop () {
            System.out.println("Заехать в бокс");
            System.out.println("Заправить машину");
        }
        @Override
        public void LapTime () {
            System.out.println("Лучшая скорость машины");
        }

        @Override
        public void maxSpeed () {
            System.out.println("Максимальная скорость у машины");
        }
    }
