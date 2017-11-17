package com.example.dell.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private ArrayList<Word> mArrayList;
    private Context mContext;
    private int mBackgroundColorResourceId;

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.numbers_list_view, parent, false);
        }
        Word currentWord = (Word) getItem(position);
        ((TextView) listItemView.findViewById(R.id.miwok_word)).setText(currentWord.getMiwokTranslation());
        ((TextView) listItemView.findViewById(R.id.default_word)).setText(currentWord.getDefaultTranslation());
        ImageView image = (ImageView) listItemView.findViewById(R.id.list_item_image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getmImageResourceId());
        } else {
            image.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.list_item_text);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mBackgroundColorResourceId));
        return listItemView;
    }

    public WordAdapter(Activity context, ArrayList<Word> words, int backgroundColorResourceId) {
        super(context, 0, words);
        mBackgroundColorResourceId = backgroundColorResourceId;
    }
}
