package main;

public class YelpUser {
	
	public int id;
	public int num_review;
	public int avg_stars;
	public int useful;
	public int funny;
	public int cool;
	
	public YelpUser(int i, int n, int a, int u, int f, int c) {
		id = i;
		num_review = n;
		avg_stars = a;
		useful = u;
		funny = f;
		cool = c;
	}

}
