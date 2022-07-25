package logicbig.example;

public class ExampleMain {

    public static void main(String[] args) {
        String path = ExampleMain.class.getClassLoader()
                .getResource("jul-log.properties")
                .getFile();
        System.setProperty("java.util.logging.config.file", path);

        MyClass.doSomething();
    }
}
