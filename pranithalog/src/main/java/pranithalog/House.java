package pranithalog;

import java.util.InputMismatchException;

public class House extends Materials
{

	House(String materialType, double totalAreaOfHouse, String automationType) {
		super(materialType, totalAreaOfHouse, automationType);
	}

	public double computeCostOfHouseConstruction() throws InputMismatchException
	{
	  if(materialType.equals("standard"))
	  {
		  return totalAreaOfHouse*1200.00;
	  }
	  else if(materialType.equals("above standard"))
	  {
		  return totalAreaOfHouse*1500.00;  
	  }
	  else if(materialType.equals("high standard") && automationType.equals("fully automated"))
	  {
		  return totalAreaOfHouse*2500.00;    
	  }
	  else if(materialType.equals("high standard"))
	  {
		  return totalAreaOfHouse*1800.00;  
	  }
	  else
	  {
		throw new InputMismatchException("Materials Required are not Available in the Market");  
	  }
	}
}