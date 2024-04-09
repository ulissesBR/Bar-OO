package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover()
	{
		double cover = 4.00;
		
		if(feeding() > 30.0)
		{
			cover = 0;
		}
		
		return cover;
		
	}
	
	public double feeding()
	{
		return (beer * 5.0)
			+ (softDrink * 3.0)
			+ (barbecue * 7.0);
	}
	
	public double ticket()
	{		
		if (gender == 'M')
		{
			return 10.0;
		}
		else if (gender == 'F')
		{
			return 8.0;
		}
		
		return 0;
	}
	
	public double total()
	{
		return (ticket() + cover() + feeding());
	}
	
	public String toString()
	{
		String couvertString = cover() == 0 ? "Isento de Couvert\n" : "Couvert = R$ " + String.format("%.2f%n", cover());
		
		return "Consumo = R$ "
			+ String.format("%.2f%n", feeding())
			+ couvertString
			+ "Ingresso = R$ "
			+ String.format("%.2f%n%n", ticket())
			+ "Valor a pagar = R$ "
			+ String.format("%.2f%n", total());
	}
	
}
