public class Car {
    private String carName;
    private double carPriceYear1;
    private double carPriceYear2;
    private double carPriceYear3;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPriceYear1() {
        return carPriceYear1;
    }

    public void setCarPriceYear1(double carPriceYear1) {
        this.carPriceYear1 = carPriceYear1;
    }

    public double getCarPriceYear2() {
        return carPriceYear2;
    }

    public void setCarPriceYear2(double carPriceYear2) {
        this.carPriceYear2 = carPriceYear2;
    }

    public double getCarPriceYear3() {
        return carPriceYear3;
    }

    public void setCarPriceYear3(double carPriceYear3) {
        this.carPriceYear3 = carPriceYear3;
    }

    public void carPriceStatus() {
        if (carPriceYear1 > carPriceYear2 && carPriceYear1 > carPriceYear3) {
            System.out.println("The car " + carName + "at the first year" + " " + "is the most expensive car, costing $" + carPriceYear1);
        } else if (carPriceYear2 > carPriceYear1 && carPriceYear2 > carPriceYear3) {
            System.out.println("The car " + carName + "at the second year" + " " + "is the most expensive car, costing $" + carPriceYear2);
        } else if (carPriceYear3 > carPriceYear1 && carPriceYear3 > carPriceYear2) {
            System.out.println("The car " + carName + "at the third year" + " " + "is the most expensive car, costing $" + carPriceYear3);
        }
    }
}
