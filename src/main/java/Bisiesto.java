
public class Bisiesto {
	
	private static final int _Cuatro=4;
	private static final int _Cien=100;
	
	public String Mostrar(int anio)
	{
		return Integer.toString(anio);
		
	}

	public Boolean Calcular(int anio) {
		if(anio>=_Cien && anio%_Cien==0 && anio%_Cuatro==0)
		{
			return true;
		}
		else
		{
			if(anio%_Cuatro==0)
				return true;
			else
				return false;
		}
	}
	

}
