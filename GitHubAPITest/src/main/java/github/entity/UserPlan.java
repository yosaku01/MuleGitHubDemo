package github.entity;

import java.io.Serializable;

public class UserPlan implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 4759542049129654659L;

	private int collaborators;

	private int privateRepos;

	private int space;

	private String name;

	/**
	 * @return collaborators
	 */
	public int getCollaborators() {
		return collaborators;
	}

	/**
	 * @param collaborators
	 * @return this user plan
	 */
	public UserPlan setCollaborators(int collaborators) {
		this.collaborators = collaborators;
		return this;
	}

	/**
	 * @return privateRepos
	 */
	public int getPrivateRepos() {
		return privateRepos;
	}

	/**
	 * @param privateRepos
	 * @return this user plan
	 */
	public UserPlan setPrivateRepos(int privateRepos) {
		this.privateRepos = privateRepos;
		return this;
	}

	/**
	 * @return space
	 */
	public int getSpace() {
		return space;
	}

	/**
	 * @param space
	 * @return this user plan
	 */
	public UserPlan setSpace(int space) {
		this.space = space;
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
	 * @return this user plan
	 */
	public UserPlan setName(String name) {
		this.name = name;
		return this;
	}
}
