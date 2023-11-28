import java.io.*;

public class AnimalSerialization {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Dog", 3, true);
        Animal animal2 = new Animal("Cat", 2, true);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals.dat"))) {
            // Серіалізуємо та записуємо об'єкти в файл
            oos.writeObject(animal1);
            oos.writeObject(animal2);

            System.out.println("Objects have been serialized and written to animals.dat.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
