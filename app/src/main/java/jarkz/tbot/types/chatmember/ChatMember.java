package jarkz.tbot.types.chatmember;

import jarkz.tbot.types.annotations.GeneralInterface;

/**
 * This object contains information about one member of a chat. Currently, the following 6 types of
 * chat members are supported:
 *
 * <ul>
 *   <li>{@link ChatMemberOwner}
 *   <li>{@link ChatMemberAdministrator}
 *   <li>{@link ChatMemberMember}
 *   <li>{@link ChatMemberRestricted}
 *   <li>{@link ChatMemberLeft}
 *   <li>{@link ChatMemberBanned}
 * </ul>
 *
 * @author Pavel Bialiauski
 */
@GeneralInterface
public interface ChatMember {

  /**
   * Returns a status of {@link ChatMember}.
   *
   * @return a status.
   */
  String getStatus();
}
