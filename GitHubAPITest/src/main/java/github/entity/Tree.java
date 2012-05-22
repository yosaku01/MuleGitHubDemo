package github.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Tree model class
 */
public class Tree implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 6518261551932913340L;

	private List<TreeEntry> tree;

	private String sha;

	private String url;

	/**
	 * @return tree
	 */
	public List<TreeEntry> getTree() {
		return tree;
	}

	/**
	 * @param tree
	 * @return this tree
	 */
	public Tree setTree(List<TreeEntry> tree) {
		this.tree = tree;
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
	 * @return this tree
	 */
	public Tree setSha(String sha) {
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
	 * @return this tree
	 */
	public Tree setUrl(String url) {
		this.url = url;
		return this;
	}
}
