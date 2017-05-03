import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import db.GestorBDMySQL;
import db.GestorBDSQLite;
import db.IGestorBBDD;

public class GestorPlantacionesBBDD implements IGestorPlantaciones {
	//IGestorBBDD igb;
	IGestorBBDD gbd=new GestorBDSQLite();

	GestorPlantacionesFichero gbf=new GestorPlantacionesFichero();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	
	@Override
	public void plantar(Plantacion plant) {
		String sql="INSERT INTO PLANTACIONES VALUES("
				+ plant.getParcela()+",'"+sdf.format(plant.getFechaPlan())+"','"+sdf.format(plant.getFechaRec())+"','"+
				plant.getEspecie()+"',"+plant.getCantPlant()+",0);";
		gbd.updateSQL(sql);
	}

	@Override
	public void recolectar(int parcela, Date fechaPlan, int cantRec) {
		// TODO Auto-generated method stub
		String sql="UPDATE PLANTACIONES SET CANTREC="+cantRec+" WHERE PARCELA="+parcela+" AND FECHAPLAN='"+sdf.format(fechaPlan)+"';";
		gbd.updateSQL(sql);

	}
	
	@Override
	public Plantacion getPlantacion(int parcela, Date fechaPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Plantacion> getPlantaciones() {
		ArrayList<Plantacion> lstPlant=new ArrayList<Plantacion>();
		String sql="SELECT * FROM PLANTACIONES";
		// Pedir a la bd todas las plantaciones
		try {
			ResultSet rs=gbd.executeSQL(sql);
			while(rs.next()){
				Integer parcela=rs.getInt("PARCELA");
				//pasar fechaPlan a Date
				Date fechaPlan;				
				fechaPlan = sdf.parse(rs.getString("FECHAPLAN"));				
				//guardar especie
				String especie=rs.getString("ESPECIE");
				//pasar fechaRec a Date
				Date fechaRec=sdf.parse(rs.getString("FECHAREC"));
				//pasar cantPlant a int
				Integer cantPlant=rs.getInt("CANTPLAN");
				//pasar cantRec a int
				Integer cantRec=rs.getInt("CANTREC");	
				//crear plantacion
				Plantacion plant = new Plantacion(parcela,fechaPlan,fechaRec,especie,cantPlant);
				plant.setCantRec(cantRec);
				//añadir la plantacion a la arraylist
				lstPlant.add(plant);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return lstPlant;
	}
		
	@Override
	public ArrayList<Plantacion> getPlanRecoger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getParcelas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getEspecies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarPlantacion(Plantacion plant) {
		String sql="DELETE FROM PLANTACIONES WHERE (PARCELA="+plant.getParcela()+")"+" AND (FECHAPLAN='"+sdf.format(plant.getFechaPlan())+"');";
		gbd.updateSQL(sql);
	}

}
