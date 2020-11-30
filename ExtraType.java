package hcl.problem4;

public class ExtraType {
String details;
public ExtraType() {
	// TODO Auto-generated constructor stub
}
public ExtraType(String details) {
	super();
	this.details = details;
}
public void loop()
{
	String s2[]=details.split("#");
	System.out.println("Extra Type Details:");
	System.out.println("Extra Type:"+s2[0]);
	System.out.println("Runs:"+s2[1]);
}
}
