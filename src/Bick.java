abstract class Bick {
abstract void ride();
}

class YamahaFZ extends Bick {
    @Override
    void ride() {
        System.out.println("Ride Safely!");
    }

    public static void main(String[] args) {
        Bick b = new YamahaFZ();
        b.ride();
    }
}