package com.hurl.algorithm.sort;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HashTableTest {
	@Test
	public void testNullMap() {
		Map<Object, Object> hashMap = new HashMap<Object, Object>();
		hashMap.put(null, null);
		Assert.assertEquals(1, hashMap.size());
	}
}
