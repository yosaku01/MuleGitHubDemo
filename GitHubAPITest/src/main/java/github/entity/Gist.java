package github.entity;

import com.google.gson.annotations.SerializedName;


import java.io.Serializable;
import java.util.Map;


public class Gist implements Serializable
{
	/** serialVersionUID */
	private static final long serialVersionUID = -2221817463228217456L;

	@SerializedName("public")
	private boolean isPublic;

	@SerializedName("created_at")
	private String created_at;

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
	
	
	public String getGit_pull_url() {
		return git_pull_url;
	}

	public void setGit_pull_url(String git_pull_url) {
		this.git_pull_url = git_pull_url;
	}

	public String getGit_push_url() {
		return git_push_url;
	}

	public void setGit_push_url(String git_push_url) {
		this.git_push_url = git_push_url;
	}

	@SerializedName("updated_at")	
	private String updated_at;

	private int comments;	

	private Map<String, GistFile> files;

	private String description;

	@SerializedName("git_pull_url")
	private String git_pull_url;
	@SerializedName("git_push_url")
	private String git_push_url;
	
	@SerializedName("html_url")	
	private String htmlUrl;

	private String id;

	private String url;

	private User user;

	/**
	 * @return isPublic
	 */
	public boolean isPublic() {
		return isPublic;
	}

	/**
	 * @param isPublic
	 * @return this gist
	 */
	public Gist setPublic(boolean isPublic) {
		this.isPublic = isPublic;
		return this;
	}

	/**
	 * @return comments
	 */
	public int getComments() {
		return comments;
	}

	/**
	 * @param comments
	 * @return this gist
	 */
	public Gist setComments(int comments) {
		this.comments = comments;
		return this;
	}
	
	/**
	 * @return files
	 */
	public Map<String, GistFile> getFiles() {
		return files;
	}

	/**
	 * @param files
	 * @return this gist
	 */
	public Gist setFiles(Map<String, GistFile> files) {
		this.files = files;
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
	 * @return this gist
	 */
	public Gist setDescription(String description) {
		this.description = description;
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
	 * @return this gist
	 */
	public Gist setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this gist
	 */
	public Gist setId(String id) {
		this.id = id;
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
	 * @return this gist
	 */
	public Gist setUrl(String url) {
		this.url = url;
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
	 * @return this gist
	 */
	public Gist setUser(User user) {
		this.user = user;
		return this;
	}
}
