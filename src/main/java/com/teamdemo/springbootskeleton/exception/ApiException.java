package com.teamdemo.springbootskeleton.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public class ApiException extends RuntimeException
{
    @Getter
    private final String context;
    @Getter
    private final HttpStatus httpStatus;
    public ApiException(String message, String context, HttpStatus httpStatus) {
        super(message);
        this.context = context;
        this.httpStatus = httpStatus;
    }

    public ApiException(String message, String context, HttpStatus httpStatus, Exception e) {
        super(message, e);
        this.context = context;
        this.httpStatus = httpStatus;
    }

    public static class BadRequestException extends ApiException {
        public BadRequestException(String message) {
            super(message, null, HttpStatus.BAD_REQUEST);
        }
        public BadRequestException(String message, String context) {
            super(message, context, HttpStatus.BAD_REQUEST);
        }
        public BadRequestException(String message, String context, Exception e) {
            super(message, context, HttpStatus.BAD_REQUEST, e);
        }
    }

    public static class NotFoundException extends ApiException {
        public NotFoundException() {
            super(null, null, HttpStatus.NOT_FOUND);
        }
        public NotFoundException(Exception e) {
            super(null, null, HttpStatus.NOT_FOUND, e);
        }
    }

    public static class InternalServerErrorException extends ApiException {
        public InternalServerErrorException(String context) {
            super(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), context, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        public InternalServerErrorException(String context, Exception e) {
            super(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), context, HttpStatus.INTERNAL_SERVER_ERROR, e);
        }
    }
}
