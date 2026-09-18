


public class Coin
{
	
	private boolean inCirculation;
	private char condition;
	private int mintYear;
	private double baseValue;
	private double collectorValue;
	
	public Coin(boolean inCirculation , char condition , int mintYear , double baseValue)
	{
		this.inCirculation = inCirculation;
		this.condition = condition;
		this.mintYear = mintYear;
		this.baseValue = baseValue;
	    
	    calculatorValue();
	}
	
	public boolean isInCirculation()
	{
		return inCirculation;
		
	}
	public char getCondition()
	{
		
		
		return condition;
		
	}
	public double getCollectorValue()
	{
		
		return collectorValue;
	}
	public double getBaseValue()
	{
		return baseValue;
	}
	public int getMintYear()
	{
		return mintYear;
	}
	
	private void calculatorValue()
	{
		double value = 0.0;
		
		if(!inCirculation)
		{
			value += baseValue*0.50;
		}
		
		switch(condition)
		{
			case 'E':
			   value += baseValue*0.40;
			 break;
			 
			case 'G':
			  value += baseValue*0.20;
			 break;
			
			case 'F':
			 value += baseValue*0.10;
			 break;
	        
			default:
			break;
		}
		
		int currentYear = java.time.Year.now().getValue();
		int age = currentYear - mintYear;
		if(age <= 50)
		{
		  value += baseValue*0.05;
		}
		else if(age <= 100 )
		{
			value += baseValue*0.15;
		}
		else if(age <= 150)
		{
			value += baseValue*0.30;
		}
		else
		{
			value += baseValue*0.50;
		}
		
		collectorValue = value;
	}
	

	
	
	
	
}





































