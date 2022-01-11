package previewSwitchObjects;

public class PreviewSwitch {
    // forma utilizando o padrão de correspondencia
    // padrões de tipo ao operador instanceof
    public static String test(Object obj) {

        return switch(obj) {

            case Integer i -> "An integer";

            case String s -> "A string";

            case Cat c -> "A Cat";

            default -> "I don't know what it is";

        };

    }

    public static void main(String[] args) {

        Cat cat = new Cat("Tom");

        System.out.println(test(cat));

    }


}
