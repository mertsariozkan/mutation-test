package com.example.mutationtest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class CalculatorTests {

    @Test
    void contextLoads() {
    }

    @Test
    void calculatesNetAmount() {
        Calculator calculator = new Calculator(1000, 400);
        assertThat(calculator.calculateNetAmount()).isEqualTo(600);
    }
}
