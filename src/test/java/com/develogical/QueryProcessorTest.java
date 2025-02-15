package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutByron() throws Exception {
        assertThat(queryProcessor.process("Byron"), containsString("Lord"));
    }

    @Test
    public void knowsAboutName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("jhcjrr"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void isPlus() throws Exception {
        assertThat(queryProcessor.process("what is 10 plus 5"), containsString("15"));
    }

}
