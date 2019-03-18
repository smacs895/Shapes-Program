import javax.swing.JOptionPane;
public class Driver{
  public static void main(String[] args){
    // Use JOption Pane to get user input for desired radius & height for both Cone & Cylinder
    String coneRadius, coneHeight, cylinderRadius, cylinderHeight, resultCone, resultCylinder;
    Integer cR, cH, cyR, cyH;
    
    // Get user input for the cone's radius
    coneRadius = JOptionPane.showInputDialog(null,"Please enter the desired Radius for the Cone.");
    cR = Integer.parseInt(coneRadius);
    
    // Get user input for the cone's height
    coneHeight = JOptionPane.showInputDialog(null,"Please enter the desired Height for the Cone.");
    cH = Integer.parseInt(coneHeight);
    
    // Get user input for the cylinder's radius
    cylinderRadius = JOptionPane.showInputDialog(null,"Please enter the desired Radius for the Cylinder.");
    cyR = Integer.parseInt(cylinderRadius);
    
    // Get user input for the cylinder's height
    cylinderHeight = JOptionPane.showInputDialog(null,"Please enter the desired Height for the Cylinder.");
    cyH = Integer.parseInt(cylinderHeight);
    
    
    // Create instance of Cone. 
    // cR and cH are the user inputs.
    System.out.println("Details of the Cone:");
    Cone cone = new Cone(cR, cH);
    cone.getRadius();
    cone.getSurfaceArea();
    cone.getVolume();
    System.out.println("");
    
    // Create instance of Cylinder. 
    // cyR and cyH are the user inputs.
    System.out.println("Details of the Cylinder:");
    Cylinder cylinder = new Cylinder(cyR, cyH);
    cylinder.getRadius();
    cylinder.getSurfaceArea();
    cylinder.getVolume();
    System.out.println("");
  }
}