package creational.factory;

public class Main {
    public static Dialog dialog;

    public static void main(String[] args) {
//        configure("os");
        configure("windows");
        runBusinessLogic();
    }

    public static void configure(String osName){
        if (osName.equals("os"))
            dialog = new HtmlDialog();
        else if (osName.equals("windows"))
            dialog = new WindowsDialog();
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
