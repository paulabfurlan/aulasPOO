public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioJogo usuario1 = new UsuarioJogo("Paula", "pbfurlan");
		UsuarioJogo usuario2 = new UsuarioJogo("Mariana", "mari");
		
		usuario1.aumentarPontuacao();
		usuario2.aumentarPontuacao();
		
		usuario1.subirNivel();
		usuario2.bonus(5);
		
		System.out.println("Pontuacao de " + usuario1.getNickName() + " é " + usuario1.getPontuacao() + 
				" e o nível é " + usuario1.getNivel());
		System.out.println("Pontuacao de " + usuario2.getNickName() + " é " + usuario2.getPontuacao() + 
				" e o nível é " + usuario2.getNivel());
	}

}
