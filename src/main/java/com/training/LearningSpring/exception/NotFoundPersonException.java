package com.training.LearningSpring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundPersonException extends RuntimeException {

  public NotFoundPersonException(String message) {
    super(message);
  }
}
