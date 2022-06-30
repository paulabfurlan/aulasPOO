package aula29062022;

public class FabricaReparos implements Criador
{
	private static FabricaReparos instance;
	
	private FabricaReparos(){};
	
    public static FabricaReparos getInstance(){
        if (instance == null){
            instance = new FabricaReparos();
        }
        return instance;
    }
	
	@Override
	public Reparo criarReparo(String nome, String endereco) 
	{
		return new Reparo(nome, endereco);
	}

}
