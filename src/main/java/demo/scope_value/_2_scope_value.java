/**
 * un mécanisme introduit à partir de Java 20 (en incubation) et finalisé avec Java 25,
 * qui permet de partager des données immuables à l’intérieur d’un même thread ou entre plusieurs threads enfants,
 * de manière sûre, performante et sans fuite mémoire
 */

void m(int value) {
    var message = MESSAGE.get();
    IO.println(message + " " + value);
}

static final ScopedValue<String> MESSAGE = ScopedValue.newInstance();

void main() {
    ScopedValue
            .where(MESSAGE, "hello")
            .run(() -> m(42));
}
