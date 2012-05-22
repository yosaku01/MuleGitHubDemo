package github.entity;

import java.io.Serializable;

/**
 * Pull request marker model class.
 */
public class PullRequestMarker implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 5052026861072656918L;

	private Repository repo;

	private String label;

	private String ref;

	private String sha;

	private User user;

	/**
	 * @return repo
	 */
	public Repository getRepo() {
		return repo;
	}

	/**
	 * @param repo
	 * @return this marker
	 */
	public PullRequestMarker setRepo(Repository repo) {
		this.repo = repo;
		return this;
	}

	/**
	 * @return label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 * @return this marker
	 */
	public PullRequestMarker setLabel(String label) {
		this.label = label;
		return this;
	}

	/**
	 * @return ref
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * @param ref
	 * @return this marker
	 */
	public PullRequestMarker setRef(String ref) {
		this.ref = ref;
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
	 * @return this marker
	 */
	public PullRequestMarker setSha(String sha) {
		this.sha = sha;
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
	 * @return this marker
	 */
	public PullRequestMarker setUser(User user) {
		this.user = user;
		return this;
	}
}
