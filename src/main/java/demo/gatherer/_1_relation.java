// https://java-facile.fr/nouveaute-java-25-api-gatherer/   les Streams augmentés :)
// imppémenter une fonction intermédiaire custom !
void main() {
    List<String> list = """
            foo
            bar
            baz
            whizz
            wéta
            """.lines().toList();  // lines découpe chaque ligne en string et retourne un stream de tout

    // pas besoin de faire un flatmap même si je génère des élements nouveaux en plus de ceux présents dans la liste
    IO.println(list.stream()
            .mapMulti((element, consumer) -> {
                consumer.accept("PREFIXE-" + element);
                consumer.accept(element);
                consumer.accept(element + "-SUFFIXE");
            })
            .toList());

    // fenetre
    List<List<String>> ListOfList = list.stream()
            .gather(Gatherers.windowFixed(2))
            .toList();
    IO.println(ListOfList);


    // filtre et mapping en même temps, stope dans la liste possible à tout moment
    Gatherer<String, Void, String> customTraitement = Gatherer.of(
            (_, element, downstreamm) -> {
                if (element.length() < 4 && element.contains("a")) {
                    downstreamm.push(element.toUpperCase());
                }
                return true; // false et c'est la fin...
            });

    IO.println(list.stream()
            .gather(customTraitement)
            .toList());
}
