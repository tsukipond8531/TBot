package jarkz.tbot.types.games;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jarkz.tbot.types.User;

public class GameHighScore {

	@NotNull
	private int position;

	@NotNull
	private User user;

	@NotNull
	private int score;

	public GameHighScore() {
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position, user, score);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof GameHighScore other))
			return false;
		return position == other.position
				&& Objects.equals(user, other.user)
				&& score == other.score;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GameHighScore[position=").append(position)
				.append(", user=").append(user)
				.append(", score=").append(score).append("]");
		return builder.toString();
	}
}
