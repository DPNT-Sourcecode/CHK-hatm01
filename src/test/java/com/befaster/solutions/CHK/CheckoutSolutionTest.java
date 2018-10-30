package com.befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import befaster.solutions.CHK.CheckoutSolution;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {
    private CheckoutSolution checkout;

    @Before
    public void setUp() {

    	checkout = new CheckoutSolution();
    }

    @Test
    public void compute_checkout() {
    	assertThat(checkout.checkout("AABC"), equalTo(150));
        assertThat(checkout.checkout("a"), equalTo(-1));
    }
}
