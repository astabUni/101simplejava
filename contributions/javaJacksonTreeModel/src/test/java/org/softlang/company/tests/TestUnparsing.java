package org.softlang.company.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.softlang.company.features.Parsing;
import org.softlang.company.features.Unparsing;

import com.fasterxml.jackson.databind.JsonNode;

public class TestUnparsing {

	@Test
	public void testUnparse() {
		File in = new File("inputs" + File.separator + "sampleCompany.json");
		File out = new File("outputs" + File.separator + "outCompany.json");
		JsonNode c;
		c = Parsing.parseFromFile(in);
		String jsonIn = "";
		String jsonOut = "";
		try {
			Unparsing.unparse(c, out);
			BufferedReader input = new BufferedReader(new FileReader(in));
			BufferedReader output = new BufferedReader(new FileReader(out));
			FileReader r = new FileReader(in);
			while (output.ready())
				jsonOut += output.readLine();
			while (input.ready())
				jsonIn += input.readLine();
			assertEquals(0, jsonOut.compareTo(jsonIn));
			output.close();
			input.close();
		} catch (IOException e) {
			fail();
		}

	}
}
