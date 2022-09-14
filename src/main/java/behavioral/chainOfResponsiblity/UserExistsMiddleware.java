package behavioral.chainOfResponsiblity;

public class UserExistsMiddleware extends Middleware{
    public Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        System.out.println("user middleware");
        System.out.println("email valid: " + server.hasEmail(email));
        if (!server.hasEmail(email)){
            System.out.println("This email does not exist");
            return false;
        }

        if(!server.isValidPassword(email, password)){
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(email, password);
    }
}
