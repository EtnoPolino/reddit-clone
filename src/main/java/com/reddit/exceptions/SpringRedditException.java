package com.reddit.exceptions;

public class SpringRedditException extends RuntimeException{
    public SpringRedditException(String exceptionMessage){
        super(exceptionMessage);
    }

    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }
}
