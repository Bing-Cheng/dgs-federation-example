package com.example.order;

import com.netflix.graphql.dgs.*;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.Map;

@DgsComponent
public class OrderResolver {

    @DgsData(parentType = "User", field = "orders")
    public List<Order> getOrders(DgsDataFetchingEnvironment dfe) {
        User user = dfe.getSource();
        String userId = user.id();
        if (userId == null) {
            throw new RuntimeException("User ID is required");
        }
        return List.of(new Order("order1", "Book", 1, userId), new Order("order2", "Pen", 2, userId));
    }
}
