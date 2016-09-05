package com.hand.db;

public class Film extends EntityWithID{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String description;
	private int language_id;
	@Override
	public void setID(long ID) {
		this.ID=ID;
		
	}
	@Override
	public long getID() {
		return this.ID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public void setFilm_id(long ID){
		this.ID=ID;
	}
	public Long getFilm_id(){
		return this.ID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "File [ID=" + ID + ", title=" + title + ", description=" + description +
				 ", language_id=" + language_id;
	}
	public void setLanguage_id(String input) {
		// TODO Auto-generated method stub
		
	}
	
	
}
