package ubu.gii.dass.refactoring;

public class Regular extends MovieType{

	private int type;
	
	public Regular(int type){
		this.type=type;
	}

	@Override
	public int getMovieType() {
		return type;
	}

	@Override
	public void setMovieType(int type) {
		this.type=type;
		
	}

}
