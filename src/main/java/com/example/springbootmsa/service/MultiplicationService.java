package com.example.springbootmsa.service;

import com.example.springbootmsa.domain.Multiplication;
import com.example.springbootmsa.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}
