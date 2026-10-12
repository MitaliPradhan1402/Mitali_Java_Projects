package exception;
import java.lang.RuntimeException;


public class EntityNotFoundException extends RuntimeException{

public EntityNotFoundException(String message){
    super(message);
}


}
