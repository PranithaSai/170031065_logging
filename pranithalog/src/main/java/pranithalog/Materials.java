package pranithalog;

import pranithalog.House;

public class Materials {
	String materialType;
	   double totalAreaOfHouse;
	   String automationType;
	   Materials(){}
	   Materials(String materialType,double totalAreaOfHouse,String automationType)
	   {
		   this.materialType=materialType;
		   this.totalAreaOfHouse=totalAreaOfHouse;
		   this.automationType=automationType;
	   }
	   public String calculateHouseConstructionCost(String materialType, double totalAreaOfHouse, String automationType) throws Exception
	   {
		   House houseConstructionCost=new  House(materialType, totalAreaOfHouse, automationType);
		   return String.valueOf(houseConstructionCost.computeCostOfHouseConstruction())+"INR";
	   }

}
