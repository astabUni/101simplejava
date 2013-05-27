package org.softlang.company.tests;

import static org.softlang.company.features.Total.*;
import static org.softlang.company.features.Parsing.*;

import org.w3c.dom.Document;

import static org.junit.Assert.*;
import org.junit.Test;

public class TotalTest {

    private static String sampleCompany = "inputs/sampleCompany.xml";

    @Test
    public void testTotal() throws Exception {
        Document doc = parseDocument(sampleCompany);
        double total = total(doc);
        assertEquals(399747, total, 0);
    }


}