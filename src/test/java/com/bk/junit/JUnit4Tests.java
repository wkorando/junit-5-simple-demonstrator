package com.bk.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class JUnit4Tests {

	@Test
	public void assertThrowsUpdates() {
		assertThrows(RuntimeException.class, () -> doesntThrowException());
	}

	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(5000L);
	}

	public int doesntThrowException() {
		return 1;
	}

}
