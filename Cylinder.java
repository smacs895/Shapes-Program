public class Cylinder extends circleBase{
  private double height;
  private double volume;

  // Default Constructor with set radius and height
  public Cylinder(){
      radius = 1;
      height = 1;
      System.out.println("The Radius of the Cylinder is: " + radius);
      System.out.println("The Height of the Cylinder is: " + height);      
  }

  // Constructor that takes 2 ints specifying the radius and height
  public Cylinder(int radius, int height){
      this.radius = radius;
      this.height = height;
      System.out.println("The Radius of the Cylinder is set at: " + radius);
      System.out.println("The Height of the Cylinder is set at: " + height);
  }
  
  // Get method to get height of cylinder
  public double getHeight(){
      System.out.println("The Height of the Cylinder is: " + height);
      return height;      
  }
  
  // Set method to set the height of the cylinder
  public double setHeight(double height){
      this.height = height;
      System.out.println("The Height of the Cylinder is now: " + height);
      return height;
  }
  
  // Abstract method for calculating surface area
  public void getSurfaceArea(){ 
      this.radius = radius;
      this.height = height;
      double SurfaceArea = (2*Math.PI*radius*height) + 2*Math.PI*(Math.pow(radius,2));
      System.out.println("The Surface Area of the Cylinder is: " + SurfaceArea);
  }
  
  // Private method to calculate the volume of the cylinder
  private void setVolume(){
      volume = (Math.PI*Math.pow(radius,2)*height);
  }  
  
  // Public method to access the private setVolume method
  public double getVolume(){
      setVolume();
      System.out.println("The Volume of the Cylinder is: " + volume);
      return volume;
  }
}