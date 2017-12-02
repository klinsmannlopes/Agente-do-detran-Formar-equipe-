
public class EquipeFormada {
	public void equipeFormarda(Motorista mot,Destino dest,Agente agente,Viatura viatura){
		if(mot.getAssociado() == true && dest.getAssociado()==true && agente.getAssociado() == true && viatura.getAssociado() == true){
			System.out.println("motorista");
			System.out.println("nome: " + mot.getNome() +"\n" +"matricula: "  + mot.getNumMatricula() +"\n" + "ano de admição: "
			+ mot.getAnoDeAdmicao() 
					);
			System.out.println("Agente");
			System.out.println("nome: " + agente.getNome() +"\n" +"matricula: "  + agente.getNumMatricula() +"\n" + "ano de admição: "
			+ agente.getAnoDeAdmicao() 
					);
			System.out.println("Destino: "+ dest.getDestino());
			System.out.println("viatura");
			System.out.println("placa:" + viatura.getPlaca());
					
			
		} if(mot.getAssociado() == false){
			System.out.println("motorista esta alocado em outra equipe");
		} if(dest.getAssociado()==false){
			System.out.println("Destino esta alocado em outra equipe");
		} if( agente.getAssociado() == false){
			System.out.println("agente esta alocado em outra equipe");
		} if(viatura.getAssociado() == false){
			System.out.println("viatura esta alocada em outra equipe");
		}
	}
	public void equipeFormarda(Motorista mot,Destino dest,Agente agente1,Agente agente2,Viatura viatura){
		if(mot.getAssociado() == true && dest.getAssociado()==true && agente1.getAssociado() == true && agente2.getAssociado() == true && viatura.getAssociado() == true){
			System.out.println("motorista");
			System.out.println("nome: " + mot.getNome() +"\n" +"matricula: "  + mot.getNumMatricula() +"\n" + "ano de admição: "
			+ mot.getAnoDeAdmicao() 
					);
			System.out.println("Agente 1");
			System.out.println("nome: " + agente1.getNome() +"\n" +"matricula: "  + agente1.getNumMatricula() +"\n" + "ano de admição: "
			+ agente1.getAnoDeAdmicao() 
					);
			System.out.println("Agente 2");
			System.out.println("nome: " + agente2.getNome() +"\n" +"matricula: "  + agente2.getNumMatricula() +"\n" + "ano de admição: "
			+ agente2.getAnoDeAdmicao() 
					);
			System.out.println("Destino: "+ dest.getDestino());
			System.out.println("viatura");
			System.out.println("placa:" + viatura.getPlaca());
					
			
		} if(mot.getAssociado() == false){
			System.out.println("motorista esta alocado em outra equipe");
		} if(dest.getAssociado()==false){
			System.out.println("Destino esta alocado em outra equipe");
		} if(viatura.getAssociado()){
			System.out.println("viatura esta alocada em outra equipe");
		}
		if( agente1.getAssociado() == false){
			System.out.println("agente 1 esta alocado em outra equipe");
		} if(agente2.getAssociado() == false){
			System.out.println("agente 2 esta alocado em outra equipe");
		}  if(viatura.getAssociado() == false){
			System.out.println("viatura esta alocada em outra equipe");
		}
	}
	
	public void equipeFormarda(Motorista mot,Destino dest,Agente agente1,Agente agente2,Agente agente3,Viatura viatura){
		if(mot.getAssociado() == true && dest.getAssociado()==true && agente1.getAssociado() == true && agente2.getAssociado() == true 
			&& agente3.getAssociado() ==true	&& viatura.getAssociado() == true){
			System.out.println("motorista");
			System.out.println("nome: " + mot.getNome() +"\n" +"matricula: "  + mot.getNumMatricula() +"\n" + "ano de admição: "
			+ mot.getAnoDeAdmicao() 
					);
			System.out.println("Agente 1");
			System.out.println("nome: " + agente1.getNome() +"\n" +"matricula: "  + agente1.getNumMatricula() +"\n" + "ano de admição: "
			+ agente1.getAnoDeAdmicao() 
					);
			System.out.println("Agente 2");
			System.out.println("nome: " + agente2.getNome() +"\n" +"matricula: "  + agente2.getNumMatricula() +"\n" + "ano de admição: "
			+ agente2.getAnoDeAdmicao() 
					);
			System.out.println("Agente 3");
			System.out.println("nome: " + agente3.getNome() +"\n" +"matricula: "  + agente3.getNumMatricula() +"\n" + "ano de admição: "
			+ agente3.getAnoDeAdmicao() 
					);
			System.out.println("Destino: "+ dest.getDestino());
			System.out.println("viatura");
			System.out.println("placa:" + viatura.getPlaca());
					
			
		} if(mot.getAssociado() == false){
			System.out.println("motorista esta alocado em outra equipe");
		} if(dest.getAssociado()==false){
			System.out.println("Destino esta alocado em outra equipe");
		} if(viatura.getAssociado()){
			System.out.println("viatura esta alocada em outra equipe");
		}
		if( agente1.getAssociado() == false){
			System.out.println("agente 1 esta alocado em outra equipe");
		} if(agente2.getAssociado() == false){
			System.out.println("agente 2 esta alocado em outra equipe");
		} if(agente3.getAssociado() == false){
			System.out.println("agente 3 esta alocado em outra equipe");
		} if(viatura.getAssociado() == false){
			System.out.println("viatura esta alocada em outra equipe");
		}
	}
	}

