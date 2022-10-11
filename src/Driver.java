abstract public class Driver <T extends Transport & Competing> {
    final private String name;
    final private Character typeOfLicence;
    private double experience;

    private T car;

    protected Driver(String name, Character typeOfLicence, double experience) {
        if (name == null || name.isEmpty()) {
            throw new NullPointerException("Укажите имя водителя");
        } else {
            this.name = name;
        }
        if (typeOfLicence != 'B' && typeOfLicence != 'C' && typeOfLicence != 'D') {
            throw new NullPointerException("Нет прав, иди в автошколу");
        } else {
            this.typeOfLicence = typeOfLicence;
        }
        if (car != null) {
            this.car = car;
        }
        setExperience(experience);
    }

    public void startMove() {
        System.out.println(name + "Заводит" + car.getBrand() + " " + car.getModel());
    }

    public void finishMove() {
        System.out.println(name + "Останавливает" + car.getBrand() + " " + car.getModel());
    }

    public void fillVehicle() {
        System.out.println(name + "Заправляет" + car.getBrand() + " " + car.getModel());
    }

    public Character getTypeOfLicence() {
        return typeOfLicence;
    }

    public double getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public void setExperience(double experience) {
        if (experience <= 0) {
            throw new NullPointerException("Иди учись");
        } else {
            this.experience = experience;
        }
    }
}