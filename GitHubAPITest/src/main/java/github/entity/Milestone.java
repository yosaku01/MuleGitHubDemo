package github.entity;

import java.io.Serializable;

public class Milestone implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 8017385076255266092L;

	private String createdAt;

	private String dueOn;

	private int closedIssues;

	private int number;

	private int openIssues;

	private String description;

	private String state;

	private String title;

	private String url;

	private User creator;

	

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDueOn() {
		return dueOn;
	}

	public void setDueOn(String dueOn) {
		this.dueOn = dueOn;
	}

	/**
	 * @return closedIssues
	 */
	public int getClosedIssues() {
		return closedIssues;
	}

	/**
	 * @param closedIssues
	 * @return this milestone
	 */
	public Milestone setClosedIssues(int closedIssues) {
		this.closedIssues = closedIssues;
		return this;
	}

	/**
	 * @return number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 * @return this milestone
	 */
	public Milestone setNumber(int number) {
		this.number = number;
		return this;
	}

	/**
	 * @return openIssues
	 */
	public int getOpenIssues() {
		return openIssues;
	}

	/**
	 * @param openIssues
	 * @return this milestone
	 */
	public Milestone setOpenIssues(int openIssues) {
		this.openIssues = openIssues;
		return this;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 * @return this milestone
	 */
	public Milestone setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 * @return this milestone
	 */
	public Milestone setState(String state) {
		this.state = state;
		return this;
	}

	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 * @return this milestone
	 */
	public Milestone setTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this milestone
	 */
	public Milestone setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return creator
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator
	 * @return this milestone
	 */
	public Milestone setCreator(User creator) {
		this.creator = creator;
		return this;
	}
}
