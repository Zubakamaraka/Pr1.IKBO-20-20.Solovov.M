import java.lang.*;

public class Ball
{
    private String color;
    private int radius;
    public Ball(String n,int a)
    {
        color = n;
        radius = a;
    }
    public Ball(String n)
    {
        color = n;
        radius = 0;
    }
    public Ball()
    {
        color = "Red";
        radius = 1;
    }
    public void setRadius(int rad)
    {
        this.radius = rad;
    }
    public void setColor(String nameColor)
    {
        this.color = nameColor;
    }
    public String getColor(String nameColor)
    {
        return nameColor;
    }
    public int getRadius()
    {
        return radius;
    }
    public String toString()
    {
        return this.color + ", radius "+this.radius;
    }
    public void intoMillimeters()
    {
        System.out.println(" The "+color+" Ball has a radius of "+radius*10+" millimeters");
    }
}

