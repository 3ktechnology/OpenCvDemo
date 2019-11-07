/*
package com.example.opencvdemo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvException;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;

import static android.view.Surface.ROTATION_0;
import static android.view.Surface.ROTATION_180;
import static android.view.Surface.ROTATION_270;
import static android.view.Surface.ROTATION_90;

public class temp {

    package com.example.opencvdemo;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.hardware.Camera;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.android.OpenCVLoader;
import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.CvException;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;
import java.util.List;

import static android.view.Surface.ROTATION_0;
import static android.view.Surface.ROTATION_180;
import static android.view.Surface.ROTATION_270;
import static android.view.Surface.ROTATION_90;

    public class MainActivity extends AppCompatActivity implements CameraBridgeViewBase.CvCameraViewListener2  {
        private JavaCameraView javaCameraView;
        private ImageView imageView;
        private Mat mGBA,mGBAT;
        private DrawRect drawRect;

        private Mat mRgba, mRgbaT, mRgbaF;
        private Mat mIntermediateMat;
        private Mat mGray;
        private Rect roi;
        private String TAG="TAG";
        private Bitmap bitmap;



   */
/* static Surface{
        ROTATION_0,
        ROTATION_90,
        ROTATION_180,
        ROTATION_270
    }*//*






        BaseLoaderCallback baseLoaderCallback = new BaseLoaderCallback(this) {
            @Override
            public void onManagerConnected(int status) {
                switch (status) {
                    case BaseLoaderCallback.SUCCESS:
                        javaCameraView.enableView();
                        break;
                    default:
                        super.onManagerConnected(status);
                        break;
                }

            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
            setContentView(R.layout.activity_main);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 1);
                }

            }
            javaCameraView = (JavaCameraView) findViewById(R.id.java_camera);
            imageView = (ImageView) findViewById(R.id.image);
            javaCameraView.setVisibility(SurfaceView.VISIBLE);
            javaCameraView.setCvCameraViewListener(this);
//        javaCameraView.set(Highgui.CV_CAP_PROP_FRAME_WIDTH, 1000);
//        javaCameraView.set(Highgui.CV_CAP_PROP_FRAME_HEIGHT, 800);

//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

//        Point size = new Point();
//        getWindowManager().getDefaultDisplay(). getSize(size);
//        int width = size. x;
//        int height = size. y;
//        Log.d(TAG, "onCreate: "+"width : "+width+"hight : "+
//                height);

            javaCameraView.setMinimumHeight(1080);
            javaCameraView.setMinimumHeight(1776);

//        javaCameraView.setMaxFrameSize(width, height);
//        roi = new Rect(300, 550, 500, 100);

        }

        @Override
        public void onCameraViewStarted(int width, int height) {
            mRgba = new Mat(height, width, CvType.CV_8UC4);
            mRgbaF = new Mat(height, width, CvType.CV_8UC4);
            mRgbaT = new Mat(width, width, CvType.CV_8UC4);

//        mRgba = new Mat(height, width, CvType.CV_8UC4);
//        mIntermediateMat = new Mat(height, width, CvType.CV_8UC4);
            mGray = new Mat(height, width, CvType.CV_8UC1);

//
       */
/* mGBA =new Mat(height,width, CvType.CV_8UC4);
        mGBAT =new Mat(height,width, CvType.CV_8UC4);
        drawRect = new DrawRect(this);
        drawRect.setBackgroundColor(Color.BLUE);*//*



        }

        @Override
        public void onCameraViewStopped() {
       */
/* mRgba.release();
        mGray.release();
        mIntermediateMat.release();*//*


            mRgba.release();
            mRgbaF.release();
            mRgbaT.release();
            mGray.release();

//        mGBA.release();
//        mGBAT.release();

        }
        public native void doWithMat(long matAddrGr, long matAddrRgba);


        @Override
        public Mat onCameraFrame(CameraBridgeViewBase.CvCameraViewFrame inputFrame) {
//        mRgba = inputFrame.rgba();
//        mGray = inputFrame.gray();
//        Core.flip(mRgba,mIntermediateMat,0);
//        Imgproc.resize(mRgba.t(), mIntermediateMat, mRgba.size());
//        doWithMat(mGray.getNativeObjAddr(), mRgba.getNativeObjAddr());
//        return mRgba;

//        return new Mat(inputFrame.rgba(), roi);
            */
