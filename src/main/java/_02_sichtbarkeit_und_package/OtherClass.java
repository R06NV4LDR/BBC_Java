package _02_sichtbarkeit_und_package;

public class OtherClass {
    public static String text = "grüezi";
    public static void setText(String text) {
        OtherClass.text = text;
    }

    public static String getText() {
        return text;
    }


    public static void say() {
        System.out.println(getText());
    }
}
