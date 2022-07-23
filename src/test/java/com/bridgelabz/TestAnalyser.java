package com.bridgelabz;

import org.junit.jupiter.api.Test;

public class TestAnalyser {
    @Test
    public void testCensusAnalyser() {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        analyser.loadData();
    }
}
