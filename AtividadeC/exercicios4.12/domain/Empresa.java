package domain;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funk;
	
	public Empresa(Funcionario[] fsociety){
		this.funk = fsociety.clone();
	}
	
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void adiciona(Funcionario thugLife){
		if(espacoVazio() >= 0){
			funk[espacoVazio()] = thugLife;
		}else{
			atualiza();
			funk[espacoVazio()] = thugLife;
		}

	}
	public int espacoVazio(){
		for(int i=0;i<funk.length;i++){
			if(funk[i] == null){
				return i;
			}
		}
		return -1;
		
		
	}
	public void atualiza(){
		int tamanho = funk.length;
		Funcionario[] temporario = new Funcionario[tamanho];
		System.arraycopy(funk, 0, temporario, 0, tamanho);
		funk = new Funcionario[tamanho+1];
		System.arraycopy(temporario, 0, funk, 0, temporario.length);
		
	}
	
	public boolean contem(Funcionario qualquer){
		for(int i=0;i<10;i++){
			if(funk[i].equals(qualquer)){
				return true;
			}
		}
		return false;
	}
	public void mostraEmpregados(){
		for(int j=0;j<funk.length;j++){
			System.out.println(funk[j].mostra());
		}
	}
}
