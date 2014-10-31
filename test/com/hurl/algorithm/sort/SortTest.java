package com.hurl.algorithm.sort;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortTest {
	Logger log = LoggerFactory.getLogger(SortTest.class);
	private int[] list;
	private int[] eachList;
	private static final int listLength = 1000;

	@BeforeClass
	public void initList() {
		list = new int[listLength];
		for (int i = 0; i < listLength; i++) {
			list[i] = (int) (Math.random() * listLength);
		}
		log.info("init list: " + Arrays.toString(list));
	}

	@BeforeMethod
	public void resetList() {
		eachList = new int[list.length];
		System.arraycopy(list, 0, eachList, 0, list.length);
		log.info("array before sort :" + Arrays.toString(eachList));
	}

	// @Test
	public void testBubbleSort() {
		new BubbleSort().sort(eachList);
	}

	@Test
	public void mergeSort() {
		new MergeSort().sort(eachList);
	}

	@Test
	public void testQuickSort() {
		new QuickSort().sort(eachList);
	}

	@AfterMethod
	public void printList() {
		log.info("array after sort : " + Arrays.toString(eachList));
	}
}
