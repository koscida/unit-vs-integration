package koscida.dev.unitvsintegration.controllers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class HelloControllerTest {

	HelloController helloController = new HelloController();

	@Test
	void hello() {
		String actual = helloController.hello("World");
		assertEquals("Hello, World", actual);
	}
}