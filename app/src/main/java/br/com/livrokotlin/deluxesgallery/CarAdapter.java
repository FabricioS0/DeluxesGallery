package br.com.livrokotlin.deluxesgallery;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

public class CarAdapter extends BaseAdapter {
    private Context context;
    private List<Car> cars;
    private LayoutInflater inflater;

    public CarAdapter(Context context, List<Car> cars) {
        this.context = context;
        this.cars = cars;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.car_grid_item, parent, false);
            holder = new ViewHolder();
            holder.carImage = convertView.findViewById(R.id.carImage);
            holder.btnDetails = convertView.findViewById(R.id.btnDetails);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Car car = cars.get(position);
        holder.carImage.setImageResource(car.getImageResourceId());
        
        holder.btnDetails.setOnClickListener(v -> {
            Intent intent = new Intent(context, CarDetailsActivity.class);
            intent.putExtra("car", car);
            context.startActivity(intent);
        });

        return convertView;
    }

    static class ViewHolder {
        ImageView carImage;
        Button btnDetails;
    }
}