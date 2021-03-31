public class CalculateArea {
    SquareService squareService;
    RectangleService rectangleService;
    CircleService circleService;

    CalculateArea(SquareService squareService, RectangleService rectangeService, CircleService circleService)
    {
        this.squareService = squareService;
        this.rectangleService = rectangeService;
        this.circleService = circleService;
    }
    public Double calculateArea(Type type, Double... r )
    {
        switch (type)
        {
            case RECTANGLE:
                if(r.length >=2)
                return rectangleService.area(r[0],r[1]);
            case SQUARE:
                if(r.length >=1)
                    return squareService.area(r[0]);
            case CIRCLE:
                if(r.length >=1)
                    return circleService.area(r[0]);
            default:
                throw new RuntimeException("Operation not supported");
        }
    }
}
class SquareService {

    public Double area(double r)
    {
        return r * r;
    }
}
class RectangleService {

    public Double area(Double r, Double h)
    {
        return r * h;
    }
}
class CircleService {

    public Double area(Double r)
    {
        return Math.PI * r * r;
    }
}
enum Type {
    RECTANGLE,SQUARE,CIRCLE;
}
