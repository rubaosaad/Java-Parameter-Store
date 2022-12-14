package com.aws.model;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

public class ServiceResponse<T> implements Serializable {

  private HttpStatus status; // OK_Failure

  public ServiceResponse() {}

  public ServiceResponse(HttpStatus status) {
    this.status = status;
  }

  public HttpStatus getStatus() {
    return status;
  }

  public void setStatus(HttpStatus status) {
    this.status = status;
  }

}
