package com.example.android.novellite;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button search = (Button) findViewById(R.id.search);
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    EditText searchText = (EditText) findViewById(R.id.search_text);
                    if (searchText.getText() == null || "".equals(searchText.getText().toString())){
                        ListView lv = (ListView) findViewById(R.id.list);
                        lv.setEmptyView(findViewById(R.id.empty_text));
                        lv.setAdapter (new ArrayAdapter<String>(
                                MainActivity.this,
                                R.layout.list_item,
                                R.id.text_1));
                        TextView noSearchParams = (TextView) findViewById(R.id.empty_text);
                        noSearchParams.setText(R.string.no_search_param);


                    }else {
                    String searchString = searchText.getText().toString();

                    FetchData fetch = new FetchData();

                    // Get a reference to the ConnectivityManager to check state of network connectivity
                    ConnectivityManager connMgr = (ConnectivityManager)
                            getSystemService(Context.CONNECTIVITY_SERVICE);

                    // Get details on the currently active default data network
                    NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
                    // If there is a network connection, fetch data
                    if (networkInfo != null && networkInfo.isConnected()) {
                    AsyncTask<String, Void, ArrayList<ResultStrs>> getJsonData = fetch.execute(searchString);
                    try {
                        ListView lv = (ListView) findViewById(R.id.list);
                        lv.setEmptyView(findViewById(R.id.empty_text));
                        String[] authors = new String[getJsonData.get().size()];
                        for (int i = 0; i < getJsonData.get().size(); i++) {
                            authors[i] = "Name: " + String.valueOf(getJsonData.get().get(i).getTitle()) + "\n" +
                                    "Author: " + String.valueOf(getJsonData.get().get(i).getAuthor()) + "\n" +
                                    "Publisher: " + String.valueOf(getJsonData.get().get(i).getPublisher());
                        }
                        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                                MainActivity.this,
                                R.layout.list_item,
                                R.id.text_1,
                                authors);
                        lv.setAdapter(arrayAdapter);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }



                }
                    {
                        if (networkInfo == null) {
                            TextView noNetConnection = (TextView) findViewById(R.id.empty_text);
                            noNetConnection.setText(R.string.no_net_connection);
                        }
                    }
                    }}


                });




    }
}