/**
             * working without crash
             *//*

        */
/*//*
/ TODO Auto-generated method stub
        mRgba = inputFrame.rgba();
        // Rotate mRgba 90 degrees
        Core.transpose(mRgba, mRgbaT);
        Imgproc.resize(mRgbaT, mRgbaF, mRgbaF.size(), 0,0, 0);
        Core.flip(mRgbaF, mRgba, 1 );

        return mRgba;*//*
 // This function must return


   */
/*     mGBA = inputFrame.rgba();
//        mGBA.locateROI();
        mGBAT = mGBA.t();
        Core.flip(mGBA.t(),mGBAT,1);
        Imgproc.resize(mGBAT,mGBAT,mGBA.size());*//*


//        Imgproc.
//        Imgproc.resize(mGBAT,mGBAT,new Size(100,500));
//        mGBA.release();



//        System.gc();

//        return mGBAT;



//        Mat edges = new Mat();
//        Imgproc.cvtColor(mGBA, edges, Imgproc.COLOR_BGR2GRAY);
//        Imgproc.GaussianBlur(edges, edges, new Size(1, 1), 0);
//        Imgproc.Canny(edges, edges, 10, 30);
//        return edges;


//        Mat mat = inputFrame.gray();
//        mat.locateROI(mat.size(),);
            mRgba = inputFrame.rgba();
            mGray = inputFrame.gray();
//        Log.d(TAG, "onCameraFrame: "+  convertMatToBitMap(mRgbaT));
//        imageView.setImageBitmap(convertMatToBitMap(mRgba));


            Mat edge = edgeDetection(mRgba);
            Mat maxContour;
//        double maxContourArea = edge;
//        Log.d(TAG, "onCameraFrame: "+edge);


            List<MatOfPoint> contours= new ArrayList<MatOfPoint>();
            List<RotatedRect> boundingRects = new ArrayList<>();
            List<Rect> rectsOnSourcemat = new ArrayList<>();

            int topLeftX=0,topLeftY =0;


            Imgproc.findContours(mGray, contours, new Mat(), Imgproc.RETR_LIST, Imgproc.CHAIN_APPROX_SIMPLE);
//        Log.d(TAG, "onCameraFrame: "+contours.size());
//        Imgproc.rectangle(mRgba, new Point(200.0, 100.0), new Point(800.0, 400.0), new Scalar(255, 255, 0),5);


            for (MatOfPoint contour : contours) {
                MatOfPoint2f areaPoints = new MatOfPoint2f(contour.toArray());
                RotatedRect boundingRect = Imgproc.minAreaRect(areaPoints);

//            Point rotated_rect_points[] = new Point[4];
//            boundingRect.points(rotated_rect_points);


    */
/*        Rect roiRect = Imgproc.boundingRect(contour);
//            Rect roiRect = Imgproc.boundingRect(mRgba);
            Mat roiSubmat = mRgba.submat(roiRect);*//*


                double rectangleArea = boundingRect.size.area();

                // test min ROI area in pixels
                if (rectangleArea > 400) {
                    Point rotated_rect_points[] = new Point[4];
                    boundingRect.points(rotated_rect_points);

                    Rect rect = Imgproc.boundingRect(new MatOfPoint(rotated_rect_points));
//                Imgproc.rectangle(roiSubmat, rect.tl(), rect.br(),  new Scalar(255, 255, 0), 5);

                    // test horizontal ROI orientation
                    if (rect.width > rect.height) {
                        Imgproc.rectangle(mRgba, rect.tl(), rect.br(),  new Scalar(135, 255, 255), 5);
                    }
                }


       */
