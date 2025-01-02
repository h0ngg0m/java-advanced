package network.tcp.autocloseable;

public class ResourceCloseMainV4 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException: " + e.getMessage());

            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("suppressed: " + t);
            }

            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("CloseException: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {
        try (ResourceV2 resource1 = new ResourceV2("resource1");
             ResourceV2 resource2 = new ResourceV2("resource2")) {

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        }
    }
}
