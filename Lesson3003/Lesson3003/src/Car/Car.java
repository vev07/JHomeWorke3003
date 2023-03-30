package Car;

public class Car {

    private String name;
    private int age;
    private double cost;
    private boolean isEcolgical;

    public Car(String name, int age, double cost, boolean isEcolgical) {
        this.name = name;
        this.age = age;
        this.cost = cost;
        this.isEcolgical = isEcolgical;
    }
    public Car(String name, int age, double cost) {
        this.name = name;
        this.age = age;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public boolean isEcolgical() {
        return isEcolgical;
    }

    public void setEcolgical(boolean ecolgical) {
        isEcolgical = ecolgical;
    }

    public void print() {
        System.out.println("Name - " + name + ", born - " + age + ", cost - " + cost
                + "it is ecological" + isEcolgical);
    }
    public void print2() {
        System.out.println("Name - " + name + ", born - " + age + ", cost - " + cost);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW",2022, 35000, true);
        Car car2 = new Car("AMG", 2023, 86500);

        car.print();
        car2.print2();
        car.setAge(1999);
        car.print();
        System.out.println(car2.getCost());
        double carSum = car.cost + car2.cost;
        System.out.println("It is all cost two cars - " + carSum);


    }
}
