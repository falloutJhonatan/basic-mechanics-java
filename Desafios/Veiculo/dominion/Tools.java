package dominion;

public class Tools {
	
	public static boolean contem(Veiculo[] vaga, String placa){
		for(Veiculo obj: vaga){
			if(obj != null){
				if(obj.getPlaca().equals(placa)){
					return true;
				}
			}
		}
		return false;
		
	}
	
	public static String entrada(Veiculo[] veiculo, Veiculo v){
		for(int i=0;i<10;i++){
			if(veiculo[i] == null){
				veiculo[i] = v;
				return "Entrada liberada na posicao: "+(i+1)+"º";
			}
		}
		return "vaga indisponivel. ";
	}
	
	public static boolean saida(Veiculo[] veiculo, Veiculo v){
		for(int i=0;i<10;i++){
			if(veiculo[i].equals(v)){
				veiculo[i] = null;
				return true;
			}
		}
		return false;
	}
}