/*     for (int ixPoint = 0; ixPoint < 4; ixPoint++) {
                rotated_rect_points[ixPoint].x += topLeftX;
                rotated_rect_points[ixPoint].y += topLeftY;
            }

            // crate bounding rect for sourceMat
            Rect rect = Imgproc.boundingRect(new MatOfPoint(rotated_rect_points));
            rectsOnSourcemat.add(rect);

//                Imgproc.rectangle(roiSubmat, rect.tl(), rect.br(),  new Scalar(255, 255, 0), 5);

            // test horizontal ROI orientation
            if (rect.width > rect.height) {
                Imgproc.rectangle(mRgba, rect.tl(), rect.br(),  new Scalar(135, 255, 255), 5);
            }*//*


            }

//        roiBitmap = Bitmap.createBitmap(sourceMat.cols(), sourceMat.rows(), Bitmap.Config.ARGB_8888);
//        Utils.matToBitmap(sourceMat, roiBitmap);

        */
/*for (int idx = 0; idx < contours.size(); idx++)
        {
            MatOfPoint contour = contours.get(idx);
            maxContour = contours.get(idx);

            double contourarea = Imgproc.contourArea(contour);
            if (contourarea > maxContourArea)
            {
                maxContour = contour;
                maxContourArea = contourarea;
                maxAreaIdx = idx;
            }
        }

        points_contour = maxContour.toArray();
        nbPoints = points_contour.length;

        for(int i=0; i< nbPoints;i++)
        {
            Point v=points_contour[i];
        }*//*







            switch (javaCameraView.getDisplay().getRotation()) {
                case ROTATION_0: // Vertical portrait
                    Core.transpose(mRgba, mRgbaT);
                    Imgproc.resize(mRgbaT, mRgbaF, mRgbaF.size(), 0,0, 0);
                    Core.flip(mRgbaF, mRgba, 1);
                    break;
                case ROTATION_90: // 90° anti-clockwise
                    break;
                case ROTATION_180: // Vertical anti-portrait
                    Core.transpose(mRgba, mRgbaT);
                    Imgproc.resize(mRgbaT, mRgbaF, mRgbaF.size(), 0,0, 0);
                    Core.flip(mRgbaF, mRgba, 0);
                    break;
                case ROTATION_270: // 90° clockwise
                    Imgproc.resize(mRgba, mRgbaF, mRgbaF.size(), 0,0, 0);
                    Core.flip(mRgbaF, mRgba, -1);
                    break;
                default:
            }
            return mRgba;
        }



        private Mat edgeDetection(Mat src) {
            Mat edges = new Mat();
            Imgproc.cvtColor(src, edges, Imgproc.COLOR_BGR2GRAY);
            Imgproc.GaussianBlur(edges, edges, new Size(5, 5), 0);
            Imgproc.Canny(edges, edges, 10, 30);
            return edges;
        }

        @Override
        protected void onPause() {
            super.onPause();
            if(javaCameraView!= null){
                javaCameraView.disableView();
            }
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            if(javaCameraView!= null){
                javaCameraView.disableView();
            }
        }

        @Override
        protected void onResume() {
            super.onResume();
            if (OpenCVLoader.initDebug()) {
                Toast.makeText(this, "Succesfull", Toast.LENGTH_SHORT).show();
                baseLoaderCallback.onManagerConnected(BaseLoaderCallback.SUCCESS);
            } else {
                Toast.makeText(this, "failed to load", Toast.LENGTH_SHORT).show();
                OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_4_0,this,baseLoaderCallback);
            }
        }
        private static Bitmap convertMatToBitMap(Mat input){
            Bitmap bmp = null;
            Mat rgb = new Mat();
            Imgproc.cvtColor(input, rgb, Imgproc.COLOR_BGR2RGB);

            try {
                bmp = Bitmap.createBitmap(rgb.cols(), rgb.rows(), Bitmap.Config.ARGB_8888);
                Utils.matToBitmap(rgb, bmp);
            }
            catch (CvException e){
                Log.d("Exception",e.getMessage());
            }
            return bmp;
        }


    }

}
*/
