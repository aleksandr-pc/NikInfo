package com.developers.top.location2;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Pharmancy_zavodskiy extends Activity {
    private GoogleMap googleMap;

    private static final String RED = "B48";

    private GoogleApiClient client;

    public static final String MDV_TITLE = "Медицина для Вас";
    public static final String ANTsen = "Аптека низких цен/Благодия/Копейка";
    public static final String MedServiсe = "МедСервис";
    public static final String FitoApteka = "Фито Аптека";
    public static final String Econom_Apteka = "Эконом Аптека";
    public static final String Medtehnika_12_77_3 = "Медтехника 12";
    public static final String Medtehnika_Centr_Sluha = "Медтехника центр слуха";
    public static final String Medt_Shoss = "Медтехника";
    public static final String Medtehnika_life = "Медтехника Лайф";
    public static final String Medtehnika_Dobrota = "Медтехника Доброта";
    public static final String Bagaemo_Zdorovya = "Бажаемо здоровья";
    public static final String Apteca_36_6 = "Аптека 36,6";
    public static final String Apteca_Farmacia = "Аптека Фармация";
    public static final String Apteca_Falbi = "Аптека Фалби";
    public static final String Apteca_NoName = "Аптека";
    public static final String Vasha_Apteka = "Ваша Аптека";

    private static final LatLng CAMERA_INSTALL = new LatLng(46.95635534, 31.96944237);


    /*
        Медицина для вас 21
         */
    private static String WORK_TIME_21 = "Время работы: 8:00-21:00";
    private static String MDV_41_33_27 = "тел. (0512) 41-33-27. ";
    private static String MDV_46_22_60 = "тел. (0512) 46-22-60. ";
    private static String MDV_46_20_46 = "тел. (0512) 46-20-46. ";
    private static String MDV_46_20_46_CENTR_27 = "тел. (0512) 46-20-46. ";
    /*
        Медицина для вас 20
         */
    private static String WORK_TIME_20 = "Время работы: 8:00-20:00";
    private static String MDV_40_09_76 = "тел. (0512) 41-09-76. ";
    private static String MDV_44_02_39 = "тел. (0512) 44-02-39. ";
    private static String MDV_40_53_37 = "тел. (0512) 40-53-37. ";
    private static String MDV_67_01_71 = "тел. (0512) 67-01-71. ";

    /*
        Медицина для вас 19
         */
    private static String WORK_TIME_19 = "Время работы: 8:00-19:00";
    private static String MDV_47_40_30 = "тел. (0512) 47-40-30. ";
    private static String MDV_47_17_68_CENTR_28 = "тел. (0512) 47-17-68. ";
    /*
                Медицина для вас 16
                 */
    private static String WORK_TIME_16 = "Время работы: 8:00-16:00";
    private static String MDV_47_77_37 = "тел. (0512) 47-77-37. ";

    /*
    Аптека низких цен 20
     */
    private static String ANTsen_57_45_04 = "тел. (0512)-58-45-04 /58-45-03. ";
    private static String ANTsen_58_46_64 = "тел. (0512)-58-46-64. ";
    private static String ANTsen_59_49_24 = "тел. (0512)-59-49-24. ";
    /*
       Аптека низких цен 19
        */
    private static String ANTsen_58_46_99 = "тел. (0512)-58-46-99. ";
    private static String ANTsen_67_06_69 = "тел. (0512)-67-06-69. ";

    /*
    медсервис круглосуточно
     */
    private static String WORK_TIME_FULL_TIME = "Время работы: КРУГЛОСУТОЧНО ";
    private static String MedService_46_20_77 = "тел. (0512)-46-20-77. ";
    private static String MedService_40_36_98 = "тел. (0512)-40-36-98. ";
    private static String MedService_40_47_20 = "тел. (0512)-40-47-20. ";

    /*
    Фитоаптека 19
     */
    private static String FitoApteka_40_41_42 = "тел. (0512) 40-41-42, (067) 758-70-24. ";
    /*
    Эконом аптека
     */
    private static String Ekonom_Apteka_067_35_63 = "тел. (067)-631-35-63. ";
    private static String Ekonom_Apteka_ = "тел. (0--)----------. ";

    /*
    Медтехника
     */
    private static String WORK_TIME_Medt_Shoss = "Вр.раб.: пн.-пт. 9-17, суб. 9-15, вс.вых. ";
    private static String Medtehnika_Shoss_36_23_56 = "тел. (0512)-36-23-56. ";
    /*
  Медтехника центр слуха
     */
    private static String Medt_CEN_SL_36_23_56 = "тел. (0512)-36-23-56. ";
    private static String Work_time_Medt_CEN_SL = "         ";

    /* Медтехника 12
             */
    private static String WORK_TIME_Medt_12_141 = "Вр.раб.: пн.-пт. 9-18, суб. 9-15, вс.вых. ";
    private static String Medt_12_141_46_49_52 = "тел. (0512)-46-49-52. ";

    private static String WORK_TIME_Medt_12_77_3 = "Вр.раб.: ";
    private static String Medt_12_77_3_47_84_68 = "тел. (0512)-47-84-68. ";

    /* Медтехника ЛАЙФ
    */
    private static String WORK_TIME_Medtehnika_life = "Вр. раб.: пн.-пт. 9-17, сб.-вс.: 10-15. ";
    private static String Medtehnika_life_47_22_79 = "тел. (0512)-47-22-79. ";

    /* Медтехника доброта
    */
    private static String WORK_TIME_Medtehnika_Dobrota = "Вр. раб.: пн.-пт. 8-17, сб.8-15. вс. вых. ";
    private static String Medtehnika_Dobrota_40_47_77 = "тел. (0512)-40-47-77. ";

    /*
     Bagaemo_Zdorovya = "Бажаемо здоровья"
     */
    private static String WORK_TIME_Bagaemo_Zdorovya = "Время работы: пн.-пт. 08-21. ";
    private static String Bagaemo_Zdorovya_44_03_04 = "тел. (0512)-44-03-04. ";
    private static String Bagaemo_Zdorovya_40_44_23 = "тел. (0512)-40-44-23. ";

    /*
     Apteka_36.6
     */
    private static String Apteka_36_6_44_03_04 = "тел. (0512)-34-31-01. ";

    /*
    Аптека № 9 "Фармация"
     */
    private static String Apteka_Farmacia_34_61_66 = "тел. (0512)-34-61-66. ";
    private static String Apteka_Farmacia_41_36_09 = "тел. (0512)-42-36-09. ";
    /*
   Аптека Фалби"
    */
    private static String Apteka_Falbi_47_44_63 = "тел. (0512)-47-44-63. ";
    /*
        Ваша Аптека
    */
    private static String Vasha_Apteka_41_36_09 = "тел. (0512)-41-36-09. ";

    /*
    Аптека
     */
    private static String Apteka_NoName_45_16_91 = "тел. (0512)-46-16-91. ";
    private static String Apteka_NoName_2 = "тел.  ";
    private static String Apteka_NoName_3 = "тел.  ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pharmancy);
        createMapView();
        addMarker();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        googleMap.setMyLocationEnabled(true);

    }

    private void createMapView() {

        try {
            if (null == googleMap) {
                googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                        R.id.mapView)).getMap();


                if (null == googleMap) {
                    Toast.makeText(getApplicationContext(),
                            "Error creating map", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (NullPointerException exception) {
            Log.e("mapApp", exception.toString());
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CAMERA_INSTALL, 13));
        googleMap.setMapType(googleMap.MAP_TYPE_NORMAL);
    }


    private void addMarker() {
                /*
                   RED - круглосуточно
                   HUE_ROSE - работает до 21
                   HUE_GREEN - работает до 20
                   HUE_BLUE - работает до 19
                   HUE_AZURE - работает до 17
                */

        if (null != googleMap) {

             /*
        Медицина для вас 21
         */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9503091, 31.9410635))
                    .title(MDV_TITLE)
                    .snippet(MDV_41_33_27 + WORK_TIME_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.968874, 31.963932))
                    .title(MDV_TITLE)
                    .snippet(MDV_46_22_60 + WORK_TIME_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.968687, 31.9667725))
                    .title(MDV_TITLE)
                    .snippet(MDV_46_20_46 + WORK_TIME_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9675767, 31.97411746))
                    .title(MDV_TITLE)
                    .snippet(MDV_46_20_46_CENTR_27 + WORK_TIME_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );
         /*
        Медицина для вас 20
         */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9524502, 31.9451966))
                    .title(MDV_TITLE)
                    .snippet(MDV_40_09_76 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96199, 31.9502476))
                    .title(MDV_TITLE)
                    .snippet(MDV_44_02_39 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.946935, 31.940779))
                    .title(MDV_TITLE)
                    .snippet(MDV_40_53_37 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9514515, 31.9354381))
                    .title(MDV_TITLE)
                    .snippet(MDV_67_01_71 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );
