package com.nttdata.microservice.apigateway.controller;

import com.nttdata.microservice.apigateway.model.FallbackResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/fallback")
public class FallbackController {

  private final String message = "%s is taking longer than expected. " +
      "Please come back later.";

  @Value("${server.port}")
  private String port;

  @GetMapping("/clientService")
  public Mono<ResponseEntity<FallbackResponse>> clientServiceFallback() {
    log.info("Returning fallback result for client-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Client Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

  @GetMapping("/accountService")
  public Mono<ResponseEntity<FallbackResponse>> accountServiceFallback() {
    log.info("Returning fallback result for account-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Account Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

  @GetMapping("/creditService")
  public Mono<ResponseEntity<FallbackResponse>> creditServiceFallback() {
    log.info("Returning fallback result for credit-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Credit Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

  @GetMapping("/transactionService")
  public Mono<ResponseEntity<FallbackResponse>> transactionServiceFallback() {
    log.info("Returning fallback result for transaction-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Transaction Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

  @GetMapping("/reportService")
  public Mono<ResponseEntity<FallbackResponse>> reportServiceFallback() {
    log.info("Returning fallback result for report-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Report Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

  @GetMapping("/debitCardService")
  public Mono<ResponseEntity<FallbackResponse>> debitCardServiceFallback() {
    log.info("Returning fallback result for debit-card-service! on port {}", port);
    FallbackResponse fallback = FallbackResponse.builder()
        .fallbackMessage(String.format(message, "Debit Card Service!"))
        .status(HttpStatus.SERVICE_UNAVAILABLE.value())
        .build();
    return Mono.just(fallback).map(ResponseEntity::ok);
  }

}
