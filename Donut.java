
 
public class Donut {
	private double height;
	private double innerRadius;
	private  double outerRadius;
	

	    public Donut(double height, double innerRadius, double outerRadius) {
	        this.height = height;
	        this.innerRadius = innerRadius;
	        this.outerRadius = outerRadius;
	    }

	    public double getHeight() {
	        return height;
	    }

	    public double getInnerRadius() {
	        return innerRadius;
	    }

	    public double getOuterRadius() {
	        return outerRadius;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    public void setInnerRadius(double innerRadius) {
	        this.innerRadius = innerRadius;
	    }

	    public void setOuterRadius(double outerRadius) {
	        this.outerRadius = outerRadius;
	    }

	    public double calculateVolume() {
	        return Math.pow(Math.PI, 2) * height * (outerRadius - innerRadius) * (outerRadius + innerRadius) / 4;
	    }
	}



