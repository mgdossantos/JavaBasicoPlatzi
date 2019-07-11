public class Artigo extends Exemplar {
	
	private String tipoPeriodico;
	private String abstractArtigo;
	private String periodico;
	
	
	public void setTipoPeriodico(String tipoPeriodico){
		this.tipoPeriodico=tipoPeriodico;
	}

	public String getTipoPeriodico(){
		return tipoPeriodico;
	} 
	
	public void setAbstractArtigo(String abstractArtigo){
		this.abstractArtigo=abstractArtigo;
	}

	public String getAbstractArtigo(){
		return abstractArtigo;
	} 

	public void setPeriodico(String periodico){
		this.periodico=periodico;
	}

}
