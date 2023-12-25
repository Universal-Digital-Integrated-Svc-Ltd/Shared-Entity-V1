package com.ms.sharedentityv1.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -1454876700450859867L;
    private String errorCode;
    private HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
    private Exception ex;
    private Object data;

    public ServiceException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public ServiceException(String errorCode, Object data) {
        super();
        this.errorCode = errorCode;
        this.data = data;
    }

    public ServiceException(String errorCode, HttpStatus httpStatus) {
        super();
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public ServiceException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public ServiceException(String errorCode, HttpStatus httpStatus, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public ServiceException(String errorCode, HttpStatus httpStatus, Exception ex) {
        super();
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
        this.ex = ex;
    }
}
