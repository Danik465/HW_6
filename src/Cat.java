import java.util.Objects;

public class Cat extends Object {

    private String name;
    private final int appetite; // аппетит кота в условных единицах
    private int satiety; // Сколько скушал кот
    private double energy; // энергия кота от 0 до 10

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public double getEnergy() {

        return energy;
    }

    public void eat(Plate plate) {


        // TODO: 23.12.2022 Переделать логику так, чтобы кот ел сколько доступно и насыщался относительно съеденого.

        satiety = plate.decreaseFood(appetite);
        System.out.println("Сколько досталось коту "+ satiety);
        energy = (double) satiety*100/appetite;
        if(energy<= 30){
            System.out.println("Голодный");
        } else if (energy> 30 && energy<= 70) {
            System.out.println("Не достаточно сытой");
        }else {
            System.out.println("Кот сытой");
        }

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return appetite == cat.appetite && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, appetite);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Cat)) {
//            return false;
//        }
//
//        // obj instanceOf cat
//        Cat another = (Cat) obj;
//        return name.equals(another.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override
    public String toString() {
        return "Cat[" + name + "]";
    }
}
