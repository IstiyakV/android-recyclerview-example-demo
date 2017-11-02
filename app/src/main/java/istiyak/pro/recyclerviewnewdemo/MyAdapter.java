package istiyak.pro.recyclerviewnewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by istiy on 11/3/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    List<ListItem> listItems;
    private Context mContext;

    public MyAdapter(List<ListItem> listItems, Context mContext) {
        this.listItems = listItems;
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_raw,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItem listItem = listItems.get(position);
        holder.notification.setText(listItem.getNotification());
        holder.notificationTime.setText(listItem.getNotificationTime());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }



    public class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView notification;
        public TextView notificationTime;

        public ViewHolder(View itemView) {
            super(itemView);

            notification = (TextView) itemView.findViewById(R.id.tv_notification);
            notificationTime = (TextView) itemView.findViewById(R.id.tv_notificationTime);

        }
    }
}
