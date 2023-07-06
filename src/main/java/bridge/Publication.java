package bridge;

public class Publication extends Draft {
    private String publisher;
    private int cost;

    public Publication(String title, String author, String[] content, String publisher, int cost) {
        super(title, author, content);
        this.publisher = publisher;
        this.cost = cost;
    }

    public void printPublicationInfo() {
        System.out.println("퍼블리셔: " + publisher + "\n가격: " + cost);
    }

    @Override
    public void prrint(Display display) {
        super.prrint(display);
        printPublicationInfo();
    }
}
