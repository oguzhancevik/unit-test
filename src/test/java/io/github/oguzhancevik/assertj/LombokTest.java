package io.github.oguzhancevik.assertj;

import io.github.oguzhancevik.unittest.customer.Gift;
import org.junit.Test;

public class LombokTest {

    @Test
    public void testLombok() {
        Gift gift = new Gift("Pencil");
        System.out.println(gift);
    }

    @Test
    public void testBuilder() {
        Gift gift = Gift.builder().name("Shirt").build();
        System.out.println(gift);
    }
}
