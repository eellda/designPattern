package builder;

public class PlainTextBuilder extends Builder {
    public PlainTextBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append("name: ");
        sb.append(data.getName());
        sb.append(", age: ");
        sb.append(data.getAge());

        return sb.toString();
    }

    @Override
    public String foot() {
        return "";
    }
}
