package com.test.spring;

/**
 * Created by jeril on 2015/04/21.
 */
public class DrawingBoard
{

    private Shape shape;

    public void setShape(Shape shape)
    {
        this.shape = shape;
    }

    public void drawShape()
    {
        shape.draw();
    }
}
