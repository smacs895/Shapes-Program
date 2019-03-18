
public class Cone extends circleBase{
  private double height;
  private double volume;
  private double length = Math.sqrt(Math.pow(radius,2)+(Math.pow(height,2)));
    
  // Default Constructor with set radius and height
  public Cone(){
      radius = 1;
      height = 1;
      System.out.println("The radius of the Cone is: " + radius);
      System.out.println("The height of the Cone is: " + height);  
  }

  // Constructor that takes 2 ints, specifying the radius and the height
  public Cone(int radius, int height){
      this.radius = radius;
      this.height = height;
      System.out.println("The Radius of the Cone is set at: " + radius);
      System.out.println("The Height of the Cone is set at: " + height);
  }
  
  // Get method to get height of cylinder  
  public double getHeight(){
      System.out.println("The Height of the Cone is: " + height);
      return height;  
  }
  
  // Set method to set the height of the cone  
  public double setHeight(double height){
      this.height = height;
      System.out.println("The Height of the Cone is now: " + height);
      return height;
  }
  
  // Abstract method for calculating surface area
  public void getSurfaceArea(){ 
      this.radius = radius;
      this.height = height;
      double SurfaceArea = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
      System.out.println("The Surface Area of the Cone is: " + SurfaceArea);
  }
  
  // Private method to calculate the volume of the cone  
  private void setVolume(){
      volume = Math.PI*(Math.pow(radius,2)*(height/3));
  }
  
  // Public method to access the private setVolume method
  public double getVolume(){
      setVolume();
      System.out.println("The Volume of the Cone is: " + volume);      
      return volume;
  }
}