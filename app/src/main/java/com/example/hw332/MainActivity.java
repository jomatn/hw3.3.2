package com.example.hw332;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = generateUserList();
        userAdapter = new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);
        userAdapter = new UserAdapter(userList);
    }

    private List<User> generateUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        userList.add(new User("Jake", "123456789"));
        return userList;
    }
}
