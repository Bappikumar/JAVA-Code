public class shapefactory
{
    public shape getshape(String ShapeType)
    {
        if(ShapeType == null)
        {
            return null;
        }
        if(ShapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new circle();
        }
            else if(ShapeType.equalsIgnoreCase("RECTANGLE"))
            {
                return new Rectangle();
            }
            else if(ShapeType.equalsIgnoreCase("SQUARE"))
            {
                return new square();
            }

        return null;
    }
}