package github.entity;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class GistFile implements Serializable 
{

	/** serialVersionUID */
	private static final long serialVersionUID = 2067939890126207032L;

	private int size;

	private String content;

	private String filename;

	@SerializedName("raw_url")	
	private String rawUrl;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

	/**
	 * @return size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 * @return this gist file
	 */
	public GistFile setSize(int size) {
		this.size = size;
		return this;
	}

	/**
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 * @return this gist file
	 */
	public GistFile setContent(String content) {
		this.content = content;
		return this;
	}

	/**
	 * @return filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename
	 * @return this gist file
	 */
	public GistFile setFilename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * @return rawUrl
	 */
	public String getRawUrl() {
		return rawUrl;
	}

	/**
	 * @param rawUrl
	 * @return this gist file
	 */
	public GistFile setRawUrl(String rawUrl) {
		this.rawUrl = rawUrl;
		return this;
	}
}
