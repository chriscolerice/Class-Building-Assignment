import javax.swing.JOptionPane;
public class BuildingMaterial{

private double taxRate = 0.085; //going taxrate
private static double budgetAmount; // how much the total budget is
private static double totalPurchA; // total purchase amount with taxes
private String materialName; // The materials name
private double itemPurchA; // The item's purchase amount without tax
private double calcPurchA; // The items's purchase amount with taxes

// constructor to intitialize the budget amount
public BuildingMaterial(double a){
  budgetAmount = a;
}

// constructor that gathers all the material info from the user
public BuildingMaterial(){
  materialName= JOptionPane.showInputDialog("What is the name of the " +
  "material? ");

  itemPurchA= Double.parseDouble(JOptionPane.showInputDialog("How much does "
  + "the material cost?"));

  calcPurchA= (itemPurchA*taxRate)+itemPurchA;
  totalPurchA+= calcPurchA;

}



// method to update the price of an item
public void revisePrice(){
  totalPurchA-=calcPurchA;

  itemPurchA= Double.parseDouble(JOptionPane.showInputDialog("What is the " +
  "new price of " + materialName + " ?"));

  calcPurchA= (itemPurchA*taxRate) + itemPurchA;
  totalPurchA+=calcPurchA;
}



// method to show the remaining budget
public static void budgetRemain(){
  System.out.println("After purchasing the above items totaling $" +
  totalPurchA + ", the remaining budget is $" + (budgetAmount-totalPurchA) );

}


// method displays all data
public void displayData(){
  System.out.println(materialName + "\t" + "$" + calcPurchA +
  "\t" + "$" + totalPurchA + "\t" + "$" + (budgetAmount-totalPurchA));
}


// display revised data
public void displayData(String a){
  System.out.println("Revised Cost");
  System.out.println(materialName + "\t" + "$" + calcPurchA +
  "\t" + "$" + totalPurchA + "\t" + "$" + (budgetAmount-totalPurchA));
}




}
