public class LandAnimal extends Animal {
    @Override
    String move() {
        return "swings on trees";
    }

    public static void main(String[] args) {
        LandAnimal lion = new LandAnimal();
        LandAnimal monkey = new LandAnimal();
        lion.name =  "simba";
        System.out.println(lion.name);
        System.out.println(monkey.move());
    }
    
}