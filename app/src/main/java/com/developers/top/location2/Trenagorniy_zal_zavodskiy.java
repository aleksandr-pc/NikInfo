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

public class Trenagorniy_zal_zavodskiy extends Activity {
    private GoogleMap googleMap;

    private static final String RED = "B48";

    private GoogleApiClient client;

    public static final String DANCE_STYLE = "DANCE-STYLE";
    public static final String DIROM_SPORT = "DIROM SPORT";
    public static final String INVASPORT = "ИНВАСПОРТ";
    public static final String MYRAVEI = "Муравей";
    public static final String MAN = "МЭН (MAN)";
    public static final String SOVERCHENSTVO = "СОВЕРШЕНСТВО";
    public static final String FITNESS_CLUB_START = "Фитнес-клуб Старт";
    public static final String CSZ = "ЧСЗ";
    public static final String ENERGY = "ЭНЕРГИЯ";
    public static final String SPRINT = "Спринт";
    public static final String FINTESS_CLUB_START = "Фитнес-клуб Старт";
    public static final String HEALTH_FACTORY = "Фабрика здороья";
    public static final String MNU = "Тренажерный зал при МНУ";
    public static final String FOC_NAMIV = "ФОК Намыв";


    private static final LatLng CAMERA_INSTALL = new LatLng(46.95635534, 31.96944237);


    /*
        Фитес клубы
         */
    private static String WORK_TIME_8_21 = "Время работы: 8:00-21:00";
    private static String WORK_TIME_7_30_22 = "Время работы: 7:30-22:00";
    private static String WORK_TIME_9_22 = "Время работы: 9:00-22:00";
    private static String WORK_TIME_7_20 = "Время работы: 7:00-20:00";
    private static String WORK_TIME_MYRAVEI = "Вр. раб.:пн.-пт. 8:00-21:00, суб.8:00-18:00";
    private static String WORK_TIME_FINTESS_CLUB_START = "Вр. раб.:пн.-пт. 9:00-21:00, суб.9:00-18:00";
    private static String WORK_TIME_DANCE_STYLE = "Вр. раб.:пн.-пт. 8-22, суб.8-21, вс. 10-18";


    private static String DANCE_STYLE_47_64_62 = "тел. (0512)-47-64-62, (063)-595-24-21. ";
    private static String DIROM_SPORT_50_10_30 = "тел. (0512)-50-10-31; (093)-874-42-20. ";
    private static String INVASPORT_36_70_54 = "тел. (0512)-36-70-54. ";
    private static String MYRAVEI_40_07_63 = "тел. (0512)-40-07-63. ";
    private static String MAN_76_59_43 = "тел. (0512)-76-59-43. ";
    private static String SOVERCHENSTVO_47_14_86 = "тел. (0512)-47-14-86. ";
    private static String FITNESS_CLUB_START_46_01_49 = "тел. (0512)-46-01-49. ";
    private static String CSZ_34_31_60 = "тел. (0512)-34-31-60. ";
    private static String ENERGY_40_38_55 = "тел. (0512)-40-38-55. ";
    private static String SPRINT_25_71_08 = "тел. (0512)-25-71-08. ";
    private static String FINTESS_CLUB_START_44_08_87 = "тел. (0512)-44-08-87. ";
    private static String HEALTH_FACTORY_44_14_45 = "тел. (0512)-44-14-45. ";
    private static String MNU_76_99_48 = "тел. (0512)-76-99-48. ";
    private static String FOC_NAMIV_41_28_14 = "тел. (0512)-41-28-14. ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trenag_zavodskiy);
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
                    .position(new LatLng(46.95916613, 31.9847129))
                    .title(DANCE_STYLE)
                    .snippet(DANCE_STYLE_47_64_62 + WORK_TIME_DANCE_STYLE)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.96211826, 31.94949741))
                    .title(DIROM_SPORT)
                    .snippet(DIROM_SPORT_50_10_30 + WORK_TIME_7_30_22)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.975938, 46.975938))
                    .title(INVASPORT)
                    .snippet(INVASPORT_36_70_54 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9571417, 31.9528864))
                    .title(MYRAVEI)
                    .snippet(MYRAVEI_40_07_63 + WORK_TIME_MYRAVEI)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9710419, 31.969172))
                    .title(MAN)
                    .snippet(MAN_76_59_43 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9710419, 31.969172))
                    .title(MAN)
                    .snippet(MAN_76_59_43 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9779905, 31.97851628))
                    .title(SOVERCHENSTVO)
                    .snippet(SOVERCHENSTVO_47_14_86 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9688816, 31.9695641))
                    .title(FINTESS_CLUB_START)
                    .snippet(FINTESS_CLUB_START_44_08_87 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.95478087, 31.95578992))
                    .title(CSZ)
                    .snippet(CSZ_34_31_60 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.95341, 31.951522))
                    .title(ENERGY)
                    .snippet(ENERGY_40_38_55 + WORK_TIME_9_22)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.949434, 31.9913444))
                    .title(SPRINT)
                    .snippet(SPRINT_25_71_08 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.969312, 31.964396))
                    .title(FINTESS_CLUB_START)
                    .snippet(FITNESS_CLUB_START_46_01_49 + WORK_TIME_FINTESS_CLUB_START)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.960084, 31.952378))
                    .title(HEALTH_FACTORY)
                    .snippet(HEALTH_FACTORY_44_14_45 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.965503, 31.960333))
                    .title(MNU)
                    .snippet(MNU_76_99_48 + WORK_TIME_7_20)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
            );

            googleMap.addMarker(new MarkerOptions()
                    .position(new LatLng(46.9508604, 31.937123))
                    .title(FOC_NAMIV)
                    .snippet(FOC_NAMIV_41_28_14 + WORK_TIME_8_21)
                    .draggable(true)
                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
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
