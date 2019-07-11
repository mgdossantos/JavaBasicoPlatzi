public class Principal{
		public static void main (String args[]){
		
		Artigo artigo = new Artigo();
		Livro livro = new Livro();
		artigo.setAutor("Marcela Santos");
		System.out.println(artigo.getAutor());

		livro.setTitulo("Girl in the ice");
		System.out.println(livro.getTitulo());

	}
}