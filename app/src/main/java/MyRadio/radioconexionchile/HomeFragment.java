package MyRadio.radioconexionchile;

import android.media.MediaPlayer;
import android.media.browse.MediaBrowser;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.IOException;

import MyRadio.radioconexionchile.databinding.FragmentHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    ImageView imgGlide;
    String radioChile = "https://i.postimg.cc/0yTTs0Tr/conexion-Radio-Chile.png";
    String club90 = "https://conexionradiochile.cl/wp-content/uploads/2023/05/2.png";

    String peloSuelto = "https://conexionradiochile.cl/wp-content/uploads/2023/05/3.png";

    String cancionesLejanas = "https://conexionradiochile.cl/wp-content/uploads/2023/05/4.png";

    String conexionRetro = "https://i.postimg.cc/7ZcrskPv/conexionretro.png";

    String flasBack = "https://conexionradiochile.cl/wp-content/uploads/2023/05/6.png";

    String superCanciones = "https://conexionradiochile.cl/wp-content/uploads/2023/05/7.png";

    String rememberTime = "https://conexionradiochile.cl/wp-content/uploads/2023/05/8.png";

    String salvoConducto = "https://conexionradiochile.cl/wp-content/uploads/2023/05/9.png";

    String nocheClasicos = "https://conexionradiochile.cl/wp-content/uploads/2023/05/1-1.png";


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        FragmentHomeBinding binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        imgGlide = binding.imageRadio;

        Glide.with(this).load(radioChile).into(imgGlide);

        imgGlide = binding.imageClub90;
        Glide.with(this).load(club90).into(imgGlide);

        imgGlide = binding.imagePeloSuelto;
        Glide.with(this).load(peloSuelto).into(imgGlide);

        imgGlide = binding.imageCancionesLejanas;
        Glide.with(this).load(cancionesLejanas).into(imgGlide);

        imgGlide = binding.imageConexionRetro;
        Glide.with(this).load(conexionRetro).into(imgGlide);

        imgGlide = binding.imageFlashBack;
        Glide.with(this).load(flasBack).into(imgGlide);

        imgGlide = binding.imageSuperCanciones;
        Glide.with(this).load(superCanciones).into(imgGlide);

        imgGlide = binding.imageRememberTime;
        Glide.with(this).load(rememberTime).into(imgGlide);

        imgGlide = binding.imageSalvoConducto;
        Glide.with(this).load(salvoConducto).into(imgGlide);

        imgGlide = binding.imageNocheClasicos;
        Glide.with(this).load(nocheClasicos).into(imgGlide);


        Button buttonPlay = binding.buttonPlay;
        buttonPlay.setOnClickListener(view1 -> {
            String radioStreamingUrl = "https://sonic.streamingchilenos.com/8208/stream";

            MediaPlayer mediaPlayer = new MediaPlayer();
            try {
                mediaPlayer.setDataSource(radioStreamingUrl);
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        return view;


    }
}