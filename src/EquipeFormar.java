
public class EquipeFormar {

	public static void main(String[] args) {
		Agente agen1 = new Agente(1713375,"Klinsmann", 2017, true);
		Agente agen2 = new Agente(1713334,"Manoel", 2017, true);
		Agente agen3 = new Agente(1713326,"Douglas", 2017, true);
		
		Motorista mot = new Motorista(1713375,"jose", 2017, true);
		
		Viatura vit = new Viatura("223-klb", true);
		
		Destino dest = new Destino("Bom jardim",true);
		
		EquipeFormada equip1 = new EquipeFormada();
		
		
		
		equip1.equipeFormarda(mot, dest, agen1, vit);
		equip1.equipeFormarda(mot, dest, agen1,agen2, vit);
		equip1.equipeFormarda(mot, dest, agen1,agen2,agen3, vit);
		
		
		
		

	}

}
