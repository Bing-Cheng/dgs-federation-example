package com.example.order;

import com.netflix.graphql.dgs.*;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.Map;

@DgsComponent
public class OrderResolver {
    @DgsEntityFetcher(name = "User")
    public User user(Map<String, Object> values) {
        String userId = (String) values.get("id");
        User user = new User(userId);
        return user;
    }

    @DgsData(parentType = "User", field = "orders")
    public List<Order> orders(DgsDataFetchingEnvironment dfe) {
        User user = dfe.getSource();
        // Fetch orders for user
        return List.of(new Order("order1", "Product A", 1, user.id()));
    }
}
