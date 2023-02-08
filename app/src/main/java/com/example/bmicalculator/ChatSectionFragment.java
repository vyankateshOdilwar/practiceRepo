//package com.example.bmicalculator;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.bmicalculator.databinding.FragmentChatSectionBinding;
//
//import java.util.ArrayList;
//
//
//public class ChatSectionFragment extends Fragment{
//
//   FragmentChatSectionBinding binding;
//    ArrayList<contactModel> arrContactsList = new ArrayList<>();
//
//    public ChatSectionFragment(){
//
//    }
//
////    @Override
////    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
////
////        binding =  FragmentChatSectionBinding.inflate(inflater,container,false);
////
////
////        RecyclerView recyclerView = findViewById(R.id.recycleContact);
////
////        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
////
////        arrContactsList.add(new contactModel(R.drawable.img1, "Clay Jhenson", "+1 555-555-555", "Online"));
////        arrContactsList.add(new contactModel(R.drawable.img2, "Hannah Baker", "+1 555-544-555", "Inactive"));
////        arrContactsList.add(new contactModel(R.drawable.img3, "Rayn Shaver", "+1 555-555-555", "Online"));
////
////
////        recyclerContactAdapter adapter = new recyclerContactAdapter(getContext(),arrContactsList);
////        binding.recyclerView.setAdapter(adapter);
////
////        return inflater.inflate(R.layout.fragment_chat_section, container, false);
////
////    }
//    
//    
//}
//

package com.example.bmicalculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bmicalculator.databinding.FragmentChatSectionBinding;

import java.util.ArrayList;


public class ChatSectionFragment extends Fragment implements ChatOnEachCardClick{

    private FragmentChatSectionBinding binding;
    private ArrayList<contactModel> arrContactsList = new ArrayList<>();

    public ChatSectionFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding =  FragmentChatSectionBinding.inflate(inflater,container,false);
        View view = binding.getRoot();

        RecyclerView recyclerView = binding.recycleContact;

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        arrContactsList.add(new contactModel(R.drawable.img1, "Clay Jhenson", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img2, "Hannah Baker", "+1 555-544-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Rayn Shaver", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Peter Parkor", "+1 809-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img5, "Peaky Blinder", "+1 123-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img9, "Clayn Helensky", "+1 555-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Jessica Devis", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Arthuro Rob", "+1 555-708-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img10, "Roy Denmark", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Andrino Robins", "+1 888-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img8, "Diesen Dawn", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img3, "Tylor Down", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img9, "Justin Folie", "+1 555-807-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img6, "Ray Tyson", "+1 555-555-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img8, "Corney Disoza", "+1 555-709-555", "Online"));
        arrContactsList.add(new contactModel(R.drawable.img10, "Brywn Barbar", "+1 555-555-555", "Inactive"));
        arrContactsList.add(new contactModel(R.drawable.img1, "Helena Stnlay", "+1 555-000-555", "Online"));


        recyclerContactAdapter adapter = new recyclerContactAdapter(getContext(),arrContactsList,this);
        binding.recycleContact.setAdapter(adapter);

        return view;

    }


    @Override
    public void onItemClicked(contactModel model) {
    String details = model.name+" is "+model.status;
        Toast.makeText(getContext(), details, Toast.LENGTH_SHORT).show();
    }
}
