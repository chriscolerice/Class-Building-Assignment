import javax.swing.JOptionPane;
public class BuildingProject{

public static void main(String[] args) {

double initialBudget;

initialBudget=Double.parseDouble(JOptionPane.showInputDialog("What is your budget?"));

System.out.println("The initial budget for the Bathroom remodel is $" + initialBudget);
System.out.println("Material" + "\t" + "Cost" + "\t" + "Total Cost" + "\t" + "Remaining Budget");

BuildingMaterial intB = new BuildingMaterial(initialBudget);

BuildingMaterial seat = new BuildingMaterial();

displayD(seat);

BuildingMaterial bowl = new BuildingMaterial();

displayD(bowl);

JOptionPane.showMessageDialog(null, "You need to change the price of the bowl");
bowl.revisePrice();
bowl.displayData("R");

System.out.println("");



BuildingMaterial.budgetRemain();


}



public static void displayD(BuildingMaterial a){
  a.displayData();
}









}
