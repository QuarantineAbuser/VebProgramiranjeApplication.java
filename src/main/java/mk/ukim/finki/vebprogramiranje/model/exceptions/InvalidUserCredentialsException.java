package mk.ukim.finki.vebprogramiranje.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException{

    public InvalidUserCredentialsException(){
        super("Invalid user credentials exception");
    }
}
