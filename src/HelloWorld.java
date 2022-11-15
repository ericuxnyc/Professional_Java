import model.Address;
import model.Dog;
import model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HelloWorld {

    List<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.println("Hello world!, nice to meet you!");


        Person tom = new Person("Tom", "Smith", LocalDate.of(1990, 1, 1));
        Person jane = new Person("Jane", "Smith", LocalDate.of(1990, 1, 1));

        tom.setSpouse(jane);
        Dog fido = new Dog("Fido", LocalDate.of(2010, 1, 1));
        fido.speak();
        tom.setPet(fido);
        System.out.println(tom.getPet().speak());

    }
}