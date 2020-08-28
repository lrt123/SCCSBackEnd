package cn.edu.guet.exception;

public class SaveException extends RuntimeException {
    public SaveException(){
        super();
    }
    public SaveException(String errorMessage){
        super(errorMessage);
    }
}