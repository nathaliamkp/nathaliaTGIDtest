package com.test.nathalia.entity;

import com.test.nathalia.exception.NoBalanceAvailable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class EnterpriseTest {

    @Test
    void balanceShouldEndWithDepositeLessTax(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 1000, 0.1);

        enterprise.deposite(100);

        double balance = enterprise.getBalance();

        assertEquals(1090,balance);

    }

    @Test
    void whenThereIsNoTaxDepositeShouldBeTheEntireValue(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 1000, 0);

        enterprise.deposite(100);

        double balance = enterprise.getBalance();

        assertEquals(1100,balance);

    }

    @Test
    void shouldThrowANoBalanceAvailableExceptionBecauseBalanceIsZero(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 0, 0.1);

        assertThrows(NoBalanceAvailable.class, () -> enterprise.withdraw(10));

    }

    @Test
    void shouldThrowANoBalanceAvailableExceptionBecauseWithdrawGreaterThanBalance(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 10, 0.1);

        assertThrows(NoBalanceAvailable.class, () -> enterprise.withdraw(100));

    }





}