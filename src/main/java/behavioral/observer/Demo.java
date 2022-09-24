package behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("src/main/java/behavioral/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
