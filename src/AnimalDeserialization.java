import java.io.*;

public class AnimalDeserialization {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animals.dat"))) {
            Animal animal1 = (Animal) ois.readObject();
            Animal animal2 = (Animal) ois.readObject();

            System.out.println("Deserialized Animal 1: " + animal1);
            System.out.println("Deserialized Animal 2: " + animal2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
