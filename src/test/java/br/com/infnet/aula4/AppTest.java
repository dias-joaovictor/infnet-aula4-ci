package br.com.infnet.aula4;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void testGetString() {
		App app = new App();

		Assert.assertEquals("Hello World", app.getString());
	}

}
