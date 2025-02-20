package com.edenlisk.ubuvuzi.connect.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
    super(String.format("%s is not found with %s: '%s'", resourceName, fieldName, fieldValue));
  }
}
