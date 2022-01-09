package classes;

public class MyException {
    public static class GrowException extends RuntimeException{
        public GrowException(String message){
            super(message);
        }
    }
    public static class StoryException extends Exception{
        public StoryException(String message){
            super(message);
        }
    }
}
