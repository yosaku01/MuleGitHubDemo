package github.entity;

import java.io.Serializable;

public class CommitStats implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = -4398346227258322028L;

	private int additions;

	private int deletions;

	private int total;

	/**
	 * @return additions
	 */
	public int getAdditions() {
		return additions;
	}

	/**
	 * @param additions
	 * @return this commit stats
	 */
	public CommitStats setAdditions(int additions) {
		this.additions = additions;
		return this;
	}

	/**
	 * @return deletions
	 */
	public int getDeletions() {
		return deletions;
	}

	/**
	 * @param deletions
	 * @return this commit stats
	 */
	public CommitStats setDeletions(int deletions) {
		this.deletions = deletions;
		return this;
	}

	/**
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 * @return this commit stats
	 */
	public CommitStats setTotal(int total) {
		this.total = total;
		return this;
	}
}
