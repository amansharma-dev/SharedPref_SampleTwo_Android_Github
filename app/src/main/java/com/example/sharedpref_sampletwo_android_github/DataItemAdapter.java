package com.example.sharedpref_sampletwo_android_github;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sharedpref_sampletwo_android_github.Model.DataItem;

import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class DataItemAdapter extends RecyclerView.Adapter<DataItemAdapter.ViewHolder> {


    private Context context;
    public List<DataItem> dataItemList;

    public DataItemAdapter(Context context, List<DataItem> dataItemList) {
        this.context = context;
        this.dataItemList = dataItemList;
    }

    @NonNull
    @Override
    public DataItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        SharedPreferences settingPrefs = PreferenceManager.getDefaultSharedPreferences(context);

        boolean grid = settingPrefs.getBoolean(context.getString(R.string.key_settings),false);

        int layoutId = grid ? R.layout.grid_item : R.layout.list_item;

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(layoutId,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {


        DataItem dataItem = dataItemList.get(i);

        SharedPreferences settingPrefs = PreferenceManager.getDefaultSharedPreferences(context);

        boolean grid = settingPrefs.getBoolean(context.getString(R.string.key_settings),false);

        int layoutId = grid ? R.layout.grid_item : R.layout.list_item;

        if(layoutId == R.layout.list_item){

        //load profile image.
        String userProfileImage = dataItem.getProfile_image();
       // InputStream inputStream_profileImage = null;
        try {
            InputStream inputStream_profileImage = context.getAssets().open(userProfileImage);
            Drawable drawable = Drawable.createFromStream(inputStream_profileImage,null);
            viewHolder.userProfileImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //set user name
        viewHolder.username.setText(dataItem.getUser_name());

        //set book image.
        String uploadedBookImage = dataItem.getUploaded_book_image();
       // InputStream inputStream_bookImage = null;
        try {
            InputStream inputStream_bookImage = context.getAssets().open(uploadedBookImage);
            Drawable drawable = Drawable.createFromStream(inputStream_bookImage,null);
            viewHolder.uploadedBook_imageView.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        viewHolder.totalLikes.setText(String.valueOf(dataItem.getNumberOfLikes()));

        viewHolder.userName_description.setText(dataItem.getUser_name_description());
        viewHolder.bookName_description.setText(dataItem.getBook_name_description());

        }
        else{
            //set book image.
            String uploadedBookImage = dataItem.getUploaded_book_image();
            try {
                InputStream inputStream_bookImage = context.getAssets().open(uploadedBookImage);
                Drawable drawable = Drawable.createFromStream(inputStream_bookImage,null);
                viewHolder.uploadedBook_imageView.setImageDrawable(drawable);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public int getItemCount() {
        return dataItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView userProfileImage;
        TextView username;
        ImageView uploadedBook_imageView;
        TextView totalLikes;
        TextView userName_description;
        TextView bookName_description;


        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userProfileImage = itemView.findViewById(R.id.profile_image_circleimageview);
            username = itemView.findViewById(R.id.profile_user_name);
            uploadedBook_imageView = itemView.findViewById(R.id.uploadedbook_image_view);
            totalLikes = itemView.findViewById(R.id.total_likes_textview);
            userName_description = itemView.findViewById(R.id.profile_username_description);
            bookName_description = itemView.findViewById(R.id.book_name_textview);


            view = itemView;
        }
    }
}
