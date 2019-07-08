package io.github.oguzhancevik.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssertTest.class, ParameterTest.class, LifeCycle.class})
public class SuitTest {}
