public class Plate {

    private int currentFood; // количество еды, которое есть на текущий момент в тарелке
    private int startCurrentFood = currentFood;
    public Plate(int currentFood) {
        this.currentFood = currentFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public  int decreaseFood(int foodCount) { // метод забора еды из тарелки

        if (currentFood >= foodCount) {
            currentFood -= foodCount;
            return foodCount;
        } else if (currentFood< foodCount && startCurrentFood!= currentFood) {
            foodCount = currentFood;
            currentFood = 0;
            return foodCount;
        }
        System.out.println("Столько еды нет в тарелке");
        return 0;
    }

}
