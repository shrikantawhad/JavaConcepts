package This;

public class thisKeyword {
    String name;
    int contact;
    String city;

    thisKeyword(String name, int contact, String city) {
        this.name = name;
        this.contact = contact;
        this.city = city;
    }

    public static void main(String[] args) {
        var object = new thisKeyword("Justin", 98, "Canada");
        new thisKeyword("Ram", 97, "Pune").show();
        object.show();

    }

    public void show() {
        System.out.println("Name : " + name + "\n" + "Contact : " + contact + "\n" + "City : " + city + "\n");
    }
}
