package github.entity;


import github.entity.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Issue implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 6358575015023539051L;

	public String getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(String closedAt) {
		this.closedAt = closedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	private long id;
	
	@SerializedName("closed_at")
	private String closedAt;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("updated_at")
	private String updatedAt;

	private int comments;

	private int number;

	private List<Label> labels;

	private Milestone milestone;
	
	@SerializedName("pull_request")	
	private PullRequest pullRequest;

	private String body;

	private String bodyHtml;

	private String bodyText;
	
	@SerializedName("html_url")	
	private String htmlUrl;

	private String state;

	private String title;

	private String url;

	private User assignee;

	private User user;

	
	/**
	 * @return comments
	 */
	public int getComments() {
		return comments;
	}

	/**
	 * @param comments
	 * @return this issue
	 */
	public Issue setComments(int comments) {
		this.comments = comments;
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
	 * @return this issue
	 */
	public Issue setNumber(int number) {
		this.number = number;
		return this;
	}

	/**
	 * @return labels
	 */
	public List<Label> getLabels() {
		return labels;
	}

	/**
	 * @param labels
	 * @return this issue
	 */
	public Issue setLabels(List<Label> labels) {
		this.labels = labels != null ? new ArrayList<Label>(labels) : null;
		return this;
	}

	/**
	 * @return milestone
	 */
	public Milestone getMilestone() {
		return milestone;
	}

	/**
	 * @param milestone
	 * @return this issue
	 */
	public Issue setMilestone(Milestone milestone) {
		this.milestone = milestone;
		return this;
	}

	/**
	 * @return pullRequest
	 */
	public PullRequest getPullRequest() {
		return pullRequest;
	}

	/**
	 * @param pullRequest
	 * @return this issue
	 */
	public Issue setPullRequest(PullRequest pullRequest) {
		this.pullRequest = pullRequest;
		return this;
	}

	/**
	 * @return body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 * @return this issue
	 */
	public Issue setBody(String body) {
		this.body = body;
		return this;
	}

	/**
	 * @return bodyHtml
	 */
	public String getBodyHtml() {
		return bodyHtml;
	}

	/**
	 * @param bodyHtml
	 * @return this issue
	 */
	public Issue setBodyHtml(String bodyHtml) {
		this.bodyHtml = bodyHtml;
		return this;
	}

	/**
	 * @return bodyText
	 */
	public String getBodyText() {
		return bodyText;
	}

	/**
	 * @param bodyText
	 * @return this issue
	 */
	public Issue setBodyText(String bodyText) {
		this.bodyText = bodyText;
		return this;
	}

	/**
	 * @return htmlUrl
	 */
	public String getHtmlUrl() {
		return htmlUrl;
	}

	/**
	 * @param htmlUrl
	 * @return this issue
	 */
	public Issue setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
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
	 * @return this issue
	 */
	public Issue setState(String state) {
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
	 * @return this issue
	 */
	public Issue setTitle(String title) {
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
	 * @return this issue
	 */
	public Issue setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return assignee
	 */
	public User getAssignee() {
		return assignee;
	}

	/**
	 * @param assignee
	 * @return this issue
	 */
	public Issue setAssignee(User assignee) {
		this.assignee = assignee;
		return this;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 * @return this issue
	 */
	public Issue setUser(User user) {
		this.user = user;
		return this;
	}

	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this issue
	 */
	public Issue setId(long id) {
		this.id = id;
		return this;
	}

	@Override
	public String toString() {
		return "Issue " + number; //$NON-NLS-1$
	}
}
