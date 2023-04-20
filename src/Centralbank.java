abstract class Centralbank {
    abstract int interestRate();

}
class BOC extends Centralbank {
    @Override
    int interestRate() {
        return 5;
    }
}
class NDB extends Centralbank {
    @Override
    int interestRate() {
        return 10;
    }
}
class Run {
    public static void main(String[] args) {
        Centralbank cb;
        cb = new BOC();
        System.out.println("Rate of InterestRate is :- " + cb.interestRate() + "%");
        cb = new NDB();
        System.out.println("Rate of InterestRate is :- " + cb.interestRate() + "%");
    }
}