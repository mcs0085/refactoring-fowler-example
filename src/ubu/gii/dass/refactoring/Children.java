package ubu.gii.dass.refactoring;

public class Children extends MovieType{

	private int type;
	
	public Children(int type){
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
