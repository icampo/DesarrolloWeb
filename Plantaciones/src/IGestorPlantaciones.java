import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public interface IGestorPlantaciones {

	public void plantar(Plantacion plant);
	public void recolectar(int parcela, Date fechaPlan,int cantRec);
	public void borrarPlantacion(Plantacion plant);
	public Plantacion getPlantacion(int parcela,Date fechaPlan);
	public ArrayList<Plantacion> getPlantaciones();
	public ArrayList<Plantacion> getPlanRecoger();
	public String[] getParcelas();
	public String[] getEspecies();

	
	
}
