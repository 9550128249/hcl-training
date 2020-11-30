package hcl.interfacehandson;

public class Rectangle implements Polygon {
	public double calcPeri(double len,double bre)
	{
		return 2*(len+bre);
	}
	public double Area(double len,double bre)
	{
		return (len*bre);
	}

}

