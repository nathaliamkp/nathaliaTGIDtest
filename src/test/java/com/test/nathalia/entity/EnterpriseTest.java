package com.test.nathalia.entity;

import org.junit.jupiter.api.Test;

class EnterpriseTest {

    @Test
    void balanceShouldEndWithDepositeLessTax(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 1000, 0.1);





    }

    @Test
    void shouldThrowANoBalanceAvailableExceptionBecauseBalanceIsZero(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 0, 0.1);



    }

    @Test
    void shouldThrowANoBalanceAvailableExceptionBecauseWithdrawGreaterThanBalance(){
        Enterprise enterprise = new Enterprise("33.113.309/0001-47", "Valid", 10, 0.1);


    }



}