package io.github.oguzhancevik.hamcrest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.anything;

public class HamcrestTest {

    @Test
    public void testBasicMatching(){
        String text1 = "Ali";
        String text2 = "Ali2";
        Assert.assertThat(text1, is(equalTo("Ali")));
        Assert.assertThat(text1, is(notNullValue()));
        Assert.assertThat(text1, is(anything("li")));
    }

    @Test
    public void testListeneer(){
        List<String> cities = new ArrayList<String>(Arrays.asList("Istanbul", "Ankara", "Bursa"));
        Assert.assertThat(cities, anything("İstanbul"));
    }

}
