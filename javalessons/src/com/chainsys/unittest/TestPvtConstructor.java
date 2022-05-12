package com.chainsys.unittest;

import edu.lessons.opps.interfaces.ShapeAPrivateConstructor;

public class TestPvtConstructor {
public static void main(String args[]) {
	testPrivateConstructor();
}
public static void testPrivateConstructor() {
	ShapeAPrivateConstructor refShapeA=
   ShapeAPrivateConstructor.getObject();
	refShapeA.height=123;
	refShapeA.width=500;
	refShapeA.echo();
}
}
