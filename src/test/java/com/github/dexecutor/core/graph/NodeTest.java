package com.github.dexecutor.core.graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testNodeIsErrored() {
		Node<Integer, Integer> node = new  Node<Integer, Integer>(1);
		node.setErrored();
		assertThat(node.isErrored(), equalTo(true));
	}
	
	
	@Test
	public void testNodeIsNotErrored() {
		Node<Integer, Integer> node = new  Node<Integer, Integer>(1);
		node.setSuccess();
		assertThat(node.isErrored(), equalTo(false));
	}
	
	@Test
	public void testNodeIsSkipped() {
		Node<Integer, Integer> node = new  Node<Integer, Integer>(1);
		node.setSkipped();
		assertThat(node.isSkipped(), equalTo(true));
	}
	
	@Test
	public void testNodeIsNotSkipped() {
		Node<Integer, Integer> node = new  Node<Integer, Integer>(1);
		node.setErrored();
		assertThat(node.isSkipped(), equalTo(false));
	}

}