package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FrequencyAnalysisTest {

    @Test
    public void frequencyAnalysisTestRus() {
        String s = "Баобабпппппппппп";
        FrequencyAnalysis fa = new FrequencyAnalysis();
        char result = fa.findSimilarLetters(s);
        char expected = 'п';
        assertThat(result, is(expected));
    }

    @Test
    public void frequencyAnalysisTestEnglish() {
        String s = "Frequency";
        FrequencyAnalysis fa = new FrequencyAnalysis();
        char result = fa.findSimilarLetters(s);
        char expected = 'e';
        assertThat(result, is(expected));
    }
}
