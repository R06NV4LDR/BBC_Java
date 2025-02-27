package _02_sichtbarkeit_und_package;

public class SomeClass {
    public static void main(String[] args) {
        OtherClass.say();
        OtherClass.text = "Hallo";
        OtherClass.say();


        _02_sichtbarkeit_und_package.OtherClass.say();

    }}