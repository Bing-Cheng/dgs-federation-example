package com.example.user;

import com.netflix.graphql.dgs.*;
import java.util.Map;

@DgsComponent
public class UserResolver {

    @DgsEntityFetcher(name = "User")
    public User getUser(Map<String, Object> values) {
        return new User((String) values.get("id"), "Alice");
    }

    @DgsQuery
    public User user(@InputArgument(name = "id") String id) {
        return new User(id != null ? id : "default-id", "Alice");
    }
}
