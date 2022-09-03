package structural.decorator;

//Abstract base decorator
public class DataSourceDecorator implements DataSource{
    private DataSource wrapee;

    public DataSourceDecorator(DataSource wrapee) {
        this.wrapee = wrapee;
    }

    @Override
    public void writeData(String data) {
        this.wrapee.writeData(data);
    }

    @Override
    public String readData() {
        return this.wrapee.readData();
    }
}
