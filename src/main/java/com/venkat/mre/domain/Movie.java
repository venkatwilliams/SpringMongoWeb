package com.venkat.mre.domain;

public class Movie {

	private String title;
	private Integer movieId;
	private String genre;
	
	public Movie(Integer movieId, String title, String genre){
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString(){
		return "Movie :"+ this.movieId.toString() + ":" + this.title +":"+ this.genre;
	}
	
	
	
}
