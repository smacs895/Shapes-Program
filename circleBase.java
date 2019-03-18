public abstract class circleBase{
  protected double radius;
  private String colour;
  
  // Default constructor with a radius of 1
  public circleBase(){
      radius = 1;
  }
    
  // Constructor that takes an int specifying the radius
  public circleBase(int radius){
      this.radius = radius;
      System.out.println("The radius is set at: " + radius);
  }
    
  // Get method to return the radius
  public double getRadius(){
      //System.out.println("The radius is: " + radius);
      return radius;
  }
    
  // Set method to set a new radius
  public double setRadius(double radius){
      this.radius = radius;
      System.out.println("The radius is now: " + radius);
      return radius;
  }
    
  // Get method to return the colour
  public String getColour(){
      if(colour == null){
          System.out.println("The colour has not been set yet!");
          System.out.println("Set the colour by using the 'setColour' method!");
        }else{
          System.out.println("The colour is: " + colour);
      }
      return colour;
  }
    
  // Set method to set a new colour
  public String setColour(String colour){
      this.colour = colour;
      System.out.println("The colour is: " + colour);
      return colour;
  }
    
  // Abstract method for calculating surface area
  public abstract void getSurfaceArea();
}