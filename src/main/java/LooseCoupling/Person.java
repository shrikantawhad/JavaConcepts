package LooseCoupling;

public class Person {
    public static void main(String[] args) {
        Transport transport1 = new Bus();
        Transport transport2 = new Train();

        ITravel itravel = new Travel(transport2);
        itravel.Start();
    }
}
