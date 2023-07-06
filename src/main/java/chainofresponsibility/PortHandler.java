package chainofresponsibility;

public class PortHandler extends Handler {
    @Override
    protected void process(String url) {
        int idx = url.lastIndexOf(":");

        if (idx != -1) {
            String strPort = url.substring(idx + 1);

            try {
                int port = Integer.parseInt(strPort);
                System.out.println("Port: " + port);
                return;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        System.out.println("No Port");
    }
}