/*
        Медицина для вас 19
         */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.960058, 32.000198))
                    .title(MDV_TITLE)
                    .snippet(MDV_47_77_37 + WORK_TIME_19)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.968124, 31.974928))
                    .title(MDV_TITLE)
                    .snippet(MDV_47_17_68_CENTR_28 + WORK_TIME_19)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            );
            /*
            Медицина для вас 16
                    */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9652345, 31.9754205))
                    .title(MDV_TITLE)
                    .snippet(MDV_47_40_30 + WORK_TIME_16)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
            );

            /* Аптека низких цен 20
                    */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.950899, 31.942586))
                    .title(ANTsen)
                    .snippet(ANTsen_57_45_04 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9651941, 31.995913))
                    .title(ANTsen)
                    .snippet(ANTsen_58_46_64 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9519989, 31.9437049))
                    .title(ANTsen)
                    .snippet(ANTsen_59_49_24 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            /* Аптека низких цен 19
                    */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96685, 31.974135))
                    .title(ANTsen)
                    .snippet(ANTsen_58_46_99 + WORK_TIME_19)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96771362, 31.97185701))
                    .title(ANTsen)
                    .snippet(ANTsen_67_06_69 + WORK_TIME_19)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            );

            /* МЕДСЕРВИС круглосуточно
                    */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96758, 31.972431))
                    .title(MedServiсe)
                    .snippet(MedService_46_20_77 + WORK_TIME_FULL_TIME)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.956031, 31.958303))
                    .title(MedServiсe)
                    .snippet(MedService_40_36_98 + WORK_TIME_FULL_TIME)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.950899, 31.942586))
                    .title(MedServiсe)
                    .snippet(MedService_40_47_20 + WORK_TIME_FULL_TIME)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
            );
