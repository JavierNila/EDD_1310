package fes;

public class Main {
    public static void main(String[] args) {
       TablaHash<String, String> hashTable = new TablaHash<>(4);
        hashTable.add("236", "Jose");
        hashTable.add("526", "A");
        hashTable.add("313", "B");
        hashTable.add("29", "C");

        System.out.println(hashTable.valueOf("236"));
        System.out.println(hashTable.valueOf("526"));
        System.out.println(hashTable.valueOf("313"));

        hashTable.remove("Perro");
        System.out.println(hashTable.valueOf("313"));

        hashTable.add("Perro", "Dog");
        System.out.println(hashTable.valueOf("313"));
    }
}