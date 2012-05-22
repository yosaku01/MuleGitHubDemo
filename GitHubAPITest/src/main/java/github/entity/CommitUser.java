package github.entity;

import java.io.Serializable;

/**
 * Commit user model class
 */
public class CommitUser implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -180887492938484405L;

	private String date;

	private String email;

	private String name;

	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return this commit user
	 */
	public CommitUser setEmail(String email) {
		this.email = email;
		return this;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @return this commit user
	 */
	public CommitUser setName(String name) {
		this.name = name;
		return this;
	}
}
