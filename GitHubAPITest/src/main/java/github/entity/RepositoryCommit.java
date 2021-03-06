package github.entity;

import java.io.Serializable;
import java.util.List;

public class RepositoryCommit implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -8911733018395257250L;

	private Commit commit;

	private CommitStats stats;

	private List<Commit> parents;

	private List<CommitFile> files;

	private String sha;

	private String url;

	private User author;

	private User committer;

	/**
	 * @return commit
	 */
	public Commit getCommit() {
		return commit;
	}

	/**
	 * @param commit
	 * @return this commit
	 */
	public RepositoryCommit setCommit(Commit commit) {
		this.commit = commit;
		return this;
	}

	/**
	 * @return stats
	 */
	public CommitStats getStats() {
		return stats;
	}

	/**
	 * @param stats
	 * @return this commit
	 */
	public RepositoryCommit setStats(CommitStats stats) {
		this.stats = stats;
		return this;
	}

	/**
	 * @return parents
	 */
	public List<Commit> getParents() {
		return parents;
	}

	/**
	 * @param parents
	 * @return this commit
	 */
	public RepositoryCommit setParents(List<Commit> parents) {
		this.parents = parents;
		return this;
	}

	/**
	 * @return files
	 */
	public List<CommitFile> getFiles() {
		return files;
	}

	/**
	 * @param files
	 * @return this commit
	 */
	public RepositoryCommit setFiles(List<CommitFile> files) {
		this.files = files;
		return this;
	}

	/**
	 * @return sha
	 */
	public String getSha() {
		return sha;
	}

	/**
	 * @param sha
	 * @return this commit
	 */
	public RepositoryCommit setSha(String sha) {
		this.sha = sha;
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
	 * @return this commit
	 */
	public RepositoryCommit setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return author
	 */
	public User getAuthor() {
		return author;
	}

	/**
	 * @param author
	 * @return this commit
	 */
	public RepositoryCommit setAuthor(User author) {
		this.author = author;
		return this;
	}

	/**
	 * @return committer
	 */
	public User getCommitter() {
		return committer;
	}

	/**
	 * @param committer
	 * @return this commit
	 */
	public RepositoryCommit setCommitter(User committer) {
		this.committer = committer;
		return this;
	}
}
