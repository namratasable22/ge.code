package com.ge.exercise1;

import java.util.Collection;

public abstract class Application {
    private String id;
    private String name;

    public Application(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Collection<User> getUsers();

    public abstract User getUser(String string);

    public abstract Collection<Group> getGroups();

    public abstract Group getGroup(String groupId);

	public boolean isUserMemberOfGroup(User user, String userId) {
		if (userId != null)
		return true;
		else 
		return false;
	}

	public void addUserToGroup(User user, Group defgroup) {
		
		
	}

}
