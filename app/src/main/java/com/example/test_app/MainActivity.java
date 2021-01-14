package com.example.test_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button rechargeable;
    String all_combine;
    Button fridge;
    Button freezer;
    Button washing_machine;
    Button dryer;
    Button dishwasher;
    Button stove;
    Button ac;
    Button microwave;
    Button dehumidifier;
    Button r_vacuum;
    Button s_vacuum;
    Button uc_vacuum;
    Button fan;
    Button landline;
    Button mobile;
    Button desktop;
    Button laptop;
    Button printer;
    Button scanner;
    Button photocopier;
    Button fax;
    Button mice;
    Button tablet;
    Button monitor;
    Button iwatch;
    Button external_hd;
    Button router;
    Button switches;
    Button hubs;
    Button racks;
    Button servers;
    Button plasma;
    Button led_tv;
    Button lcd_tv;
    Button portable;
    Button tube;
    Button speaker_system;
    Button pc_speaker;
    Button stereo;
    Button dvd_cd;
    Button mp3;
    Button alarm;
    Button charger;
    Button cfl;
    Button fluorescent;
    Button led_light;
    Button game_console;
    Button game;
    Button portable_lcd;
    Button portable_gaming;
    Button keyboard;
    Button controller;
    Button set_top_box;
    Button in_dash;
    Button portable_gps;
    Button outdoor;
    Button security;
    Button ink;
    Button car;
    Button button_battery;
    Button household;
    Button acid;
    Button camcorder;
    Button memory_card;
    Button dig_cam;
    Button lens;
    Button dig_frame;
    Button slr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rechargeable = findViewById(R.id.rechargeable_battery);
        fridge = findViewById(R.id.refrigerator);
        freezer = findViewById(R.id.freezer);
        washing_machine = findViewById(R.id.washing_machine);
        dryer = findViewById(R.id.dryer);
        dishwasher = findViewById(R.id.dishwasher);
        stove = findViewById(R.id.kitchen_stove);
        ac = findViewById(R.id.air_conditioner);
        microwave = findViewById(R.id.microwave);
        dehumidifier = findViewById(R.id.dehumidifier);
        r_vacuum = findViewById(R.id.robot_vacuum);
        s_vacuum = findViewById(R.id.stick_vacuum);
        uc_vacuum = findViewById(R.id.uc_vacuum);
        fan = findViewById(R.id.fan);
        landline = findViewById(R.id.landline);
        mobile = findViewById(R.id.mobile);
        desktop = findViewById(R.id.desktop);
        laptop = findViewById(R.id.laptop);
        printer = findViewById(R.id.printer);
        scanner = findViewById(R.id.scanner);
        photocopier = findViewById(R.id.photocopier);
        fax = findViewById(R.id.fax);
        mice = findViewById(R.id.mouse);
        tablet = findViewById(R.id.tablet);
        monitor = findViewById(R.id.monitor);
        iwatch = findViewById(R.id.watch);
        external_hd = findViewById(R.id.external_hd);
        router = findViewById(R.id.router);
        switches = findViewById(R.id.switches);
        hubs = findViewById(R.id.hub);
        racks = findViewById(R.id.racks);
        servers = findViewById(R.id.server);
        plasma = findViewById(R.id.plasma);
        led_tv = findViewById(R.id.led_tv);
        lcd_tv = findViewById(R.id.lcd);
        portable = findViewById(R.id.portable);
        tube = findViewById(R.id.tube);
        speaker_system = findViewById(R.id.speaker);
        pc_speaker = findViewById(R.id.pc_speaker);
        stereo = findViewById(R.id.stereo);
        dvd_cd = findViewById(R.id.dvd_cd);
        mp3 = findViewById(R.id.mp3);
        alarm = findViewById(R.id.alarm);
        charger = findViewById(R.id.charger);
        cfl = findViewById(R.id.cfl);
        fluorescent = findViewById(R.id.fluorescent);
        led_light = findViewById(R.id.led_light);
        game_console = findViewById(R.id.video_game_console);
        game = findViewById(R.id.games);
        portable_lcd = findViewById(R.id.portable_lcd);
        portable_gaming = findViewById(R.id.portable_gaming);
        keyboard = findViewById(R.id.keyboard);
        controller = findViewById(R.id.controller);
        set_top_box = findViewById(R.id.set_top_box);
        in_dash = findViewById(R.id.in_dash);
        portable_gps = findViewById(R.id.portable_gps);
        outdoor = findViewById(R.id.outdoor);
        security = findViewById(R.id.security);
        ink = findViewById(R.id.ink_cartridge);
        car = findViewById(R.id.car_battery);
        button_battery = findViewById(R.id.button_battery);
        household = findViewById(R.id.household_battery);
        acid = findViewById(R.id.acid);
        camcorder = findViewById(R.id.camcorder);
        memory_card = findViewById(R.id.memory_card);
        dig_cam = findViewById(R.id.dig_camera);
        lens = findViewById(R.id.lens);
        dig_frame = findViewById(R.id.dig_frame);
        slr = findViewById(R.id.slr);

        slr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/slr";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        dig_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dig-frame";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        lens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/lens";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        dig_cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dig-cam";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        memory_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/memory-card";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        camcorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/camcorder";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        acid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/acid";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        household.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/household";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        button_battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/button-battery";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/car";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        ink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/ink";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/security";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/outdoor";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        portable_gps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/portable-gps";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        in_dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/in-dash";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        set_top_box.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/set-top-box";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        controller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/controller";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        keyboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/keyboard";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        portable_gaming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/portable-gaming";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        portable_lcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/portable-lcd";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/game";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        game_console.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/game-console";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        led_light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/led-light";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        fluorescent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/fluorescent";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        cfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/cfl";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        charger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/charger";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        alarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/alarm";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/mp3";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        dvd_cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dvd-cd";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        stereo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/stereo";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        pc_speaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/pc-speaker";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        speaker_system.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/speaker-system";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        tube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/tube";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        portable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/portable";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        lcd_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/lcd-tv";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        led_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/led-tv";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        plasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/plasma";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        servers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/servers";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        racks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/racks";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        hubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/hubs";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        switches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/switches";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        router.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/router";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        external_hd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/external-hd";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        iwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/iwatch";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/monitor";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        tablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/tablet";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        mice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/mice";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        fax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/fax";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        photocopier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/photocopier";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        scanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/scanner";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        printer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/printer";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        laptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/laptop";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++; }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0; }
                                        phone_number_combine [index] = response_split[i];
                                        index++; }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0; }
                                        notes_combine[index] = response_split[i];
                                        index++; }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0; }
                                        names_combine[index] = response_split[i];
                                        index++; } }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1); } },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show(); } });
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest); }
        });

        desktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/desktop";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/mobile-phone";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        landline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/landline";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/fan";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        uc_vacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/uc-vacuum";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        s_vacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/s-vacuum";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        r_vacuum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/r-vacuum";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        dehumidifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dehumidifier";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        microwave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/microwave";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/ac";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        stove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/kitchen-stove";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        dishwasher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dishwasher";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        washing_machine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/washing-machine";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        dryer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/dryer";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        freezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://user.tjhsst.edu/2020amanroa/freezer";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        fridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("fridge", "clicked");
                String url = "https://user.tjhsst.edu/2020amanroa/fridge";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });

        rechargeable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("rb", "clicked");
                String url = "https://user.tjhsst.edu/2020amanroa/rechargeable-battery";
                StringRequest stringRequest = new StringRequest(
                        Request.Method.GET,
                        url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                String[] response_split = response.split(";,");
                                String address_combine[] = new String[response_split.length/4 ];
                                String phone_number_combine[] = new String[response_split.length/4 ];
                                String notes_combine[] = new String[response_split.length/4];
                                String names_combine[] = new String[response_split.length/4];
                                int index = 0;
                                for (int i =0; i<response_split.length; i++){
                                    if (i < response_split.length/4){
                                        address_combine[index] = response_split[i];
                                        index ++;
                                    }
                                    else if (i >= response_split.length/4 && i < 2*response_split.length/4){
                                        if (i == response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        phone_number_combine [index] = response_split[i];
                                        index++;
                                    }
                                    else if (i >= 2*response_split.length/4 && i<3*response_split.length/4){
                                        if (i == 2*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        notes_combine[index] = response_split[i];
                                        index++;
                                    }
                                    else{
                                        if (i == 3*response_split.length/4 && index >0){
                                            index = 0;
                                        }
                                        names_combine[index] = response_split[i];
                                        index++;
                                    }
                                }
                                for (int j = 0; j< names_combine.length; j++){
                                    all_combine = all_combine + address_combine[j] + "&" + phone_number_combine[j] + "&" + notes_combine[j] + "&" + names_combine[j] + "%";
                                }
                                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                                intent.putExtra("message", all_combine);
                                startActivityForResult(intent, 1);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext(),
                                        error.toString(),
                                        Toast.LENGTH_LONG).show();
                            }
                        }
                );
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
                requestQueue.add(stringRequest);
            }
        });
    }
}