package practice.vehicle;

public class Car {
    private String carModelName;
    private double carPriceYear1;
    private double carPriceYear2;
    private double carPriceYear3;

   public void setCarModelName(String carModelName){
       this.carModelName = carModelName;
   }

   public void setCarPrices(double carPriceYear1, double carPriceYear2, double carPriceYear3){
       this.carPriceYear1 = carPriceYear1;
       this.carPriceYear2 = carPriceYear2;
       this.carPriceYear3 = carPriceYear3;
   }

    private double calculateGreatestPrice(){
        return carPriceComparison(carPriceYear1, carPriceYear2, carPriceYear3, carPriceYear1 > carPriceYear2, carPriceYear1 > carPriceYear3, carPriceYear2 > carPriceYear1, carPriceYear2 > carPriceYear3);
    }

    private double carPriceComparison(double carPriceYear1, double carPriceYear2, double carPriceYear3, boolean b, boolean b2, boolean b3, boolean b4) {
        double greatestPrice = carPriceYear1;
        if(b && b2){
            greatestPrice = carPriceYear1;
        }else if(b3 && b4){
            greatestPrice = carPriceYear2;
        }else{
            greatestPrice = carPriceYear3;
        }
        return greatestPrice;
    }

    private double calculateLeastPrice(){
        double leastPrice = carPriceYear1;
         leastPrice =carPriceComparison(carPriceYear1, carPriceYear2, carPriceYear3, carPriceYear1 < carPriceYear2, carPriceYear1 < carPriceYear3, carPriceYear2 < carPriceYear1, carPriceYear2 < carPriceYear3);
         return leastPrice;
    }

    public void showCarDetails(){
        System.out.println("Car Model Name: " + carModelName);
        System.out.println("Car Price Year 1: " + carPriceYear1);
        System.out.println("Car Price Year 2: " + carPriceYear2);
        System.out.println("Car Price Year 3: " + carPriceYear3);
        System.out.println("Greatest Price: " + calculateGreatestPrice());
        System.out.println("Least Price: " + calculateLeastPrice());
    }
}
