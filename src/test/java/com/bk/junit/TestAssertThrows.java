package com.bk.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestAssertThrows {

	@Test
	public void testAssertThrowsUpdates() {
		assertThrows(Exception.class, () -> doesntThrowException());
	}

	private int doesntThrowException() {
		return 1;
	}
}
