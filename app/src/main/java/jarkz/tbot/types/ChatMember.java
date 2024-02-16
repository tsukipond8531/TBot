package jarkz.tbot.types;

/**
 * This object contains information about one member of a chat. Currently, the following 6 types of
 * chat members are supported:
 *
 * <p>- ChatMemberOwner
 *
 * <p>- ChatMemberAdministrator
 *
 * <p>- ChatMemberMember
 *
 * <p>- ChatMemberRestricted
 *
 * <p>- ChatMemberLeft
 *
 * <p>- ChatMemberBanned
 */
public sealed interface ChatMember
    permits ChatMemberOwner,
        ChatMemberAdministrator,
        ChatMemberMember,
        ChatMemberRestricted,
        ChatMemberLeft,
        ChatMemberBanned {}
