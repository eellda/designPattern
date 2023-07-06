package chainofresponsibility;

public class DomainHandler extends Handler {

    @Override
    protected void process(String url) {
        int startIdx = url.indexOf("://");
        int lastIdx = url.indexOf(":");

        System.out.println("Domain: ");

        if (startIdx == -1) {
            if (lastIdx == -1) {
                System.out.println(url);
            } else {
                System.out.println(url.substring(0, lastIdx));
            }
        } else if (startIdx != lastIdx){
            System.out.println(url.substring(startIdx + 3, lastIdx));
        } else if (startIdx == lastIdx) {
            System.out.println(url.substring (startIdx + 3));
        } else {
            System.out.println("None");
        }
    }
}
