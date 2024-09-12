package chp08;

class Hero {
    private String name;
    private int power;
    private int speed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Hero(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power='" + power +
                ", speed='" + speed +
                "}";
    }
}