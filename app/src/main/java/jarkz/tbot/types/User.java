package jarkz.tbot.types;

import java.util.Objects;
import java.util.Optional;

import com.google.gson.annotations.SerializedName;

import jakarta.validation.constraints.NotNull;

public class User {

	@NotNull
	private long id;

	@SerializedName("is_bot")
	@NotNull
	private boolean isBot;

	@SerializedName("first_name")
	@NotNull
	private String firstName;

	@SerializedName("last_name")
	private String lastName;

	private String username;

	@SerializedName("language_code")
	private String languageCode;

	@SerializedName("is_premium")
	private Boolean isPremium;

	@SerializedName("added_to_attachmeht_menu")
	private Boolean addedToAttachmentMenu;

	@SerializedName("can_join_groups")
	private Boolean canJoinGroups;

	@SerializedName("can_read_all_group_messages")
	private Boolean canReadAllGroupMessages;

	@SerializedName("support_inline_queries")
	private Boolean supportInlineQueries;

	public User() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isBot() {
		return isBot;
	}

	public void setBot(boolean isBot) {
		this.isBot = isBot;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Optional<String> getLastName() {
		return Optional.of(lastName);
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Optional<String> getUsername() {
		return Optional.of(username);
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Optional<String> getLanguageCode() {
		return Optional.of(languageCode);
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public Optional<Boolean> isPremium() {
		return Optional.of(isPremium);
	}

	public void setPremium(Boolean isPremium) {
		this.isPremium = isPremium;
	}

	public Optional<Boolean> isAddedToAttachmentMenu() {
		return Optional.of(addedToAttachmentMenu);
	}

	public void setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
		this.addedToAttachmentMenu = addedToAttachmentMenu;
	}

	public Optional<Boolean> isCanJoinGroups() {
		return Optional.of(canJoinGroups);
	}

	public void setCanJoinGroups(Boolean canJoinGroups) {
		this.canJoinGroups = canJoinGroups;
	}

	public Optional<Boolean> isCanReadAllGroupMessages() {
		return Optional.of(canReadAllGroupMessages);
	}

	public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
		this.canReadAllGroupMessages = canReadAllGroupMessages;
	}

	public Optional<Boolean> isSupportInlineQueries() {
		return Optional.of(supportInlineQueries);
	}

	public void setSupportInlineQueries(Boolean supportInlineQueries) {
		this.supportInlineQueries = supportInlineQueries;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,
				isBot,
				firstName,
				lastName,
				username,
				languageCode,
				isPremium,
				addedToAttachmentMenu,
				canJoinGroups,
				canReadAllGroupMessages,
				supportInlineQueries);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User other))
			return false;
		return id == other.id
				&& isBot == other.isBot
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& Objects.equals(username, other.username)
				&& Objects.equals(languageCode, other.languageCode)
				&& Objects.equals(isPremium, other.isPremium)
				&& Objects.equals(addedToAttachmentMenu, other.addedToAttachmentMenu)
				&& Objects.equals(canJoinGroups, other.canJoinGroups)
				&& Objects.equals(canReadAllGroupMessages, other.canReadAllGroupMessages)
				&& Objects.equals(supportInlineQueries, other.supportInlineQueries);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User[id=").append(id)
				.append(", isBot=").append(isBot)
				.append(", firstName=").append(firstName)
				.append(", lastName=").append(lastName)
				.append(", username=").append(username)
				.append(", languageCode=").append(languageCode)
				.append(", isPremium=").append(isPremium)
				.append(", addedToAttachmentMenu=").append(addedToAttachmentMenu)
				.append(", canJoinGroups=").append(canJoinGroups)
				.append(", canReadAllGroupMessages=").append(canReadAllGroupMessages)
				.append(", supportInlineQueries=").append(supportInlineQueries).append("]");
		return builder.toString();
	}
}
