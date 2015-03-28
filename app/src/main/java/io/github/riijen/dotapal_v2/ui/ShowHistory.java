package io.github.riijen.dotapal_v2.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;

import io.github.riijen.dotapal_v2.R;
import io.github.riijen.dotapal_v2.model.Match;
import io.github.riijen.dotapal_v2.model.MatchHistory;
import io.github.riijen.dotapal_v2.model.Player;
import io.github.riijen.dotapal_v2.utils.Urls;

/**
 * Created by kanghee on 3/28/2015.
 */
public class ShowHistory extends Activity {

    private String playerID;
    private ListView listView;
    private ListViewAdapter adapter;
    private MatchHistory matchHistory;
    private ArrayList<Match> matchArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_history);
        playerID = getIntent().getExtras().getString("playerID");
        TextView testView = (TextView) findViewById(R.id.testView);
        testView.setText(playerID);
        init();
    }
    private void init () {

        refreshList();
        HashMap<String, Match> testMap = new HashMap<>();
        List<Player> testPlayers = new ArrayList<>();
        testPlayers.add(new Player("555", "444"));
        matchArray = new ArrayList<>();
        matchArray.add(new Match("1234", testPlayers, testPlayers, "Ranked"));
        matchArray.add(new Match("5234", testPlayers, testPlayers, "Casual"));
        listView = (ListView) findViewById(R.id.matchHistoryListView);
        adapter = new ListViewAdapter(this, matchArray);
        listView.setAdapter(adapter);

    }

    public ArrayList<Match> refreshList () {
        // Load files from system to an array

        return matchArray;
    }

    // Inner class extending ArrayAdapter for ListView
    public class ListViewAdapter extends ArrayAdapter<Match> {

        final private Context context;
        private ArrayList<Match> matchList = new ArrayList();

        public ListViewAdapter(Context context, ArrayList<Match> objects) {
            super(context, R.layout.listview_show_matches, objects);
            this.context = context;
            matchList.addAll(objects);
        }
        public ArrayList<Match> getMatchList() {
            return matchList;
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            Match currentMatch = matchList.get(position);
            // Always get LayoutInflater instead of instantiating it
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.listview_match_item, parent, false);
            final ImageView heroImageView = (ImageView) rowView.findViewById(R.id.imageView);
            final TextView heroTextView = (TextView) rowView.findViewById(R.id.heroTextView);
            final TextView wLTextView = (TextView) rowView.findViewById(R.id.winLossTextView);
            final TextView gameTypeTextView = (TextView) rowView.findViewById(R.id.gameTypeTextView);
            final TextView durationTextView = (TextView) rowView.findViewById(R.id.durationTextView);
            final TextView kdaTextView = (TextView) rowView.findViewById(R.id.kdaTextView);

            Picasso.with(getContext()).load(Urls.getHeroUrl(currentMatch.getPlayer(playerID).getHeroID(), "small")).into(heroImageView);
            heroTextView.setText(currentMatch.getPlayer(playerID).getHeroID());
            if (currentMatch.hasWon(playerID)) {
                wLTextView.setText("Win");
            } else {
                wLTextView.setText("Loss");
            }
            gameTypeTextView.setText(currentMatch.getLobbyType());
            durationTextView.setText(currentMatch.getDuration());
            kdaTextView.setText(currentMatch.getKda(playerID));
            rowView.setOnClickListener(new MatchClickListener(currentMatch));
            return rowView;
        }

        // OnClickListener for starting new activity with given deck
        public class MatchClickListener implements View.OnClickListener {

            private Match match;

            public MatchClickListener(Match match) {
                this.match = match;
            }

            public void onClick(View view) {
                // do stuff
            }
        }
    }
}
