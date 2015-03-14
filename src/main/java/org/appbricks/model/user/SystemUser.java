package org.appbricks.model.user;

/**
 * Describes an application user is used to
 * to identify a system that requires access
 */
public class SystemUser
    extends User {

    public SystemUser() {
    }

    public SystemUser(String loginName) {
        super(loginName);
    }
}
