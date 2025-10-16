/**
 * Flexible Constructor Bodies (corps de constructeur flexibles), spécifiés dans le JEP 513.
 * Avant Java 25, la règle imposait que l'appel à super() (ou this()) soit la toute première instruction dans un constructeur,
 * ce qui empêchait d'exécuter du code préalable comme des validations ou des initialisations avant d'appeler le constructeur de la superclasse.
 * Quand on veut faire des tests avant d'initialiser l'objet avant de gacher de la mémoire...
 * Le compilateur ajoute automatiquement un appel implicite à super() du constructeur de Object. Vous n'avez pas besoin de l'écrire vous-même
 */

static final class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
//    super();
        Objects.requireNonNull(name);
        if (age < 0) {
            throw new IllegalArgumentException("age < 0");
        }
        IO.println("this -> " + this);
        // super();
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person p && this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "age=" + age + ']';
    }

}

void main() {
    var set = Set.of(
            new Person("Jane", 42),
            new Person("Bob", 24),
            new Person("Janice", 36));

    IO.println(set);
}
