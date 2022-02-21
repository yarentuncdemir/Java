package com.company;

public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBucket){
        if (width<=0||height<=0||areaPerBucket<=0||extraBucket<0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        numOfBuckets=numOfBuckets-extraBucket;


        return numOfBuckets;


    }
    public static int getBucketCount(double width,double height,double areaPerBucket){
        if (width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);


        return numOfBuckets;

    }
    public static int getBucketCount(double width,double height){
        if (width<=0||height<=0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil((width * height));


        return numOfBuckets;
    }
}
