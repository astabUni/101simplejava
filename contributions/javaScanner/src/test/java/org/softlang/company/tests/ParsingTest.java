package org.softlang.company.tests;

import static org.softlang.company.features.Parsing.*;
import org.softlang.company.features.recognizer.RecognitionException;
import org.softlang.company.features.recognizer.Recognizer;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * Try to consume all input with the lexer.
 * There is a positive and a negative test case.
 */
public class ParsingTest {

    private static String posSample =
        "inputs"
        + File.separator
        + "sample.Company";
    private static String negSample =
        "inputs"
        + File.separator
        + "nonSample.Company";
    
    @Test
    public void testPos() throws FileNotFoundException {
        parse(posSample);
    }

    @Test(expected=RecognitionException.class)
    public void testNeg() throws FileNotFoundException {
        parse(negSample);
    }

}