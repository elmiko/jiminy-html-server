package io.radanalytics.jiminy.model;

/**
 * ErrorDAO<br>
 * Standard error POJO
 * 
 * @author Zak Hassan <zhassan@redhat.com>
 *
 */
public final class ErrorDAO {
	private String name;
	private String message;

	public ErrorDAO(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

}
