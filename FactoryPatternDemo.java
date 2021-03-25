public class FactoryPatternDemo
{
    public static void main (String args[])
    {
        shapefactory shapeFactory = new shapefactory();

        shape shape1 = shapeFactory.getshape("CIRCLE");
        shape1.draw();

        shape shape2 = shapeFactory.getshape("RECTANGLE");
        shape2.draw();

        shape shape3 = shapeFactory.getshape("SQUARE");
        shape3.draw();
    }
}