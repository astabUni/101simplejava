package org.softlang.company.tests;

import static org.softlang.company.features.Parsing.*;
import org.softlang.company.features.*;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.JDOMException;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParsingTest {

    public Document doc;
    String sampleCompany = "inputs" + File.separator + "sampleCompany.xml";

    @Test
    public void testParsing() throws IOException, JDOMException {
        doc = parseCompany(sampleCompany);
    }

}