/*
        Фитоаптека 19
 */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.955272, 31.9516055))
                    .title(FitoApteka)
                    .snippet(FitoApteka_40_41_42 + WORK_TIME_19)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
            );

            /*
        Эконом Аптека
            */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.95166817, 31.94180502))
                    .title(Econom_Apteka)
                    .snippet(Ekonom_Apteka_067_35_63 + WORK_TIME_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9677396, 31.97155461))
                    .title(Econom_Apteka)
                    .snippet(Ekonom_Apteka_ + WORK_TIME_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );
            /*
            Медтехника
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.97354793, 31.96622114))
                    .title(Medt_Shoss)
                    .snippet(Medtehnika_Shoss_36_23_56 + WORK_TIME_Medt_Shoss)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
            );

            /*
            Медтехника центр слуха
             */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.97287493, 31.96671476))
                    .title(Medtehnika_Centr_Sluha)
                    .snippet(Medt_CEN_SL_36_23_56 + Work_time_Medt_CEN_SL)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
            /*
            Медтехника 12
             */
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.965248, 32.007839))
                    .title(Medtehnika_12_77_3)
                    .snippet(Medt_12_141_46_49_52 + WORK_TIME_Medt_12_141)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.966409, 31.990695))
                    .title(Medtehnika_12_77_3)
                    .snippet(Medt_12_77_3_47_84_68 + WORK_TIME_Medt_12_77_3)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

            /*
            Медтехника лайф
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96802514, 31.97645232))
                    .title(Medtehnika_life)
                    .snippet(Medtehnika_life_47_22_79 + WORK_TIME_Medtehnika_life)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

             /*
            Медтехника доброта
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.95283764, 31.94438794))
                    .title(Medtehnika_Dobrota)
                    .snippet(Medtehnika_Dobrota_40_47_77 + WORK_TIME_Medtehnika_Dobrota)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
             /*
            Бажаемо здоровья
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96431854, 31.95147827))
                    .title(Bagaemo_Zdorovya)
                    .snippet(Bagaemo_Zdorovya_44_03_04 + WORK_TIME_Bagaemo_Zdorovya)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9558234, 31.9532715))
                    .title(Bagaemo_Zdorovya)
                    .snippet(Bagaemo_Zdorovya_40_44_23 + WORK_TIME_Bagaemo_Zdorovya)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            /*
            аптека 36,6
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.963403, 31.951717))
                    .title(Apteca_36_6)
                    .snippet(Apteka_36_6_44_03_04)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
            /*
                Аптека № 9 "Фармация"
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.967891, 31.9662795))
                    .title(Apteca_Farmacia)
                    .snippet(Apteka_Farmacia_34_61_66)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9501775, 31.9418195))
                    .title(Apteca_Farmacia)
                    .snippet(Apteka_Farmacia_41_36_09)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

            /*
                Аптека Фалби"
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9677255, 31.9685206))
                    .title(Apteca_Falbi)
                    .snippet(Apteka_Falbi_47_44_63)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
            /*
                Аптека Ваша
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9666515, 31.9854245))
                    .title(Vasha_Apteka)
                    .snippet(Vasha_Apteka_41_36_09)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

            /*
                Аптека
             */

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9668705, 31.9732059))
                    .title(Apteca_NoName)
                    .snippet(Apteka_NoName_45_16_91)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.956558, 31.9596429))
                    .title(Apteca_NoName)
                    .draggable(true)
                    .snippet(Apteka_NoName_3)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.95973115, 31.95393384))
                    .title(Apteca_NoName)
                    .draggable(true)
                    .snippet(Apteka_NoName_2)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
            );
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Pharmancy Page", // TODO: Define a title for the content shown.
                Uri.parse("http://host/path"),
                Uri.parse("android-app://com.developers.top.location2/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Pharmancy Page", // TODO: Define a title for the content shown.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.developers.top.location2/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}