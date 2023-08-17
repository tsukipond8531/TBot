package jarkz.tbot.types;

import com.google.gson.annotations.SerializedName;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

public class ReplyKeyboardRemove {

  @SerializedName("remove_keyboard")
  @NotNull
  private boolean removeKeyboard;

  private Boolean selective;

  public ReplyKeyboardRemove() {}

  public boolean isRemoveKeyboard() {
    return removeKeyboard;
  }

  public void setRemoveKeyboard(boolean removeKeyboard) {
    this.removeKeyboard = removeKeyboard;
  }

  public Optional<Boolean> getSelective() {
    return Optional.of(selective);
  }

  public void setSelective(Boolean selective) {
    this.selective = selective;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(removeKeyboard, selective);
  }

  @Override
  public final boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof ReplyKeyboardRemove other)) return false;
    return removeKeyboard == other.removeKeyboard && Objects.equals(selective, other.selective);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder
        .append("ReplyKeyboardRemove[removeKeyboard=")
        .append(removeKeyboard)
        .append(", selective=")
        .append(selective)
        .append("]");
    return builder.toString();
  }
}
