package com.example.onlineshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView postsRecyclerview = findViewById(R.id.postRecyclerView);
        postsRecyclerview.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );

        //am preparing the lost of images from the drawables or call it dummy data
        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.image1));
        postItems.add(new PostItem(R.drawable.image10));
        postItems.add(new PostItem(R.drawable.image11));
        postItems.add(new PostItem(R.drawable.image12));
        postItems.add(new PostItem(R.drawable.image13));
        postItems.add(new PostItem(R.drawable.image14));
        postItems.add(new PostItem(R.drawable.image15));
        postItems.add(new PostItem(R.drawable.image16));
        postItems.add(new PostItem(R.drawable.image17));
        postItems.add(new PostItem(R.drawable.image2));
        postItems.add(new PostItem(R.drawable.image3));
        postItems.add(new PostItem(R.drawable.image4));
        postItems.add(new PostItem(R.drawable.image5));
        postItems.add(new PostItem(R.drawable.image6));
        postItems.add(new PostItem(R.drawable.image7));
        postItems.add(new PostItem(R.drawable.image8));
        postItems.add(new PostItem(R.drawable.image9));

        postsRecyclerview.setAdapter(new PostAdapter(postItems));
    }
}
