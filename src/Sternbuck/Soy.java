package Sternbuck;
public class Soy extends CondimentDecorator{
	Beverage b;
	
	public Soy(Beverage b) {
		this.b = b;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return b.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}
	
}
