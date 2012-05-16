package github.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Repository implements Serializable
{
	
	/** serialVersionUID */
	private static final long serialVersionUID = 406671816413754925L;

	private boolean fork;

	@SerializedName("has_downloads")
	private boolean hasDownloads;

	@SerializedName("has_issues")
	private boolean hasIssues;

	@SerializedName("has_wiki")
	private boolean hasWiki;

	@SerializedName("private")
	private boolean isPrivate;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("pushed_at")
	private String pushedAt;

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getPushedAt() {
		return pushedAt;
	}

	public void setPushedAt(String pushedAt) {
		this.pushedAt = pushedAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@SerializedName("updated_at")
	private String updatedAt;

	private int forks;

	private long id;

	
	@SerializedName("open_issues")
	private int openIssues;

	private int size;
	
	private int watchers;

	private Repository parent;

	private Repository source;

	@SerializedName("clone_url")
	private String cloneUrl;

	private String description;

	private String homepage;

	@SerializedName("git_url")
	private String gitUrl;

	@SerializedName("html_url")
	private String htmlUrl;

	private String language;

	private String masterBranch;

	@SerializedName("mirror_url")
	private String mirrorUrl;

	private String name;

	@SerializedName("ssh_url")
	private String sshUrl;

	@SerializedName("svn_url")
	private String svnUrl;

	private String url;

	private User owner;

	/**
	 * @return fork
	 */
	public boolean isFork() {
		return fork;
	}

	/**
	 * @param fork
	 * @return this repository
	 */
	public Repository setFork(boolean fork) {
		this.fork = fork;
		return this;
	}

	/**
	 * @return hasDownloads
	 */
	public boolean isHasDownloads() {
		return hasDownloads;
	}

	/**
	 * @param hasDownloads
	 * @return this repository
	 */
	public Repository setHasDownloads(boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
		return this;
	}

	/**
	 * @return hasIssues
	 */
	public boolean isHasIssues() {
		return hasIssues;
	}

	/**
	 * @param hasIssues
	 * @return this repository
	 */
	public Repository setHasIssues(boolean hasIssues) {
		this.hasIssues = hasIssues;
		return this;
	}

	/**
	 * @return hasWiki
	 */
	public boolean isHasWiki() {
		return hasWiki;
	}

	/**
	 * @param hasWiki
	 * @return this repository
	 */
	public Repository setHasWiki(boolean hasWiki) {
		this.hasWiki = hasWiki;
		return this;
	}

	/**
	 * @return isPrivate
	 */
	public boolean isPrivate() {
		return isPrivate;
	}

	/**
	 * @param isPrivate
	 * @return this repository
	 */
	public Repository setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
		return this;
	}

	/**
	 * @return forks
	 */
	public int getForks() {
		return forks;
	}

	/**
	 * @param forks
	 * @return this repository
	 */
	public Repository setForks(int forks) {
		this.forks = forks;
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
	 * @return this repository
	 */
	public Repository setOpenIssues(int openIssues) {
		this.openIssues = openIssues;
		return this;
	}

	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 * @return this repository
	 */
	public Repository setSize(int size) {
		this.size = size;
		return this;
	}

	/**
	 * @return watchers
	 */
	public int getWatchers() {
		return watchers;
	}

	/**
	 * @param watchers
	 * @return this repository
	 */
	public Repository setWatchers(int watchers) {
		this.watchers = watchers;
		return this;
	}

	/**
	 * @return parent
	 */
	public Repository getParent() {
		return parent;
	}

	/**
	 * @param parent
	 * @return this repository
	 */
	public Repository setParent(Repository parent) {
		this.parent = parent;
		return this;
	}

	/**
	 * @return source
	 */
	public Repository getSource() {
		return source;
	}

	/**
	 * @param source
	 * @return this repository
	 */
	public Repository setSource(Repository source) {
		this.source = source;
		return this;
	}

	/**
	 * @return cloneUrl
	 */
	public String getCloneUrl() {
		return cloneUrl;
	}

	/**
	 * @param cloneUrl
	 * @return this repository
	 */
	public Repository setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
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
	 * @return this repository
	 */
	public Repository setDescription(String description) {
		this.description = description;
		return this;
	}

	/**
	 * @return homepage
	 */
	public String getHomepage() {
		return homepage;
	}

	/**
	 * @param homepage
	 * @return this repository
	 */
	public Repository setHomepage(String homepage) {
		this.homepage = homepage;
		return this;
	}

	/**
	 * @return gitUrl
	 */
	public String getGitUrl() {
		return gitUrl;
	}

	/**
	 * @param gitUrl
	 * @return this repository
	 */
	public Repository setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
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
	 * @return this repository
	 */
	public Repository setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		return this;
	}

	/**
	 * @return language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 * @return this repository
	 */
	public Repository setLanguage(String language) {
		this.language = language;
		return this;
	}

	/**
	 * @return masterBranch
	 */
	public String getMasterBranch() {
		return masterBranch;
	}

	/**
	 * @param masterBranch
	 * @return this repository
	 */
	public Repository setMasterBranch(String masterBranch) {
		this.masterBranch = masterBranch;
		return this;
	}

	/**
	 * @return mirrorUrl
	 */
	public String getMirrorUrl() {
		return mirrorUrl;
	}

	/**
	 * @param mirrorUrl
	 * @return this repository
	 */
	public Repository setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
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
	 * @return this repository
	 */
	public Repository setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @return sshUrl
	 */
	public String getSshUrl() {
		return sshUrl;
	}

	/**
	 * @param sshUrl
	 * @return this repository
	 */
	public Repository setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
		return this;
	}

	/**
	 * @return svnUrl
	 */
	public String getSvnUrl() {
		return svnUrl;
	}

	/**
	 * @param svnUrl
	 * @return this repository
	 */
	public Repository setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
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
	 * @return this repository
	 */
	public Repository setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return owner
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 * @return this repository
	 */
	public Repository setOwner(User owner) {
		this.owner = owner;
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
	 * @return this repository
	 */
	public Repository setId(long id) {
		this.id = id;
		return this;
	}

}
