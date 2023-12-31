package MyRadio.radioconexionchile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import MyRadio.radioconexionchile.databinding.FragmentSearchBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SearchFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SearchFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SearchFragment newInstance(String param1, String param2) {
        SearchFragment fragment = new SearchFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentSearchBinding binding = FragmentSearchBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        ImageView imageFacebook = binding.imageFacebook;
        ImageView imageYoutube = binding.imageYoutube;
        ImageView imageTikTok = binding.imageTiktok;
        ImageView imageInstagram = binding.imageInstagram;
        ImageView imageWsp = binding.imageWsp;

        imageFacebook.setOnClickListener(v -> {
            String facebookUrl = "https://www.facebook.com/conexionRadiochile?locale=es_ES%2F&_rdc=1&_rdr";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
            startActivity(intent);
        });

        imageYoutube.setOnClickListener(v -> {
            String youtubeUrl = "https://www.youtube.com/channel/UClm-Qr-2UbrDzc0fnnnwLwA";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl));
            startActivity(intent);
        });

        imageTikTok.setOnClickListener(v -> {
            String tikTokkUrl = "https://www.tiktok.com/@conexionradiochile";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(tikTokkUrl));
            startActivity(intent);
        });

        imageInstagram.setOnClickListener(v -> {
            String wspUrl = "https://www.instagram.com/conexion_radiochile/";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(wspUrl));
            startActivity(intent);
        });

        imageWsp.setOnClickListener(v -> {
            String instagramUrl = "https://api.whatsapp.com/send/?phone=56920766599&text&type=phone_number&app_absent=0";
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl));
            startActivity(intent);
        });


        return view;
    }
}