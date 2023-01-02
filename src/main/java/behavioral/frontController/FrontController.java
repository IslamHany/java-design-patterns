package behavioral.frontController;

public class FrontController {
    private Dispatching dispatching = new Dispatching();

    private boolean isAuthenticUser() {
        System.out.println("Authentication successful.");
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Requested View: " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);

        if (isAuthenticUser()) dispatching.dispatch(request);
    }


}
