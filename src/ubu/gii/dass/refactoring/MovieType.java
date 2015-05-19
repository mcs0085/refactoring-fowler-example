package ubu.gii.dass.refactoring;

public abstract class MovieType {
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	public static final int CHILDRENS = 2;
	
	public abstract int getMovieType();
	
	public abstract void setMovieType(int type);
}
