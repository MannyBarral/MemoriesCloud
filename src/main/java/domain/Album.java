package domain;

import java.util.Set;

/**
 * @author manuelbarral
 *
 */
public class Album {
	
	private int id;
	
	private String name;
	private Set<Integer> photosIds;
	private String description;
	private Tag AlbumTag;
	
	
	//Empty Constructor
	public Album () {
	}
	
}
