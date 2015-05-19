package ubu.gii.dass.refactoring;

public class NewRelease extends MovieType{

	private int type;
	
	public NewRelease(int type){
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
