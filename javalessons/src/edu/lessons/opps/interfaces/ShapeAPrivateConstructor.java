package edu.lessons.opps.interfaces;

public class ShapeAPrivateConstructor {
    public int height;
    public int width;
    
    private ShapeAPrivateConstructor() {
    	System.out.println("ShapA Created A"+hashCode());
    }
    private ShapeAPrivateConstructor(int x) {
    	height =x;
    	width=x;
    	System.out.println(x+" ShapeA CreatedB "+hashCode());
    }
    public static ShapeAPrivateConstructor getObject() { //factory method
         return new ShapeAPrivateConstructor(); //call to private constructor	
    }
	public void echo() {
		// TODO Auto-generated method stub
		
	}
}
