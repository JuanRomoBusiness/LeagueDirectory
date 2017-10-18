package io.romo.leaguedirectory.summonerspells;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import io.romo.leaguedirectory.R;
import io.romo.leaguedirectory.data.model.SummonerSpell;


public class SummonerSpellsFragment extends Fragment {

    private RecyclerView summonerSpells;
    private SummonerSpellAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_summoner_spells, container, false);

        summonerSpells = v.findViewById(R.id.summoner_spells);

        summonerSpells.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        summonerSpells.setLayoutManager(layoutManager);

        return v;
    }

    private class SummonerSpellHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name;
        private TextView cooldown;
        private TextView requiredSummonerLevel;
        private TextView supportedGameModes;
        private TextView description;

        public SummonerSpellHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_summoner_spell, parent, false));

            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            cooldown = itemView.findViewById(R.id.cooldown);
            requiredSummonerLevel = itemView.findViewById(R.id.required_summoner_level);
            supportedGameModes = itemView.findViewById(R.id.supported_game_modes);
            description = itemView.findViewById(R.id.description);
        }

        public void bindSummonerSpell(SummonerSpell summonerSpell) {

        }
    }

    private class SummonerSpellAdapter extends RecyclerView.Adapter<SummonerSpellHolder> {

        private List<SummonerSpell> summonerSpells;

        public SummonerSpellAdapter(List<SummonerSpell> summonerSpells) {
            this.summonerSpells = summonerSpells;
        }

        @Override
        public SummonerSpellHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new SummonerSpellHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(SummonerSpellHolder holder, int position) {
            SummonerSpell summonerSpell = summonerSpells.get(position);
            holder.bindSummonerSpell(summonerSpell);
        }

        @Override
        public int getItemCount() {
            return summonerSpells == null ? 0 : summonerSpells.size();
        }
    }
}
