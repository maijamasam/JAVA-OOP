public class Main {
    public static void main(String[] args) {
        Person student = new Person("bingham", "Ronnie", "012345678", "bhu/222/04/07/0023");
        Person staff = new Person("bingham", "Dr Ann", "123456789", 10);
        Physics calc = new Physics();
        System.out.println(calc.calcVel(100, 60));
        System.out.println(calc.calcVel(88, 45, 50));
    }
}