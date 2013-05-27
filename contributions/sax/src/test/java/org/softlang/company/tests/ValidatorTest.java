package org.softlang.company.tests;

import static org.softlang.company.features.sax.Validator.*;

import java.io.File;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidatorTest {
    
    @Test
    public void testValidate() {
        // sax failing @ directories, but it works if files are in root folder sax and with
        assertTrue(validate("sampleCompany.xml", "Company.xsd"));
        assertTrue(validate("output.xml", "Company.xsd"));
        // failing with directories (needs change in CutTest.java and placement of sampleCompany.xml and Company.xsd):
        // assertTrue(validate("inputs/sampleCompany.xml", "inputs/Company.xsd"));
        // assertTrue(validate("build/outputs/output.xml", "inputs/Company.xsd"));
    }

}