package blog.modelo;

// Generated Oct 24, 2014 1:54:18 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BlogCommentId generated by hbm2java
 */
@Embeddable
public class BlogCommentId implements java.io.Serializable {

	private int id;
	private int userId;

	public BlogCommentId() {
	}

	public BlogCommentId(int id, int userId) {
		this.id = id;
		this.userId = userId;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "user_id", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BlogCommentId))
			return false;
		BlogCommentId castOther = (BlogCommentId) other;

		return (this.getId() == castOther.getId())
				&& (this.getUserId() == castOther.getUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + this.getUserId();
		return result;
	}

}
