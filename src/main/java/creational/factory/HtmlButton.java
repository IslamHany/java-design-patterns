package creational.factory;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>This is Html Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Hey man why did you click me ?");
    }
}
