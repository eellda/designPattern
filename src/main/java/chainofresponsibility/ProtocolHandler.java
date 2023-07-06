package chainofresponsibility;

public class ProtocolHandler extends Handler {
    @Override
    protected void process(String url) {
        int idx = url.indexOf("://");

        if (idx != -1) {
            System.out.println("protocol: " + url.substring(0, idx));
        } else {
            System.out.println("No protocol");
        }
    }
}
