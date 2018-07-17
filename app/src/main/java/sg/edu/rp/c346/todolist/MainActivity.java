package sg.edu.rp.c346.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;

    ArrayList<MovieItem> alMovieList;

    CustomAdapter caMovie;

    Calendar date1;

    Calendar date2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        date2 = Calendar.getInstance();
        date2.set(2018,9,22);



        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        MovieItem movie1 = new MovieItem("MSA",date1);
        alMovieList.add(movie1);
        MovieItem movie2 = new MovieItem("Go for haircut",date2);
        alMovieList.add(movie2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);


    }



}
